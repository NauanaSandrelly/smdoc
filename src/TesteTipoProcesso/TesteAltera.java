/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteTipoProcesso;


import Bean.TipoProcessoBean;
import DaoImpl.TipoProcessoDaoImpl;
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
        
        
        TipoProcessoBean tipo = new TipoProcessoBean();
        tipo.setId(3);
        tipo.setDescricao("teste");
        
        TipoProcessoDaoImpl tp = new TipoProcessoDaoImpl();
        
        try {
            tp.alterar(tipo);
             JOptionPane.showMessageDialog(null,"Tipo de processo alterado com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteAltera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
