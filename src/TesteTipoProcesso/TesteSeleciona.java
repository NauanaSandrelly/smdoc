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
import util.DaoException;

/**
 *
 * @author Admin
 */
public class TesteSeleciona {
    public static void main(String[] args) {
        TipoProcessoBean tipo = null;

        TipoProcessoDaoImpl tp = new TipoProcessoDaoImpl();
        
        try {
            tipo = tp.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteSeleciona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Descrição: " + tipo.getDescricao());
    }   
}
