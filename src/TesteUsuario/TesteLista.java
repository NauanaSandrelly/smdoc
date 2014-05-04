/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteUsuario;

import Bean.UsuarioBean;
import DaoImpl.UsuarioDaoImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DaoException;

/**
 *
 * @author Admin
 */
public class TesteLista {

    public static void main(String[] args) {
        
        UsuarioDaoImpl us = new UsuarioDaoImpl();
        
        try {
            ArrayList<UsuarioBean> usuarios = (ArrayList<UsuarioBean>)
                    us.listar();
            
            for (UsuarioBean usuario : usuarios) {
                JOptionPane.showMessageDialog(null, "ID: "+ usuario.getId());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
