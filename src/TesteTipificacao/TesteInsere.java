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
public class TesteInsere {

    public static void main(String[] args) {        
        
        TipificacaoBean tipi = new TipificacaoBean();
        
        tipi.setArtigo("123");
        tipi.setLei("Codigo Penal");
        
        TipificacaoDaoImpl td = new TipificacaoDaoImpl();
        
        try {
            td.inserir(tipi);
            JOptionPane.showMessageDialog(null,"Tipificacao inserida com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

