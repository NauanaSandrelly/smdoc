/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteTipificacao;

import Bean.TipificacaoBean;
import DaoImpl.TipificacaoDaoImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DaoException;

/**
 *
 * @author Admin
 */
public class TesteLista {

    public static void main(String[] args) {
        
        TipificacaoDaoImpl td = new TipificacaoDaoImpl();
        
        try {
            ArrayList<TipificacaoBean> tipificacoes = (ArrayList<TipificacaoBean>)
                    td.listar();
            
            for (TipificacaoBean tipificacao : tipificacoes) {
                JOptionPane.showMessageDialog(null, "ID: " +tipificacao.getId());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
