/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testeSituacao;

import Bean.SituacaoBean;
import Bean.TipoSituacaoBean;
import DaoImpl.SituacaoDaoImpl;
import DaoImpl.TipoSituacaoDaoImpl;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DaoException;
import util.DateUtil;

/**
 *
 * @author Admin
 */
public class TesteInsere {

    public static void main(String[] args) {

         SituacaoBean sb = new SituacaoBean();
         sb.setObservacao("Não sei");
        try {
            sb.setData(DateUtil.formataDataCalendar("21/06/2011"));
        } catch (ParseException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TipoSituacaoBean ts = null;
        
        TipoSituacaoDaoImpl tsd = new TipoSituacaoDaoImpl();
        try {
            ts = tsd.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sb.setTiposituacao(ts);

        SituacaoDaoImpl sd = new SituacaoDaoImpl();
        try {
            sd.inserir(sb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

