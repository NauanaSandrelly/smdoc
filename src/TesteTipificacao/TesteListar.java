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
public class TesteListar {

    public static void main(String[] args) {
        TipificacaoDaoImpl td = new TipificacaoDaoImpl();
        
        try {
            ArrayList<TipificacaoBean> tipificacoes = (ArrayList<TipificacaoBean>)
                    td.listar();
            for (TipificacaoBean tipificacaoBean : tipificacoes) {
                JOptionPane.showMessageDialog(null, "ID: " +tipificacaoBean.getId() +"\n"+
                                                     "Artigo: " +tipificacaoBean.getArtigo()+"\n"+
                                                     "Lei: " +tipificacaoBean.getLei());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
