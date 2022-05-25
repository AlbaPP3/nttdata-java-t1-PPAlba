/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.nttdata.javat1.game;


import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 *
 * @author Alba
 */
public class Ball {
	
	Logger log = LoggerFactory.getLogger(Ball.class);
    
    
//Constructor//
    
    public Ball() {
      
    }
    //Métodos//
    
	//Método para generar número random hasta 600//
    
    public int random() {
    	
    	log.info("ENTRADA AL MÉTODO RANDOM");
    	Random r = new Random();
        
        log.info("MÉTODO RANDOM EJECUTADO CORRECTAMENTE");
        return r.nextInt(600);
        
	} 
    
    //Método para asignar al random rangos para que vaya sumando puntuación o simule caer al entrar en un asignado// 
    
	public int StartScore() {
		
			log.info("ENTRADA AL MÉTODO DE ASIGNACIÓN DE PUNTUACIÓN");
		
            int random;
            int score=0;
            
		do {
			random= this.random();
			if(random>0 && random<100) {
				score +=1000;
				System.out.println("+1000");
			}
			if(random>100 && random<200) {
				score +=2000;
				System.out.println("+2000");
			}
			if(random>200 && random<300) {
				score +=3000;
				System.out.println("+3000");
				
			}
			if(random>300 && random<400) {
				score +=4000;
				System.out.println("+4000");
			}
			if(random>400 && random<500) {
				score +=5000;
				System.out.println("+5000");
			}
		}while(random >0 && random < 500); 
		log.info("ASIGNACIÓN DE PUNTUACIÓN CORRECTA");
		return score;
		
				}   
	
}

    
      
        
        
        
          
            
        
        
    
