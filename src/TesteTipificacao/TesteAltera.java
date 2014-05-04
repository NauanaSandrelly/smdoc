/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteTipificacao;

import Bean.TipificacaoBean;
import DaoImpl.TipificacaoDaoImpl;
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

        TipificacaoBean tipi = new TipificacaoBean();
        tipi.setId(2);
        tipi.setArtigo("111");
        tipi.setLei("Codigo Penal");

        TipificacaoDaoImpl td = new TipificacaoDaoImpl();

        try {
            td.alterar(tipi);
            JOptionPane.showMessageDialog(null, "Tipificação alterada com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteAltera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
