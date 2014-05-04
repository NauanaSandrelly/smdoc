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
public class TesteLista {

    public static void main(String[] args) {
        
        TipoSituacaoDaoImpl td = new TipoSituacaoDaoImpl();
        
        try {
            ArrayList<TipoSituacaoBean> tipoSituacoes = (ArrayList<TipoSituacaoBean>)
                    td.listar();
            
            for (TipoSituacaoBean tipoSituacao : tipoSituacoes) {
                JOptionPane.showMessageDialog(null, "ID: "+tipoSituacao.getId());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
