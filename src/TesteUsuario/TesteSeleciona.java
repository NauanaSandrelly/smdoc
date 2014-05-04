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
public class TesteSeleciona {
    public static void main(String[] args) {
        UsuarioBean usuario = null;
        
        UsuarioDaoImpl us = new UsuarioDaoImpl();
        
        try {
            usuario = us.selecionar(3);
        } catch (DaoException ex) {
            Logger.getLogger(TesteSeleciona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Nome: " +usuario.getNome());
    }   
}
