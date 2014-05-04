/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteUsuario;

import Bean.UsuarioBean;
import DaoImpl.UsuarioDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DaoException;


/**
 *
 * @author Admin
 */
public class TesteExcluir {
    public static void main(String[] args) {
        
        UsuarioBean usuario = new UsuarioBean();
        usuario.setId(2);
        
        UsuarioDaoImpl us = new UsuarioDaoImpl();
        
        try {
            us.excluir(usuario);
            JOptionPane.showMessageDialog(null,"Usuario excluido com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
