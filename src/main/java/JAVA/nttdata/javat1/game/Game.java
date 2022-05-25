/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.nttdata.javat1.game;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Alba
 */
public class Game {
	
	Logger log = LoggerFactory.getLogger(Game.class);
    
	//Atributos//
	
    private Player player;
    ArrayList < Player > Players;
    
    //Constructor//
    
    public Game() {
        this.Players=new ArrayList();
        this.player=new Player();
    }
    
    //Método para generar el menu//
    
    public void menu(){
    	
    	log.info("ENTRADA AL MÉTODO MENU");
    	
        Ball b1= new Ball();
        Scanner sc= new Scanner(System.in);
        int opc;
        do{
        do{
            System.out.println("1. Introduzca nombre jugador :" );
            System.out.println("2. Lanzar bola");
            System.out.println("3. Guardar Puntuación");
            System.out.println("4. Mostrar Puntuaciones");
            System.out.println("5. Salir");
            
          opc = sc.nextInt();
          switch(opc){
              case 1:
                  newPlayer();
                  break;
              case 2:
                  player.setScore(b1.StartScore());
                  break;
              case 3:
                  if(player.getName()== null || player.getScore() == 0){
                      System.out.println("Nombre o Puntuación no resgistrados");
                      break;
                  }
                  Players.add(player);
                  break;
              case 4:
                  if(Players.size()==0){
                      System.out.println("No hay jugadores registrados");
                      break;
                  }
                  Collections.sort(Players, new Score());
                  Iterator it = Players.iterator();
                  while(it.hasNext())
                      System.out.println(it.next());
                  break;
              case 5:
                  System.out.println("Programa finalizado");
                  break;
          }
      
        }while(opc <1 || opc >5);
        }while(opc !=5);
        
        log.info("MÉTODO MENU EJECUTADO CORRECTAMENTE");
    }
    
    //Método para crear un jugador llamando a Player//
    
    public void newPlayer(){
    	
    	log.info("ENTRADA AL MÉTODO DE CREACIÓN DE UN NUEVO JUGADOR");
    	
    	Scanner sc= new Scanner(System.in);
    	String name=sc.next();
    	Player j1 = new Player(name);
    	this. player=j1;
    	
    	log.info("MÉTODO EJECUTADO CORRECTAMENTE");
    }
   
    
}

  
    

            
          


