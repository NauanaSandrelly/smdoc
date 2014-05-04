/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteTipoSituacao;


import Bean.TipoSituacaoBean;
import DaoImpl.TipoSituacaoDaoImpl;
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
        
        TipoSituacaoBean tipo = new TipoSituacaoBean();
        tipo.setId(1);
        tipo.setDescricao("Cota cumprida");
        
        TipoSituacaoDaoImpl tp = new TipoSituacaoDaoImpl();
        
        try {
            tp.alterar(tipo);
             JOptionPane.showMessageDialog(null,"Tipo de Situacao alterada com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteAltera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
