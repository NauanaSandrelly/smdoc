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
public class TesteSeleciona {
    public static void main(String[] args) {
        TipificacaoBean tipi = null;
        
        TipificacaoDaoImpl td = new TipificacaoDaoImpl();
        
        try {
            tipi = td.selecionar(2);
        } catch (DaoException ex) {
            
            Logger.getLogger(TesteSeleciona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Artigo: " +tipi.getArtigo()+"\n"+
                                            "Lei: " +tipi.getLei());
    }   
}
