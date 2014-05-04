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
public class TesteInsere {

    public static void main(String[] args) {        

        TipoSituacaoBean tipo = new TipoSituacaoBean();
        tipo.setDescricao("teste");
        
        TipoSituacaoDaoImpl tp = new TipoSituacaoDaoImpl();
        
        try {
            tp.inserir(tipo);
            JOptionPane.showMessageDialog(null,"Tipo de Situação Inserida com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

