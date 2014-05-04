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
public class TesteInsere {

    public static void main(String[] args) {        

        UsuarioBean usuario = new UsuarioBean();
        usuario.setNome("sandrelly");
        usuario.setCpf("12345678912");
        usuario.setLogin("nau");
        usuario.setSenha("123456");
        
        UsuarioDaoImpl ud = new UsuarioDaoImpl();
        
        try {
            ud.inserir(usuario);
            JOptionPane.showMessageDialog(null,"Usuario inserido com sucesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

