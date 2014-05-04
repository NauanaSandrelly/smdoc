/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteTipoSituacao;

import Bean.TipoSituacaoBean;
import DaoImpl.TipoSituacaoDaoImpl;
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
        TipoSituacaoDaoImpl td = new TipoSituacaoDaoImpl();
        
        try {
            ArrayList<TipoSituacaoBean> TipoSituacoes = (ArrayList<TipoSituacaoBean>) td.listar();
            for (TipoSituacaoBean tipoSituacaoBean : TipoSituacoes) {
                JOptionPane.showMessageDialog(null, "ID: " +tipoSituacaoBean.getId() +"\n"+
                                                     "Descrição: " +tipoSituacaoBean.getDescricao());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
