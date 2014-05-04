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
public class TesteExcluir {
    public static void main(String[] args) {
        
        TipoSituacaoBean tipo = new TipoSituacaoBean();
        tipo.setId(2);
        
        TipoSituacaoDaoImpl td = new TipoSituacaoDaoImpl();
        
        try {
            td.excluir(tipo);
             JOptionPane.showMessageDialog(null,"Tipo de situacao excluida com sucesso");
   
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
