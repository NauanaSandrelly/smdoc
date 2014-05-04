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
public class TesteExcluir {
    public static void main(String[] args) {
        
        TipoProcessoBean tipo = new TipoProcessoBean();
        tipo.setId(7);
        
        TipoProcessoDaoImpl td = new TipoProcessoDaoImpl();
        
        try {
            td.excluir(tipo);
             JOptionPane.showMessageDialog(null,"Tipo de processo excluido com sucesso!!!");
   
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
