/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamejava;

/**
 * Klasa ze statusem gry i metodami związanymi z jego zmianą
 */
class GameStatus{
/** Wzór ciągu */
public String formula="od najmniejszej liczby";
/**Aktualny poziom */
public int level=1;
/** Liczba punktów*/
public int points=0;
     
    /**
     * Przechodzenie na wyższy poziom
     */
   public void next(){
      level++;
       if(level==2) {
          formula="arymetyczny, różnica= 3, pierwszy wyraz= 1";
       }
       if(level==3) {
          formula="rosnący, podzielność przez 4 bez reszty";
       }     
     }
 /**
  * ustawienie początkowych parametrów
  */
   public void reset(){
       points=0;
       level=1;
       formula="rosnący, liczby pierwsze"; 
     }
    
}

