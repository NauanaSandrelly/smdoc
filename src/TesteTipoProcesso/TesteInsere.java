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
public class TesteInsere {

    public static void main(String[] args) {        

        TipoProcessoBean tipo = new TipoProcessoBean();
        tipo.setDescricao("nao sei");
        
        TipoProcessoDaoImpl tp = new TipoProcessoDaoImpl();
        
        try {
            tp.inserir(tipo);
            JOptionPane.showMessageDialog(null,"Tipo de Processo Inserido com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

