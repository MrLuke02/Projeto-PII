package univs.edu.usuario;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

/**
 *
 * @author Akari
 */

public class UsuarioAdmDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvarInicio(UsuarioAdm usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
            sessao.save(usuario);
        transacao.commit();
        sessao.close();
    }
    
    public void salvar(UsuarioAdm usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
            sessao.save(usuario);
            JOptionPane.showMessageDialog(null, "Administrador Cadastrado!");
        transacao.commit();
        sessao.close();
    }
    
    public void editar(UsuarioAdm usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(usuario);
            JOptionPane.showMessageDialog(null, "Administrador Editado!");
            transacao.commit();
        sessao.close();
    }
    
    public void excluir(UsuarioAdm usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }
    
    public UsuarioAdm autenticar(String login, String senha){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        UsuarioAdm usuarioAdm = (UsuarioAdm) sessao.
                createCriteria(UsuarioAdm.class).add(
                Restrictions.eq("login", login)).add(Restrictions.eq("senha",senha)).uniqueResult();
        return usuarioAdm;      
    }
    
 
    
    public UsuarioAdm pesquisar(int id){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        UsuarioAdm usuario = (UsuarioAdm) sessao.
                createCriteria(UsuarioAjudado.class).add(
                Restrictions.eq("idUsuario", id))
                .uniqueResult();
        return usuario;      
    }
    
    
    
    public List<UsuarioAdm> pesquisar(){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<UsuarioAdm> usuarios = sessao.
                createCriteria(UsuarioAdm.class).list();
        return usuarios;      
    }
    
    
}
