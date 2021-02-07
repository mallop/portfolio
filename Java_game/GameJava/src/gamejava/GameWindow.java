/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamejava;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * Główne okno gry
 */
public class GameWindow extends JFrame{
    
    /**
     *Ustawienie okna gry, dodanie panelu gry
     * @param width szerokość okna
     * @param height wysokość okna
     * @param x położenie lewego górnego narożnika okna gry 
     * @param y położenie lewego górnego narożnika okna gry 
     */
    public GameWindow(int width, int height, int x, int y){
       super(); 
       setSize(width, height); 
       setLocation(x,y); 
       setUndecorated(true);
       setResizable(false); 
       GUI(width,height); 
       setVisible(true);
       menu();  
   }
    
    /**
     *Interfejs graficzny
     * @param width szerokość okna
     * @param height wysokość okna
     */
    private void GUI(int width, int height){
       GameParam.firstimages();
       Toolkit tk = Toolkit.getDefaultToolkit();
       add(new GamePanel(width,height)); //dodaj panel gry zawierający grafikę i akcję  
   }
    
    /**
     * możliwość poruszania się po menu
     */
   private void menu() {
       GameParam.start = System.currentTimeMillis();
       long currTime = GameParam.start;
       while (currTime - GameParam.start < GameParam.gtime) {
         repaint();
          
         try {
           Thread.sleep(80);
          } 
         catch (InterruptedException ex) {System.out.println("Wyjątek: "+ex);      }
     }
   }
   
}

