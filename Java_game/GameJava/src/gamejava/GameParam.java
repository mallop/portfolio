/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamejava;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
*Klasa z parametrami gry, zasobami graficznymi
*/
public class GameParam {
/**  Obraz tła gry   */
 public static Image backimage;
/**  Obraz "Menu"-przejścia do menu    */
 public static Image menuimage;
 /**  Obraz "Start"-powrotu do wyświetlania paska menu z parametrami */
 public static Image menubackimage;
/** Określanie wyboru opcji z menu*/
 public static boolean choose=false;
 /** Określanie przerwy w grze   */
 public static boolean pause=false;
 /**Początek gry */
 public static long start;
  /**Czas gry   */
 public static long gtime=Long.MAX_VALUE;
 /** Szerokość pola gry */
public static int gWidth;
/** Wysokość pola gry */
public static int gHeight;
    
/**
 * Pobieranie zasobów gry- tła i ikonek menu
 */
    public static void firstimages() {
      backimage = load("wjpproj/tlo.jpg");
      menuimage=load("wjpproj/menu.png");
      menubackimage=load("wjpproj/start.png");   
    }
    
    public static Image load(String fileName) {
       return new ImageIcon(fileName).getImage();
    }
    
}
