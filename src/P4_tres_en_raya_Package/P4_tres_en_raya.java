package P4_tres_en_raya_Package;

import java.util.Scanner;
import java.util.Random;


public class P4_tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner z = new Scanner(System.in);
		
		Random r = new Random();
		
		boolean VolverAjugar = true;
		
		while(VolverAjugar) {
			
		System.out.print("Introduce el nombre del jugador 1:");
		
		String jugador1 = z.nextLine();
		
		System.out.print("Introduce el nombre del jugador 2:");

		String jugador2 = z.nextLine();	
		
		String turno = r.nextInt(2) == 0 ? jugador1 : jugador2;
		
        char simboloTurno = (turno.equals(jugador1)) ? 'X' : 'O';
		
		
        char [][] tablero = new char [3][3];
        
        for(int i = 0;i<3; i++) {
        
        for (int j = 0;j< 3;j++) {
        	
        	tablero[i][j] = '_';
        }
        	
        }
        
        boolean finJuego = false;
        
        while (!finJuego) {
        	
        	
        	System.out.println("Tablero:");
        	
        	for(int i = 0; i < 3 ; i++) {
        		
        	
        		for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
        		
        	}
         System.out.println();

        }
        	
        System.out.println("Es el turno de " + turno + " (" + simboloTurno + ")");

        int fila;
        int columna;
        
        while(true) {
        	
        	System.out.print("introduce una fila (0,1,2)");
            fila = z.nextInt();
            System.out.print("Introduce una columna (0, 1, 2): ");
            columna = z.nextInt();
            

            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '_') {
            	
                tablero[fila][columna] = simboloTurno;
                break;
            }else {
            	
            System.out.println("Esa casilla ya está ocupada o no es válida. Intentalo de nuevo.");
	
            }
            
        }
        
        
        
        
        
        
        }
        
        
        
        
        
		}
		
		
		

		
		
		
		
		
		
		
		
	}

}
