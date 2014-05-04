/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteUsuario;


import Bean.UsuarioBean;
import DaoImpl.UsuarioDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.Conexao;
import util.DaoException;

/**
 *
 * @author Admin
 */
public class TesteAltera {
    
    public static void main(String[] args) {
        SessionFactory sessionFactory = Conexao.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        UsuarioBean usuario = new UsuarioBean();
        usuario.setId(2);
        usuario.setNome("julianna");
        usuario.setCpf("12345678987");
        usuario.setLogin("ju");
        usuario.setSenha("123");
        
        UsuarioDaoImpl ud = new UsuarioDaoImpl();
        
        try {
            ud.alterar(usuario);
              JOptionPane.showMessageDialog(null,"Usuario alterado com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteAltera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
