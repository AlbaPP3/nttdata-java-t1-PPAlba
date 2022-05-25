/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.nttdata.javat1.game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Alba
 */
public class Player {
    
	Logger log = LoggerFactory.getLogger(Player.class);
	
	//Atributos//
	
    int score;
    String name;
    
    //Constructor vacío porque hay que hacer un @Override para que lea lo introducido o generado//
   
    public Player() {
    }
    
    //Método para que devuelva lo introducido o generado en name y score en otras clases con el @Override//
    
    @Override
    public String toString() {
    	
    	log.info("INFORMACIÓN QUE SALE POR PANTALLA DEL JUGADOR : {} , {}", this.name, this.score);
        return "Nombre del jugador :" +name+ " Puntuación :"+score;
       
    }

    //Constructor para el nombre//
    public Player(String name){
    	
        this.name=name;
        log.info("JUGADOR CREADO : {}", this.name);
        
    }
    //Constructor para la puntuación//
    public Player(int score, String name) {
    	
        this.score = score;
        this.name = name;
        log.info("PUNTUACIÓN CREADA : {}", this.score);
        
    }
    
    //Métodos para poder obtener score y name en otras clases y poder modificarlos//
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}   

