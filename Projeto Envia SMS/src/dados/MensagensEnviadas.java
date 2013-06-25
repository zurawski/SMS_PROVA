package dados;

/**
 *
 * @author aluno
 */
public class MensagensEnviadas {

    private Integer id;
    private String numeroEnviado;
    private Integer statusNumeroEnviado;
    private String dataEnvio;
    private String horaEnvio;

    public MensagensEnviadas(Integer ID, String Numero_Enviado, Integer Status_Retorno_Msg, String Data_Envio, String Hora_Envio) {
        super();
        this.id = ID;
        this.numeroEnviado = Numero_Enviado;
        this.statusNumeroEnviado = Status_Retorno_Msg;
        this.dataEnvio = Data_Envio;
        this.horaEnvio = Hora_Envio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero_Enviado() {
        return numeroEnviado;
    }

    public void setNumero_Enviado(String Numero_Enviado) {
        this.numeroEnviado = Numero_Enviado;
    }

    public Integer getStatusNumeroEnviado() {
        return statusNumeroEnviado;
    }

    public void setStatusNumeroEnviado(Integer statusNumeroEnviado) {
        this.statusNumeroEnviado = statusNumeroEnviado;
    }

    public String getData_Envio() {
        return dataEnvio;
    }

    public void setData_Envio(String Data_Envio) {
        this.dataEnvio = Data_Envio;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }
}
