/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteProcesso;

import Bean.ProcessoBean;
import testeSituacao.*;
import Bean.SituacaoBean;
import Bean.TipificacaoBean;
import Bean.TipoSituacaoBean;
import Bean.UsuarioBean;
import DaoImpl.ProcessoDaoImpl;
import DaoImpl.SituacaoDaoImpl;
import DaoImpl.TipoSituacaoDaoImpl;
import DaoImpl.UsuarioDaoImpl;
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
        
        ProcessoBean pb = new ProcessoBean();
        pb.setNumero("gjgfjhfj");
        pb.setQt_apensos(1);
        pb.setQt_vol(1);
        pb.setDescricao("JFGFGH");
        UsuarioBean ub = new UsuarioBean();
        ub.setId(1);
        pb.setUsuario(ub);
        SituacaoBean sb = new SituacaoBean();
        sb.setId(4);
        pb.setSituacao(sb);
        TipificacaoBean tb = new TipificacaoBean();
        tb.setId(2);
        pb.setTipificacoes(tb);
        
        
        
        
        try {
           pb.setData(DateUtil.formataDataCalendar("28/06/2011"));
        } catch (ParseException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
       }
////        TipoSituacaoBean ts = null;
////        TipoSituacaoDaoImpl tsd = new TipoSituacaoDaoImpl();
////        try {
////            ts = tsd.selecionar(1);
////        } catch (DaoException ex) {
////            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        
//        SituacaoBean sb = null;
//        SituacaoDaoImpl sd = new SituacaoDaoImpl(); 
//        try {
//            sb = sd.selecionar(4);
//        } catch (DaoException ex) {
//            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println("Aqui");
////        
////        UsuarioBean ub = null;
////        
////        UsuarioDaoImpl ud = new UsuarioDaoImpl();
////        
////        try {
////            ub = ud.selecionar(3);
////        } catch (DaoException ex) {
////            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
////        }
////        pb.setSituacao(sb);
////        pb.setUsuario(ub);
//        pb.setSituacao(sb);
//        
        ProcessoDaoImpl pd = new ProcessoDaoImpl();
        try {
            pd.inserir(pb);
            
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

