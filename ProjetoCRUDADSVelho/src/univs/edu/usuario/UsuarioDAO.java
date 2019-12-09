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

public class UsuarioDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(UsuarioAjudado usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
            sessao.save(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
        transacao.commit();
        sessao.close();
    }
    
    public void editar(UsuarioAjudado usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Editado!");
            transacao.commit();
        sessao.close();
    }
    
    public void excluir(UsuarioAjudado usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }
    
    public UsuarioAjudado pesquisar(int id){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        UsuarioAjudado usuario = (UsuarioAjudado) sessao.
                createCriteria(UsuarioAjudado.class).add(
                Restrictions.eq("idUsuario", id))
                .uniqueResult();
        return usuario;      
    }
    
    public List<UsuarioAjudado> pesquisar(){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<UsuarioAjudado> usuarios = sessao.
                createCriteria(UsuarioAjudado.class).list();
        return usuarios;      
    }
    
    
}
