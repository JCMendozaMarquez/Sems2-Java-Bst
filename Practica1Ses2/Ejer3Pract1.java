package Practica1Ses2;

import java.util.Scanner;

public class Ejer3Pract1 {

	public static void main(String[] args) {
		//  JUAN CARLOS MENDOZA MENDOZA|
		int  X,Y;
		
		System.out.println("Numeros generados entre   X y Y");//X=0,Y=15
		double t;
		
        Scanner in=new Scanner(System.in);
        System.out.print("Introduce X: ");
		X=in.nextInt();
		System.out.print("Introduce Y: ");
		Y=in.nextInt();
		
        System.out.print("Introduce t: ");
		t=in.nextDouble();
		
		for (int i=0 ;i<t;i++) {
			
			double numAleatorio=Math.random()*(2*5)+5;// (20-5)
			System.out.println(numAleatorio);
			
			int mayor=(int) Math.max(numAleatorio,numAleatorio+1);
	        int menor=(int) Math.min(numAleatorio, numAleatorio);  
	        System.out.println(("El mayor:")+mayor);
	        System.out.println(("El menor:")+menor);

	}

	}

}
