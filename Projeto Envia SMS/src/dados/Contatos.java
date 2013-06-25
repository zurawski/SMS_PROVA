package dados;

/**
 *
 * @author zurawski
 */
public class Contatos {

    private String numero;
    private String nome;

    /**
     *
     * @param Num
     * @param Contato
     */
    public Contatos(String Num, String Contato) {
        super();
        this.numero = Num;
        this.nome = Contato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
}
