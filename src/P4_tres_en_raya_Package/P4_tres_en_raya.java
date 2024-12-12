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
        
        
        
        
        
        
		}
		
		
		

		
		
		
		
		
		
		
		
	}

}
