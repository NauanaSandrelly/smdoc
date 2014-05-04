/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Bean.MovimentacaoBean;
import Bean.ProcessoBean;
import util.BaseDao;
import util.BaseDaoImpl;

/**
 *
 * @author Admin
 */
public class ProcessoDaoImpl extends BaseDaoImpl<ProcessoBean> implements BaseDao<ProcessoBean> {
    
    public ProcessoDaoImpl() {
        super(MovimentacaoBean.class);
    }
}