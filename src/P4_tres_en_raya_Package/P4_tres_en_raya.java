package P4_tres_en_raya_Package;

import java.util.Scanner;
import java.util.Random;


public class P4_tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        //scanner para leer la entrada del usuario

		Scanner z = new Scanner(System.in);
        //random para decidir al azar quién empieza

		Random r = new Random();
        //variable para controlar si se juega otra partida

		boolean VolverAjugar = true;
        //bucle principal del juego

		while(VolverAjugar) {
			
        //solicitar nombres de los jugadores
	
		System.out.print("Introduce el nombre del jugador 1:");
		
		String jugador1 = z.nextLine();
		
		System.out.print("Introduce el nombre del jugador 2:");

		String jugador2 = z.nextLine();	
		
        //decidir al azar quién juega primero

		String turno = r.nextInt(2) == 0 ? jugador1 : jugador2;
		
        //asignar símbolo basado en el jugador que empieza

        char simboloTurno = (turno.equals(jugador1)) ? 'X' : 'O';
		
        //crear tablero vacío de 3x3
        char [][] tablero = new char [3][3];
        
        for(int i = 0;i<3; i++) {
        
        for (int j = 0;j< 3;j++) {
        	
        	tablero[i][j] = '_'; //inicializar con guiones bajos las casillas vacías
        }
        	
        }
        
        //variable para controlar si el juego ha terminado

        boolean finJuego = false;
        
        //bucle para jugar una partida completa

        while (!finJuego) {
        	
            //mostrar el tablero actual
	
        	System.out.println("Tablero:");
        	
        	for(int i = 0; i < 3 ; i++) {
        		
        	
        		for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
        		
        	}
         System.out.println();

        }
        //indicar de quién es el turno
	
        System.out.println("Es el turno de " + turno + " (" + simboloTurno + ")");

        int fila;
        int columna;
        
        //solicitar una jugada válida al jugador actual

        while(true) {
        	
        	System.out.print("introduce una fila (0,1,2)");
            fila = z.nextInt();
            System.out.print("Introduce una columna (0, 1, 2): ");
            columna = z.nextInt();
            
            //verificar si la posición es válida y está vacía

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '_') {
            	
                tablero[fila][columna] = simboloTurno;//actualizar tablero
                break; //salir del bucle si la jugada es válida
            }else {
            	
            System.out.println("Esa casilla ya está ocupada o no es válida. Intentalo de nuevo.");
	
            }
            
        }
        //comprobar si el jugador actual ha ganado

        boolean ganador = false;
        
        //comprobar filas y columnas

        for (int i = 0; i < 3; i++) {
        	
            if ((tablero[i][0] == simboloTurno && tablero[i][1] == simboloTurno && tablero[i][2] == simboloTurno) ||
                (tablero[0][i] == simboloTurno && tablero[1][i] == simboloTurno && tablero[2][i] == simboloTurno)) {
                ganador = true;
            }
        }
        
        //comprobar diagonales

        if ((tablero[0][0] == simboloTurno && tablero[1][1] == simboloTurno && tablero[2][2] == simboloTurno) ||
                (tablero[0][2] == simboloTurno && tablero[1][1] == simboloTurno && tablero[2][0] == simboloTurno)) {
                ganador = true;
            }
       //si hay un ganador, finalizar la partida
  
      if(ganador) {
    	  
      System.out.println( turno + " ha ganado");
      finJuego = true;

    	  
      }else {
          //comprobar si hay un empate
  
    	  boolean empate = true;
    	  for(int i = 0; i < 3 ; i++) {
    		  
    		  for (int j = 0; j < 3; j++) {
    			  
    			  if (tablero [i][j] == '_'){
    				  
    				  empate = false;//si hay una casilla vacía, no hay empate
    				  
    				  break;
    			  }
    		  }
    	  }
    	  
    	  if(empate) {
    		  
    		         System.out.println("Es un empate");
         finJuego = true;  
         
    	  }
    	  
      }
        
      //cambiar de turno si el juego no ha terminado

      if(!finJuego) {
    	  if(turno.equals(jugador1)) {
    		  
    		  turno = jugador2;
    		  
              simboloTurno = 'O';
              	  
    	  }else {
    		  
    		  turno = jugador1;
              simboloTurno = 'X';

    	  }
      }
      
      }
      //mostrar el tablero final
   
       System.out.println("Tablero final:");
       for (int i = 0; i < 3; i++) {
    	   
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            
            System.out.println();
        }  
        
       //preguntar si se quiere jugar otra partida
 
       System.out.print("Quieres jugar otra vez? (s/n): ");
       char respuesta = z.next().charAt(0);
       z.nextLine(); //consumir el salto de línea restante

       if (respuesta == 's') {
           VolverAjugar = true; //reiniciar el juego
       } else {
    	   VolverAjugar = false; //salir del bucle principal

           System.out.println("Gracias por jugar");
       } 
        
        
        
		}
		
		
		

		
		
		
		
		
		
		
		
	}

}
