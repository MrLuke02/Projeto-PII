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

public class UsuarioColDAO {
    
    private Session sessao;
    private Transaction transacao;
    
    public void salvar(UsuarioColaborador usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
            sessao.save(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!");
        transacao.commit();
        sessao.close();
    }
    
    public void editar(UsuarioColaborador usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.update(usuario);
            JOptionPane.showMessageDialog(null, "Usuário Editado!");
            transacao.commit();
        sessao.close();
    }
    
    public void excluir(UsuarioColaborador usuario){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }
    
    public UsuarioColaborador pesquisar(int id){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        UsuarioColaborador usuario = (UsuarioColaborador) sessao.
                createCriteria(UsuarioColaborador.class).add(
                Restrictions.eq("idUsuario", id))
                .uniqueResult();
        return usuario;      
    }
    
    public UsuarioColaborador autenticar(String login, String senha){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        UsuarioColaborador usuarioCol = (UsuarioColaborador) sessao.
                createCriteria(UsuarioColaborador.class).add(
                Restrictions.eq("login", login)).add(Restrictions.eq("senha",senha)).uniqueResult();
        return usuarioCol;      
    }
    
    public List<UsuarioColaborador> pesquisar(){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<UsuarioColaborador> usuarios = sessao.
                createCriteria(UsuarioColaborador.class).list();
        return usuarios;      
    }
    
    
}
