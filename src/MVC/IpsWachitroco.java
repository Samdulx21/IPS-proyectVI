/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MVC;

import Controller.ContHome;
import Controller.ContSplash;
import View.Splash;
import View.frmHome;

/**
 *
 * @author Millow
 */
public class IpsWachitroco {

    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Splash sp = new Splash();
        sp.setVisible (true);
        //frmHome  home = new frmHome();
        //home.setVisible(true);
                
        
        ContSplash newsp = new ContSplash(sp);
        
        //ContHome newhm = new ContHome(home);

    }
    
}
