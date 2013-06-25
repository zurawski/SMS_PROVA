package dados;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SMSDAO {
    /*
     * Inserts nas Tabelas
     */

    private static final String insertRegistraSMS = "insert into MENSAGENS_ENVIADAS(Numero_Enviado,Pessoa_Enviou,Status_Retorno_Msg,Data_Envio,Hora_Envio) values(?,?,?,?,?)";
    private static final String insertModelosSMS = "insert into MODELO_MENSAGEM(Nome_Modelo,Msg) values(?,?)";
    private static final String insertGruposSMS = "insert into GRUPOS(Nome) values(?)";
    private static final String insertContatosSMS = "insert into CONTATOS(Numero,Nome) values(?,?)";
    private static final String insertContatosGruposSMS = "insert into GRUPOS_CONTATOS(ID_Grupo,ID_Contato) values(?,?)";
    private static final String insertUsuario = "insert into USUARIOS(cpf,nome,senha,acesso,email) values (?,?,?,?,?)";
    /*
     *   Updates nas Tabelas
     */
    private static final String updateModeloSMS = "update CONTATOS set Msg = ?, Nome_Modelo = ? where Nome_Modelo like(?)";
    private static final String updateContatoPorNome = "update CONTATOS set Numero = ?, Nome = ? where ID = ?";
    private static final String updateGrupoSMS = "update GRUPOS set Nome = ? where Nome = ?";
    /*
     *   Deletes nas Tabelas
     */
    /*
     * Selects
     */
    private static final String getUsuarios = "select * from USUARIOS";
    private static final String findUsuario = "select * from USUARIOS where nome = ? and senha = ?";

    private Connection connect() throws IOException, FileNotFoundException, SQLException {
        Connection con;
        Properties p = new Properties();
        p.load(new FileInputStream("src/conf/SMSDAO.properties"));
        String url = p.getProperty("url");
        con = DriverManager.getConnection(url, p);
        return con;
    }

    /**
     * Cadastra um contato.
     *
     * @param cont
     */
    public void addContatos(Contatos cont) {
        if (cont == null) {
            throw new IllegalArgumentException("O Contato não pode ser null!");
        }
        PreparedStatement stmt = null;
        Connection con = null;

        try {
            con = connect();

            stmt = con.prepareStatement(insertContatosSMS);
            stmt.setString(1, cont.getNumero());
            stmt.setString(2, cont.getNome());
            int r = stmt.executeUpdate();

            if (r != 1) {
                throw new RuntimeException("Erro ao inserir operação");
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir o contato");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SMSDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (con != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SMSDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void addModelos(ModeloSMS sms) {
        if (sms == null) {
            throw new IllegalArgumentException("O Contato não pode ser null!");
        }

        try {
            Connection con = connect();

            PreparedStatement stmt = con.prepareStatement(insertModelosSMS);
            stmt.setString(1, sms.getNome_Modelo());
            stmt.setString(2, sms.getMensagem());
            int r = stmt.executeUpdate();

            if (r != 1) {
                throw new RuntimeException("Erro ao inserir operação");
            } else {
                JOptionPane.showMessageDialog(null, "Modelo cadastrado com sucesso!");
            }
            if (stmt != null) {
                stmt.close();
            }

            if (r != 0) {
                stmt.close();
            }

            if (con != null) {
                stmt.close();
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Modelo de Mensagem");
            throw new RuntimeException("Erro ao inserir modelo de SMS");
        }

    }

    public void addGrupos(Grupos grp) {
        if (grp == null) {
            throw new IllegalArgumentException("O Contato não pode ser null!");
        }

        try {
            Connection con = connect();

            PreparedStatement stmt = con.prepareStatement(insertGruposSMS);
            stmt.setString(1, grp.getNome());
            int r = stmt.executeUpdate();

            if (r != 1) {
                throw new RuntimeException("Erro ao inserir operação");
            } else {
                JOptionPane.showMessageDialog(null, "Grupo cadastrado com sucesso!");
            }
            if (stmt != null) {
                stmt.close();
            }

            if (r != 0) {
                stmt.close();
            }

            if (con != null) {
                stmt.close();
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Modelo de Mensagem");
            throw new RuntimeException("Erro ao inserir um Grupo");
        }
    }

    public void addUsuario(Usuarios usu) {
        if (usu == null) {
            throw new IllegalArgumentException("O Contato não pode ser null!");
        }

        try {
            Connection con = connect();

            PreparedStatement stmt = con.prepareStatement(insertUsuario);
            stmt.setString(1, usu.getCpf());
            stmt.setString(2, usu.getNome());
            stmt.setString(3, usu.getEncriptSenha());
            stmt.setString(4, usu.getAcesso());
            stmt.setString(5, usu.getEmail());
            int r = stmt.executeUpdate();

            if (r != 1) {
                throw new RuntimeException("Erro ao inserir operação");
            } else {
                //JOptionPane.showMessageDialog(null, "Grupo cadastrado com sucesso!");
            }
            if (stmt != null) {
                stmt.close();
            }

            if (r != 0) {
                stmt.close();
            }

            if (con != null) {
                stmt.close();
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Modelo de Mensagem");
            throw new RuntimeException("Erro ao inserir um Usuario");
        }
    }

    public boolean findUsuarioFirstLogin() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = connect();

            stmt = con.prepareStatement(getUsuarios);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            // FIXME: comunicar erro ao programa cliente
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    stmt.close();
                }
                if (con != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // FIXME: comunicar erro ao programa cliente
            }
        }
        return true;
    }

    public ArrayList<String> fillComboGrupos() {
        String selectGrupos = "select nome from GRUPOS";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con = null;
        ArrayList<String> list = new ArrayList<String>();
        try {
            con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/SMS", "postgres",
                    "senacrs");

            stmt = con.prepareStatement(selectGrupos);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                list.add(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    stmt.close();
                }
                if (con != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public boolean findUsuario(String numero, String senha) {
        if (numero == null) {
            throw new IllegalArgumentException(
                    "O número da conta não pode ser null.");
        }
        if (senha == null) {
            throw new IllegalArgumentException(
                    "A senha da conta não pode ser null.");
        }
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Connection con = null;
        try {
            con = connect();

            stmt = con.prepareStatement(findUsuario);
            stmt.setString(1, numero);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            // FIXME: comunicar erro ao programa cliente
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    stmt.close();
                }
                if (con != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // FIXME: comunicar erro ao programa cliente
            }
        }
        return false;
    }
}