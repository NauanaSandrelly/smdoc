/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;


import Bean.TipoProcessoBean;
import util.BaseDao;
import util.BaseDaoImpl;

/**
 *
 * @author Admin
 */
public class TipoProcessoDaoImpl extends BaseDaoImpl<TipoProcessoBean> implements BaseDao<TipoProcessoBean> {
    
    public TipoProcessoDaoImpl() {
        super(TipoProcessoBean.class);
    }
    
}
