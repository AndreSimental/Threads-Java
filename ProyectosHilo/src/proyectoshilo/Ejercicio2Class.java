/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoshilo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author TELMEX
 */
public class Ejercicio2Class implements Runnable{
public Thread hilo;

String n_hilo;
Scanner sc= new Scanner(System.in);
Ejercicio2Class (String nombrehilo)
{
    hilo= new Thread(this,nombrehilo);
    n_hilo= nombrehilo; 
    //System.out.println("Comienza "+hilo.getName()+ "Iniciando");
    hilo.start();
}
String cadena, texto1,texto2,texto3,texto4;


    public void run() {
       try{
           if("Sub_PROCESO1 ".equals(n_hilo)){
            
             FileReader fr= new FileReader("Archivo.txt");
       BufferedReader br= new BufferedReader(fr);
                   
                    texto1="";
                    //System.out.println(texto1);
           }
           if("Sub_PROCESO2 ".equals(n_hilo)){
                for (int i = 0; i <= 9; i++){
                    System.out.println("Hilo 2: "+i);
         
                }
                
                    //System.out.println("Terminando Hilo 2");
                    texto2="Estoy en execucion? "+hilo.isAlive();
                    //System.out.println(texto2);
               }
           if("Sub_PROCESO3 ".equals(n_hilo)){
                String az="abcdefghijklmnñopqrstuvwxyz";
              char[] azChar=az.toCharArray();

               for (int i = 0; i < azChar.length; i++) {
                   System.out.println(" letra: "+azChar[i]);
                   
               }
             
                       
                    //System.out.println("Terminando Hilo 3");
                    texto3= "Prioridad "+hilo.getPriority();
                    //System.out.println(texto3);
           }
           if("Sub_PROCESO4 ".equals(n_hilo)){
               FileReader fr= new FileReader("Archivo.txt");
       BufferedReader br= new BufferedReader(fr);
                 
                
                 while((cadena=br.readLine())!=null){
                    
                     texto4=""+cadena;
                     //System.out.println(texto4);
                 }  
                
                    //System.out.println("Terminando Hilo 4");
           }
           
       }catch(Exception exc){
           System.out.println("Interrupcion en hilo"+ hilo.getName());
           
       }
    }
     public static void main(String[] args) {
       Ejercicio2Class ob1= new  Ejercicio2Class  ("Sub_PROCESO1 ");
         Ejercicio2Class  ob2= new  Ejercicio2Class  ("Sub_PROCESO2 ");
          Ejercicio2Class  ob3= new  Ejercicio2Class  ("Sub_PROCESO3 ");
           Ejercicio2Class  ob4= new  Ejercicio2Class  ("Sub_PROCESO4 ");
         
       
         //System.out.println("Termina main");
    }

   
     }
