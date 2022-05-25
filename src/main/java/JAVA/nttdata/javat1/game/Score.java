/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.nttdata.javat1.game;
import java.util.Comparator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Alba
 */
//La clase implementa Comparator para comparar las puntuaciones que van saliendo a los jugadores//

public class Score implements Comparator<Player>{
	
	Logger log = LoggerFactory.getLogger(Score.class);
	
	//Método para comparar las puntuaciones generadas en la clase Ball con el @Overrride//
	
    @Override
    public int compare(Player o1, Player o2) {
    	
    	log.info("ENTRADA AL MÉTODO COMPARACION DE PUNTUACIONES");
    	log.info("MÉTODO FINALIZADO, DIFERENCIA DE PUNTUACIÓN OBTENIDA : {}", o2.score - o1.score );
        return o2.score - o1.score;
        
    }
    
}
    
   
    


   
        
        
    
    


