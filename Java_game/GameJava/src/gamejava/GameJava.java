/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamejava;

import java.awt.Toolkit;

/**
 *Uruchamianie gry
 */
public class GameJava {

    /**
     *Rozpoczynanie gry,ustawianie ekranu,obliczanie współrzędnej (x,y)- górnego,lewego narożnika ekranu gry
     * @param args 
     */
    public static void main(String[] args) {
       
        int gameWidth=1024;
        int gameHeight=760;
        
        int swidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        int sheight=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        int x=(swidth-gameWidth)/2;
        int y=(sheight-gameHeight-60)/2;
              
        GameWindow gw=new GameWindow(gameWidth,gameHeight,x,y);
   }   
}
