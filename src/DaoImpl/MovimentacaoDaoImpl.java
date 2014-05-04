/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Bean.MovimentacaoBean;
import util.BaseDao;
import util.BaseDaoImpl;

/**
 *
 * @author Admin
 */
public class MovimentacaoDaoImpl extends BaseDaoImpl<MovimentacaoBean> implements BaseDao<MovimentacaoBean> {
    
    public MovimentacaoDaoImpl() {
        super(MovimentacaoBean.class);
    }
    
}
