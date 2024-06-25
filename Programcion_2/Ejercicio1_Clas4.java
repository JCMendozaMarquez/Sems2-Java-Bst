package Programcion_2;

import java.util.Scanner;

public class Ejercicio1_Clas4 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
		
		System.out.println("Numeros generados entre   0 y 15, condecimales");
		double t;
		
        Scanner in=new Scanner(System.in);
		
		System.out.print("Introduce t: ");
		t=in.nextDouble();
		
		for (int i=0 ;i<t;i++) {
			
			double numAleatorio=Math.random()*(2*5)+5;// (20-5)
			System.out.println(numAleatorio);

	}
	
	}

}
