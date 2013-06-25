/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SMSIndividual {

    public String user;
    public String password;
    public String destinatario;
    public String mensagem;

    public SMSIndividual(String Usuario, String Senha, String Num, String Msg) throws Exception {
        super();
        this.user = Usuario;
        this.password = Senha;
        this.destinatario = Num;
        this.mensagem = Msg;
        SMSIndividual.EnviaSMS(Usuario, Senha, Num, Msg);

    }

    public static void EnviaSMS(String Usuario, String Senha, String Num, String Msg) throws Exception {

        String urlParameters = "user=" + Usuario
                + "&password=" + Senha
                + "&destinatario=" + Num
                + "&msg=" + URLEncoder.encode(Msg, "UTF-8");
        URL url = new URL("http://www.facilitamovel.com/api/simpleSend.ft?");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setInstanceFollowRedirects(false);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("charset", "utf-8");
        connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
        connection.setUseCaches(false);

        OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
        wr.write(urlParameters);
        wr.flush();

        BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer strRet = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            strRet.append(line);
        }
        wr.close();
        rd.close();

        System.out.println("Retorno da Chamada HTTP:" + strRet);

        String retorno = strRet.substring(0, 1);

        switch (retorno) {
            case "1": {
                JOptionPane.showMessageDialog(null, "Mensagem Enviada com Sucesso");
            }
        }




    }
}
