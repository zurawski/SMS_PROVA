/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

public class SMSConsultaCredito {

    public String user;
    public String password;

    public SMSConsultaCredito(String Usuario, String Senha) throws Exception {
        super();
        this.user = Usuario;
        this.password = Senha;
        SMSConsultaCredito.ConsultaCredito(Usuario, Senha);

    }

    public static void ConsultaCredito(String Usuario, String Senha) throws Exception {

        String urlParameters = "user=" + Usuario
                + "&password=" + Senha;
        URL url = new URL("http://www.facilitamovel.com/api/checkCredit.ft?");

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
        String creditos = strRet.substring(2);
        JOptionPane.showMessageDialog(null, "Crédito Disponível: " + creditos);
    }
}
