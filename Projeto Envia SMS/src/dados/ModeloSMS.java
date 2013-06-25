package dados;

/**
 *
 * @author aluno
 */
public class ModeloSMS {

    private Integer id;
    private String nomeEnvio;
    private String mensagem;

    public ModeloSMS(String nome_Modelo, String Mensagem) {
        this.nomeEnvio = nome_Modelo;
        this.mensagem = Mensagem;
    }

    public String getNome_Modelo() {
        return nomeEnvio;
    }

    public void setNome_Modelo(String nome_Modelo) {
        this.nomeEnvio = nome_Modelo;
    }

    public ModeloSMS(Integer id, String mSMS) {
        super();
        this.id = id;
        this.mensagem = mSMS;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String Mensagem) {
        this.mensagem = Mensagem;
    }
}