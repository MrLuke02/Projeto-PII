package univs.edu.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    
    @Column(length = 100, nullable = false)
    protected String Problema;

    public String getProblema() {
        return Problema;
    }

    public void setProblema(String Problema) {
        this.Problema = Problema;
    }

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
