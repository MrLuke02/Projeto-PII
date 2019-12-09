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
public class UsuarioAdm {
    
    @Id
    @GeneratedValue
    protected int idAdm;
    
    @Column(length = 100, nullable = false)
    protected String nomeUsuario;
    
    @Column(length = 100, nullable = false)
    protected String cpf;
    
    @Column(length = 100, nullable = false, unique = true)
    protected String login;
    
    @Column(length = 100, nullable = false)
    protected String senha;
    
    @Transient
    public static UsuarioAdm usuario;
    
    @Transient
    public static UsuarioColaborador usuarioCol;
    
    @Transient
    public static UsuarioAjudado usuarioAj;


    public int getIdUsuario() {
        return idAdm;
    }

    public void setIdUsuario(int idUsuario) {
        this.idAdm = idUsuario;
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
