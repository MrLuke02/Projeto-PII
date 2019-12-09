package univs.edu.ticket;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import univs.edu.usuario.UsuarioAjudado;

/**
 *
 * @author LABORATORIO 01
 */
@Entity
public class Ticket {
    @Id
    @GeneratedValue
    private int idTicket;
    
    
    private Date dataAbertura;
    private Date dataEncerramento;
    
    @Column(length = 50, nullable = false)
    private String assunto;
    
    @Column(length = 2000, nullable = false)
    private String mensagem;
    
    @OneToOne
    private UsuarioAjudado usuario;
    
    @Column(length = 100, nullable = false)
    protected String Problema;
    
    @Column(length = 2000, nullable = true)
    protected String resposta;
    
    @Column(length = 50, nullable = true)
    private String cttAj;
    
    @Column(length = 50, nullable = true)
    private String cttCol;

    public String getCttAj() {
        return cttAj;
    }

    public void setCttAj(String cttAj) {
        this.cttAj = cttAj;
    }

    public String getCttCol() {
        return cttCol;
    }

    public void setCttCol(String cttCol) {
        this.cttCol = cttCol;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    

    public String getProblema() {
        return Problema;
    }

    public void setProblema(String Problema) {
        this.Problema = Problema;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public UsuarioAjudado getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioAjudado usuario) {
        this.usuario = usuario;
    }
    
    
}
