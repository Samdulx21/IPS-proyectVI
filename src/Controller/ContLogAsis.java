/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.frmAppAsis;
import View.frmAsistente;
import View.frmHome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Millow
 */
public class ContLogAsis implements ActionListener{

    frmAsistente la = new frmAsistente();
    frmAppAsis fpa = new frmAppAsis();
    frmHome home = new frmHome();
    // Llamar clase modelo
    
    
    
    public ContLogAsis (frmAsistente la){
        
         this.la = la;
         this.la.BtnMenu.addActionListener(this);
         this.la.BtnCerrar.addActionListener(this);
         
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
         if (e.getSource() == la.BtnMenu){
             
             la.setVisible(false);
             home.setVisible(true);
             //Constructor
             ContHome conhome = new ContHome(home);
         }
         else if (e.getSource() == la.BtnCerrar){
             
              System.exit(0);
         }

    }
    
    
    
}
