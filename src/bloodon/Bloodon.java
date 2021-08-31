/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodon;

import bloodon.ui.Login;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author BlackPearl
 */
public class Bloodon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        new Login().setVisible(true);
    }
    
}
