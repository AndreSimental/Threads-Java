/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoshilo;

/**
 *
 * @author TELMEX
 */

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class AvionClase extends JComponent 
{
     static JPanel panel;
    
     static int columna = 3;
     
     static int fila = 195;
     
     static int numero = 1;
     
     static boolean pausar = false;
     
     static boolean suspender = false;
     
     int x= 0;
     int y= 123;
     
    
  AvionClase(JPanel panel)
  {
      
      this.panel = panel;
      
      setBounds(0, 0,panel.getWidth() , panel.getHeight());
         
  }
    
  public void paint(Graphics g)
  {
    ImageIcon imagen =new ImageIcon(new ImageIcon(getClass().getResource("avions.jpg")).getImage());
       
     g.drawImage(imagen.getImage(), columna, fila, 206, 256, null); 
     
       
       }
  
  static Thread hilo = new Thread()
    {
       @Override
        public void run()
        {
            try
            {
                while(true)
                {
                  numero++;
                  columna = columna +6;
                  fila = fila - 8;
                  
                  if(numero==8)
                  {
                    numero=1;
                    
                    
                  }
                  
                 panel.repaint();  
                 
                 columna+=10;
                 
                 
                  hilo.sleep(100);
                    
                }
                
                
            } catch (java.lang.InterruptedException ex) {
                                                           System.out.println(ex.getMessage()); 
                                                         }
             /*try {
            for (int i=1;i<1000;i++){
                System.out.print(i+" ");
                if ((i%10)==0){
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspender) {
                        wait();
                    }
                    if (pausar) break;
                }
            }
        }catch (InterruptedException exc){
            System.out.println(hilo.getName()+ "interrumpido.");
        }*/
        }
    };
   
   public static void mover(){
   if (hilo.isAlive())
        {
            hilo.resume();
        }
        else
        {
            
            hilo.start();
        }
    }
 public static void pausarhilo()
    {
        hilo.suspend();
    }
   public static void reiniciarhilo()
   {
     if(!hilo.isAlive())
    {
      hilo.start();
    }
      columna = 3;
      fila = 195;
    }
    
    
}
