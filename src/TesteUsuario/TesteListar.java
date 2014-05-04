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
public class TesteListar {

    public static void main(String[] args) {
        UsuarioDaoImpl us = new UsuarioDaoImpl();
        try {
            ArrayList<UsuarioBean> usuarios = (ArrayList<UsuarioBean>) us.listar();
            for (UsuarioBean usuarioBean : usuarios) {
                JOptionPane.showMessageDialog(null, "ID: " +usuarioBean.getId() +"\n"+
                                                     "Nome: " +usuarioBean.getNome()+"\n"+
                                                     "CPF: " +usuarioBean.getCpf()+"\n"+
                                                     "Login: "+usuarioBean.getLogin()+"\n"+
                                                     "Senha: " +usuarioBean.getSenha());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
