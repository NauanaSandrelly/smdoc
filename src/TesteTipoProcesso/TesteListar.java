/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteTipoProcesso;

import Bean.TipoProcessoBean;
import DaoImpl.TipoProcessoDaoImpl;
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
        TipoProcessoDaoImpl tp = new TipoProcessoDaoImpl();
        
        try {
            ArrayList<TipoProcessoBean> tipoProcessos = (ArrayList<TipoProcessoBean>) tp.listar();
            for (TipoProcessoBean tipoProcessoBean : tipoProcessos) {
                JOptionPane.showMessageDialog(null, "ID: " +tipoProcessoBean.getId() +"\n"+
                                                     "Descrição: " +tipoProcessoBean.getDescricao());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
