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
import util.DaoException;

/**
 *
 * @author Admin
 */
public class TesteExcluir {

    public static void main(String[] args) {

        TipificacaoBean tipi = new TipificacaoBean();

        tipi.setId(4);

        TipificacaoDaoImpl td = new TipificacaoDaoImpl();

        try {
            td.excluir(tipi);
            JOptionPane.showMessageDialog(null, "Tipificação excluida com sucesso!!!");
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
