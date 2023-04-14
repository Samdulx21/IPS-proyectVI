/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.frmAdmin;
import View.frmAsistente;
import View.frmCliente;
import View.frmDoctor;
import View.frmHome;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Millow
 */
public class ContHome implements ActionListener {

     frmHome home = new frmHome();
     UIManager UI;
  
    
    public ContHome (frmHome home){
        
         this.home = home;
        
        
         this.home.MnProfile.addActionListener(this);
         this.home.MnAsis.addActionListener(this);
         this.home.MnAdmi.addActionListener(this);
         this.home.MnCliente.addActionListener(this);
         this.home.MnDoc.addActionListener(this);
         this.home.MnInfo.addActionListener(this);
         this.home.Info.addActionListener(this);
        
    }
    
    public Icon icono (String path, int width, int heigth){
        
         Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                 .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
         return img;
    }  
             
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
       
        if (e.getSource() == home.MnAsis){
            
             home.setVisible(false);
             frmAsistente la = new frmAsistente();
             la.setVisible(true);
                
              //llamar controlador
             ContLogAsis nela = new ContLogAsis(la);   
                
        }
        else if (e.getSource() == home.MnAdmi){
                
             home.setVisible(false);
             frmAdmin adm = new frmAdmin();
             adm.setVisible(true);
                
             //llamar controlador}
                
        }
        else if (e.getSource() == home.MnDoc){
                
             home.setVisible(false);
             frmDoctor doc = new frmDoctor();
             doc.setVisible(true);
                 
             //llamar controlador}
                 
        }
        else if (e.getSource() == home.MnCliente){
                 
             home.setVisible(false);
             frmCliente cli = new frmCliente();
             cli.setVisible(true);
                 
             //llamar controlador
                 
        }
        else if (e.getSource () == home.Info){
            
             UI = null;
             UI.put("OptionPane.background", new Color (178,252,255));
             UI.put("Panel.background", new Color (236,252,255));
                     
             JOptionPane.showMessageDialog(null, 
                     "El modelo de Salud I.P.S Wachitro cuenta con más de 50 años \n"
                             + "cuidando la salud de nuestros afiliados y sus familias.\n" + "\n"
                             + "Contacnos a través de nuestro correo Wachitroco@ips.wachi.co \n"
                             + "y a nuestro numero +57 (605)98888", 
                     "I.P.S Wachitroco",
                     JOptionPane.PLAIN_MESSAGE, icono("/LogosIMG/LogoWachi.png", 40, 40));
        }
        
            
    }
       
            
            
}
           
        
    
    
    
    
    

    

