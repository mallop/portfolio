/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamejava;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 * Odliczanie czasu
 */
public class UpdateTime extends TimerTask {

        int nSeconds = 0;
        JLabel timeLabel;
        
        public UpdateTime(JLabel timeLabel){
            this.timeLabel = timeLabel;   
           
        }

        public void restart(){
            nSeconds = 0;
        }
        
        @Override
        public void run() {
            EventQueue.invokeLater(new Runnable() {

                @Override
                public void run() {
                    // aktualizujemy gdy nie ma pauzy
                    if (!GameParam.pause) {
                        timeLabel.setText(String.valueOf("Czas : " + (nSeconds++) + " s."));
                        timeLabel.setFont(new Font("", Font.PLAIN, 20));
                       
                    }
                }
            });
        }
}

