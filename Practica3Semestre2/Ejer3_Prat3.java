package Practica3Semestre2;

import java.util.Scanner;

public class Ejer3_Prat3 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|   
		int  X,Y;
		
		System.out.println("Numeros generados entre   X y Y");
		int t;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Introduce X: ");
		X=in.nextInt();
		System.out.print("Introduce Y: ");
		Y=in.nextInt();
        System.out.print("Introduce t: ");
		t=in.nextInt();
		
	    for (int i=0 ;i<t;i++) {
			
	    	
			int numAleatorio=(int) (Math.random()*(90*10)+100);// (20-5)
			System.out.println("el numero aleatorio es: "+numAleatorio);
			
			int inv,j2,j3,j4;
		    inv= numAleatorio%10;
		    j2=numAleatorio/10;
		    j3=j2%10;
		    j4=numAleatorio/100;
		    System.out.println("El inverso es: "+inv+j3+j4);
	}
	  

	    
	}

}
