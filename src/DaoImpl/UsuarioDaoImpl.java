/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImpl;

import Bean.UsuarioBean;
import util.BaseDao;
import util.BaseDaoImpl;
/**
 *
 * @author Admin
 */
public class UsuarioDaoImpl extends BaseDaoImpl<UsuarioBean> implements BaseDao<UsuarioBean> {
   
 public UsuarioDaoImpl() {
        super(UsuarioBean.class);
    }
} 