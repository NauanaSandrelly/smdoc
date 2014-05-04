/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testeMovimentacao;


import Bean.MovimentacaoBean;
import TesteUsuario.*;
import Bean.UsuarioBean;
import DaoImpl.MovimentacaoDaoImpl;
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
        
        MovimentacaoBean mb = new MovimentacaoBean();
        mb.setId(3);
        mb.setDespacho("hhhhhhh");
        
        
        MovimentacaoDaoImpl md = new MovimentacaoDaoImpl();
        
        try {
            md.alterar(mb);
              JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteAltera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
