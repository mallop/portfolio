/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamejava;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import javax.swing.*;
import javax.swing.JLabel;

/**
 * Klasa związana z poruszaniem się po obszarze gry
 */
public class GamePanel extends JPanel {
    /** Szerokość pola graficznego gry*/
    public int pwidth;
    /** Wysokość pola graficznego gry*/
    public int pheight;
    /**status gry*/
    public GameStatus status;
    /** Aktualizator UI */
    public UpdateTime aktualizator;
    /** czcionka*/
    public Font menufont;
    /** Wysokość dolnego paska menu*/
    public int menuheight;
    /**wpisywanie liczb do okienka*/
    String oldText;
    String answer;
    
     /**
     * @param width Szerokość pola graficznego gry
     * @param height Wysokość pola graficznego gry
     */
    
    public GamePanel(int width, int height) {
       
       setLayout(null);
       
       JLabel label = new JLabel();
       label.setForeground(Color.white);
       label.setBounds(300,430,300,400);;
       label.setFont(menufont);
       add(label);
        
       JLabel wrong = new JLabel();
       wrong.setBounds(300,580,500,110);
       add(wrong);
        
       JLabel name = new JLabel("PO-CIĄGI");
       name.setFont(new Font("", Font.BOLD, 15));
       name.setBounds(470,28,150,25);
       add(name);

        ImageIcon i1= new ImageIcon("wjpproj/3.png");
        JButton b1=new JButton(i1);
        b1.setBounds(50,60,210,190);
           b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("3");
                     label.setFont(menufont);
                   }else{
                     label.setText(oldText+", 3");
                     label.setFont(menufont);
                   }
                }
        });
             
        add(b1);
        
        ImageIcon i2= new ImageIcon("wjpproj/4.png");
        JButton b2=new JButton(i2); 
        b2.setBounds(280,60,210,190);
           b2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("4");
                     label.setFont(menufont);
                 
                   }else{
                     label.setText(oldText+", 4");
                     label.setFont(menufont);
                   }
                }
        });
        add(b2);
        
        ImageIcon i3= new ImageIcon("wjpproj/1.png");
        JButton b3=new JButton(i3);
        b3.setBounds(510,60,210,190);
           b3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("1");
                     label.setFont(menufont);
                 
                   }else{
                     label.setText(oldText+", 1");
                     label.setFont(menufont);
                   }
                }
        });
        add(b3);
        
        ImageIcon i4= new ImageIcon("wjpproj/8.png");
        JButton b4=new JButton(i4);
         b4.setBounds(740,60,210,190);
            b4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                      label.setText("8");
                      label.setFont(menufont);
                 
                   }else{
                     label.setText(oldText+", 8");
                     label.setFont(menufont);
                   }
                }
        });
       add(b4);
        
        ImageIcon i5= new ImageIcon("wjpproj/7.png");
        JButton b5=new JButton(i5);
         b5.setBounds(50,290,210,190);
            b5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("7");
                     label.setFont(menufont);
                   }else{
                      label.setText(oldText+", 7");
                      label.setFont(menufont);
                   }  
                }
        });
        add(b5);
        
        
           ImageIcon i6= new ImageIcon("wjpproj/13.png");
        JButton b6=new JButton(i6);
        b6.setBounds(280,290,210,190);
           b6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("13");
                     label.setFont(menufont);
                   }else{
                     label.setText(oldText+", 13");
                     label.setFont(menufont);
                   }           
                }
        });
        add(b6);
        
            ImageIcon i7= new ImageIcon("wjpproj/10.png");
        JButton b7=new JButton(i7);
         b7.setBounds(510,290,210,190);
         b7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("10");
                     label.setFont(menufont);
                 
                   }else{
                     label.setText(oldText+", 10");
                     label.setFont(menufont);
                   }
                }
        });
      add(b7);
     b7.setVisible(false);
      
 
            ImageIcon i8= new ImageIcon("wjpproj/12.png");
        JButton b8=new JButton(i8);
         b8.setBounds(740,290,210,190);
         b8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   oldText = label.getText() ;
                   if(oldText.equals("")){
                     label.setText("12");
                     label.setFont(menufont);
                 
                   }else{
                     label.setText(oldText+", 12");
                     label.setFont(menufont);
                   }
                }
        });
      add(b8);
      b8.setVisible(false);
        
        //Okienko z czasem
        JLabel timeLabel = new JLabel("Czas: 0 s.", JLabel.CENTER);
        timeLabel.setBounds(10,10,300,60);
        add(timeLabel);
        aktualizator = new UpdateTime(timeLabel);
        Timer timer = new Timer();
        timer.schedule(aktualizator, 0, 1000);
        
        JButton check = new JButton(" POTWIERDZENIE ");
        
        //przechodzenie na kolejny poziom
        JButton ok = new JButton("  DALEJ");
        ok.setBounds(720,400,100,100);
        ok.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    status.next();
                    switch(status.level) {
                    case 2:
                           b7.setVisible(true);
                           b4.setBounds(50,60,210,190);
                           b5.setBounds(510,60,210,190);
                           b3.setBounds(280,60,210,190);
                           b1.setBounds(280,290,210,190);
                           b2.setBounds(740,60,210,190);
                           b6.setBounds(50,290,210,190);
                         break;
                    case 3: 
                           b7.setVisible(true);
                           b8.setVisible(true);
                           b3.setBounds(50,60,210,190);
                           b1.setBounds(510,60,210,190);
                           b4.setBounds(280,60,210,190);
                           b2.setBounds(280,290,210,190);
                           b5.setBounds(740,60,210,190);
                           b6.setBounds(50,290,210,190);
                          break;
                    }
                        
                   ok.setVisible(false);
                   label.setText("");
                   GameParam.pause=false;
                   timeLabel.setBounds(10,10,300,60); 
                   check.setVisible(true);
                   b1.setVisible(true);    
                   b2.setVisible(true); 
                   b3.setVisible(true);
                   b4.setVisible(true);
                   b5.setVisible(true);
                   b6.setVisible(true);
                   label.setBounds(300,580,500,110);
            
                }
       });
  add(ok);
  ok.setVisible(false);
        
        //reakcja na wciśnięcie przycisku zatwierdzającego odpowiedź
        check.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 answer = label.getText();
                  switch(status.formula) {
                      case "rosnący, liczby pierwsze":
                       if (answer.equals("1, 3, 7, 13")) {
                         //gdy poprawnie
                         status.points++;
                         GameParam.pause=!GameParam.pause;
                         label.setText("dobrze!");
                         label.setFont(menufont);
                         label.setBounds(420,400,300,400);
                         wrong.setText("");
                         timeLabel.setBounds(320,400,300,60);
                         timeLabel.setFont(new Font("", Font.PLAIN, 50));
            
                         b1.setVisible(false); 
                         b2.setVisible(false);  
                         b3.setVisible(false);  
                         b4.setVisible(false);
                         b5.setVisible(false);
                         b6.setVisible(false);
                         check.setVisible(false);
                         ok.setVisible(true);
         
                    }
                       else {
        
                         // gdy niepoprawnie
                         status.points--;
                         label.setText("");
                         wrong.setText("zła kolejność");
                         wrong.setFont(menufont);
                         wrong.setForeground(Color.red);
                         wrong.setBounds(300,400,300,400);    
                       }
                       break;
           
           
                      case "arymetyczny, różnica= 3, pierwszy wyraz= 1":
                       if (answer.equals("1, 4, 7, 10, 13")) {
                       //gdy poprawnie
                         status.points++;
                         GameParam.pause=!GameParam.pause;
                         label.setText("dobrze!");
                         label.setFont(menufont);
                         wrong.setText("");
                         label.setBounds(420,400,300,400);
                         timeLabel.setBounds(320,400,300,60);
                         timeLabel.setFont(new Font("", Font.PLAIN, 50));
                         b1.setVisible(false); 
                         b2.setVisible(false);  
                         b3.setVisible(false);  
                         b4.setVisible(false);
                         b5.setVisible(false);
                         b6.setVisible(false);
                         b7.setVisible(false);
                         check.setVisible(false);
                         ok.setVisible(true);
                   }
                       else {
                         // gdy niepoprawnie
                         status.points--;
                         label.setText("");
                         wrong.setText("zła kolejność");
                         wrong.setFont(menufont);
                         wrong.setForeground(Color.red);
                         wrong.setBounds(300,400,300,400);
                        }
                      break;
               
                     case "rosnący, podzielność przez 4 bez reszty":
                       if (answer.equals("4, 8, 12")) {
                          //gdy poprawnie
                         status.points++;
                         GameParam.pause=!GameParam.pause;
                         timeLabel.setBounds(260,400,300,60);
                         timeLabel.setFont(new Font("", Font.PLAIN, 50));
                         label.setText("KONIEC GRY");
                         label.setFont(menufont);
                         label.setBounds(240,100,600,400);
                         label.setFont(new Font("", Font.PLAIN, 70));
                         wrong.setText("");
                         b1.setVisible(false); 
                         b2.setVisible(false);  
                         b3.setVisible(false);  
                         b4.setVisible(false);
                         b5.setVisible(false);
                         b6.setVisible(false);
                         b7.setVisible(false);
                         b8.setVisible(false);
                         check.setVisible(false);
                         ok.setVisible(false);
            }
                       else {
                          // gdy niepoprawnie
                         status.points--;
                         label.setText("");
                         wrong.setText("zła kolejność");
                         wrong.setFont(menufont);
                         wrong.setForeground(Color.red);
                         wrong.setBounds(300,400,300,400);
                           }
                      break;          
                  }  
                }
        });
        check.setBounds(100,500,150,110);
        add(check);

        status=new GameStatus();
        menufont=new Font("Dialog",Font.ROMAN_BASELINE,30);
        menuheight=100;
        this.pwidth=width;
        this.pheight=height;
        greset();
        
        /* Reakcja na wybór opcji z menu w dolnym pasku */
        addMouseListener(new MouseAdapter() {
         @Override
          public void mouseClicked(MouseEvent me){
              //opcja "Menu" 
             if(me.getX()>(pwidth-1000)&&me.getX()<(pwidth-800) && me.getY()>(pheight-menuheight)){
                GameParam.pause=!GameParam.pause;
                return;
              }
              //opcja "Koniec gry"
             if(me.getX()>(pwidth-600)&&me.getX()<(pwidth-500) && me.getY()>(pheight-menuheight)){
               if(GameParam.pause){
                 System.exit(1);
                  }
              }
              
             if(me.getX()>(pwidth-400)&&me.getX()<(pwidth-200)){
                aktualizator.restart();
                  //"opcja Od nowa"
                  if(GameParam.pause){
                    status.reset();
                    GameParam.choose=false;
                    label.setText("");
                    wrong.setText("");
                    wrong.setBounds(300,400,300,400);
                    label.setBounds(300,430,300,400);
                    timeLabel.setBounds(10,10,300,60);
                    b7.setVisible(false);
                    b8.setVisible(false);
                    ok.setVisible(false);
                     greset();
                    repaint();
                    check.setVisible(true);
                    b1.setVisible(true);
                    b2.setVisible(true);
                    b3.setVisible(true);
                    b4.setVisible(true);
                    b5.setVisible(true);
                    b6.setVisible(true);
                      
                   }
               }  
           }
       });    
    }
    
    /**
     * rysowanie dolnego paska menu
     * @param gr
     */
   @Override
    protected void paintComponent(Graphics gr) {
         Graphics2D g=(Graphics2D)gr;
         
         g.drawImage(GameParam.backimage, 0, 0, null);
         g.setColor(Color.GRAY);
         g.fillRect(0, pheight-menuheight, pwidth, menuheight);
         g.setColor(Color.black);
         g.setFont(menufont);
        
        if(GameParam.pause) {
          g.drawImage(GameParam.menubackimage,pwidth-1014,pheight-menuheight,null);
          g.setColor(Color.white);
          g.drawString("KONIEC",400,pheight-30);
          g.setColor(Color.white);
          g.drawString("OD NOWA",700, pheight-30);   
        }
        else {
          g.drawImage(GameParam.menuimage,pwidth-1014,pheight-menuheight,null);
          g.drawString("WZÓR CIĄGU:",250, pheight-40);
          g.drawString(""+status.formula,250, pheight-10);
          g.drawString("POZIOM:",800, pheight-40);
          g.drawString(""+status.level,950, pheight-40);
          g.drawString("PUNKTY:",550, pheight-40);
          g.drawString(""+status.points,700, pheight-40);
        }
     
     }
    
    /**
     * Restart gry - ustawienia parametrów oraz obiektów pierwszego planu
     * 
     */
  private void greset(){
    status.reset();
    GameParam.pause=false;
    } 

}

