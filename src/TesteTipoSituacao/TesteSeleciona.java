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
import util.DaoException;

/**
 *
 * @author Admin
 */
public class TesteSeleciona {
    public static void main(String[] args) {
        TipoSituacaoBean tipo = null;

        TipoSituacaoDaoImpl td = new TipoSituacaoDaoImpl();
        
        try {
            tipo = td.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteSeleciona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Descrição: " + tipo.getDescricao());
    }   
}
