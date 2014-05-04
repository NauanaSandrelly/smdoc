/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testeMovimentacao;

import Bean.MovimentacaoBean;
import Bean.SituacaoBean;
import Bean.TipoSituacaoBean;
import Bean.UsuarioBean;
import DaoImpl.MovimentacaoDaoImpl;
import DaoImpl.SituacaoDaoImpl;
import DaoImpl.TipoSituacaoDaoImpl;
import DaoImpl.UsuarioDaoImpl;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;
import util.DateUtil;

/**
 *
 * @author Admin
 */
public class TesteInsere {

    public static void main(String[] args) {
        
        MovimentacaoBean mb = new MovimentacaoBean();
        mb.setDespacho("teste");
        try {
            mb.setData_recebido(DateUtil.formataDataCalendar("19/04/2014"));
            mb.setData_saida(DateUtil.formataDataCalendar("14/04/2014"));
        } catch (ParseException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        UsuarioBean ub = null;
        
        UsuarioDaoImpl ud = new UsuarioDaoImpl();
        try {
            ub = ud.selecionar(5);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        mb.setUsuario(ub);
        
        MovimentacaoDaoImpl md = new MovimentacaoDaoImpl();
        try {
            md.inserir(mb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
