package univs.edu.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Akari
 */

@Entity
public class UsuarioAjudado {
    
    @Id
    @GeneratedValue
    protected int idUsuario;
    
    @Column(length = 100, nullable = false)
    protected String nomeUsuario;
    
    @Column(length = 100, nullable = false)
    protected String cpf;
    
    @Column(length = 100, nullable = false, unique = true)
    protected String login;
    
    @Column(length = 100, nullable = false)
    protected String senha;

    public Boolean getBan() {
        return ban;
    }

    public void setBan(Boolean ban) {
        this.ban = ban;
    }

    public static UsuarioAjudado getUsuario() {
        return usuario;
    }

    public static void setUsuario(UsuarioAjudado usuario) {
        UsuarioAjudado.usuario = usuario;
    }
   
    @Column(length = 100, nullable = false)
    protected Boolean ban = false;
    
    
    @Transient
    public static UsuarioAjudado usuario;
    
    


    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }   
    
}
