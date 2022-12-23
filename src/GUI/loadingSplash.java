/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author acidopal
 */
class loadingSplash {
    int counter = 0;
    Timer tm;

    public loadingSplash(){
     

    }
    
    public static void main(String []args) {
       loadingSplash splash = new loadingSplash();
       splash.animation();
    }
    
     void animation(){

         loadingPage_frame sp = new loadingPage_frame();
         sp.workButton.setVisible(false);
         sp.setVisible(true);
         
         tm = new Timer(100, (ActionEvent e) -> {
             counter++;
             sp.percent.setText(Integer.toString(counter)+"%");
             if(counter == 100){
                 tm.stop();
                 sp.workButton.setVisible(true);
             }
         });
         
         
        tm.start();
    }
     
     
     
     
     void  visible(){
        loadingPage_frame sp = new loadingPage_frame();
        sp.setVisible(true);
        
     }
}
