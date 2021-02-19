/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Frames.Cargando;
import Frames.Log;
import javax.swing.UIManager;

/**
 *
 * @author Franklin
 */
public class SisTransApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Plantillas lookAndFeel
        try {
            //Plantillas
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.metal.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.Windows.LookAndFeel");
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
            //UIManager.setLookAndFeel("UpperEssential.UpperEssentialLookAndFeel");
            //UIManager.setLookAndFeel("com.jgoodies.looks.windows.WindowsLookAndFeel");
            //Plastic3DLookAndFeel.setPlasticTheme(new DarkStar());
            //UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");
            //UIManager.setLookAndFeel("com.jtatto.plaf.acryl.AcrylLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        // TODO code application logic here
        Cargando nuevo=new Cargando();
        nuevo.setVisible(true);
        /*Log login=new Log();
        login.setVisible(true);
        login.setBounds(0,0,1177, 600);
        login.setLocationRelativeTo(null);*/
        
        
    }
    
}
