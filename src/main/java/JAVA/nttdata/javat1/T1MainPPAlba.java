/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.nttdata.javat1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import JAVA.nttdata.javat1.game.Game;

/**
 *
 * @author Alba
 */
public class T1MainPPAlba {
	
	//Método launchAndStart//
  
	private static void launchAndStart() {
		
        Game g1= new Game();
        g1.menu();
        
   }
    public static void main(String[] args) {
    	
    	Logger log = LoggerFactory.getLogger(T1MainPPAlba.class);
    	
    	log.info("LANZAMIENTO DEL PROGRAMA");
    	
        launchAndStart();
        
        log.info("FIN DEL PROGRAMA");
        
    }

    

        
}

