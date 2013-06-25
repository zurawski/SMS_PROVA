package conexao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TesteConexao {

    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/SMS", "postgres", "senacrs");

        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM CONTATOS");

        System.out.printf("Contas\n=====\n");

        while (rs.next()) {
            int x = rs.getInt("id");
            String nome = null;
            nome = rs.getString("nome");
            System.out.printf("%d - %s", x, nome);

        }
        
        stmt.executeQuery("insert into USUARIOS(nome,senha,acesso) values('sms','123','total')");
    }
}
