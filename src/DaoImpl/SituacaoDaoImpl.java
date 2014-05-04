/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Bean.SituacaoBean;
import util.BaseDao;
import util.BaseDaoImpl;

/**
 *
 * @author Admin
 */
public class SituacaoDaoImpl extends BaseDaoImpl<SituacaoBean> implements BaseDao<SituacaoBean> {
    
    public SituacaoDaoImpl() {
        super(SituacaoBean.class);
    }
    
}
