/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.frmHome;
import View.Splash;
import javax.swing.JOptionPane;

/**
 *
 * @author Millow
 */
public class ContSplash {
    
    Splash sp = new Splash();
    
public ContSplash (Splash sp){
    
    
    this.sp = sp;
    
    try{
        
        for (int i = 0; i <= 100; i++){
            Thread.sleep(100);
            this.sp.numLoad.setText(i + "%");
            
            if (i == 10){
                this.sp.textLoad.setText("Turning On Modules...");
            }
            if (i == 20){
                this.sp.textLoad.setText("Loading Modules...");
            }
            if (i == 50){
                this.sp.textLoad.setText("Connecting to Database...");
            }
            if (i == 80){
                this.sp.textLoad.setText("Connecting Successful!");
            }
            if (i ==90){
                this.sp.textLoad.setText("Launching Application...");
            }
            this.sp.load.setValue(i);
            
        }
        this.sp.setVisible(false);
        frmHome home = new frmHome();
        home.setVisible(true);
        
        //LLamar controlador home
        ContHome conhome = new ContHome (home);
        
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    
}
 
    
}
