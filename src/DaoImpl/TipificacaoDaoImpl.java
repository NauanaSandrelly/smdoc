/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Bean.TipificacaoBean;
import util.BaseDao;
import util.BaseDaoImpl;

/**
 *
 * @author Admin
 */
public class TipificacaoDaoImpl extends BaseDaoImpl<TipificacaoBean> implements BaseDao<TipificacaoBean> {
    
    public TipificacaoDaoImpl() {
        super(TipificacaoBean.class);
   }
}
   
