package Programcion_2;

import java.util.Scanner;

public class Ejercicio2_Clas4 {

	public static void main(String[] args) {
		//JUAN CARLOS MENDOZA MENDOZA
		System.out.println("Numeros generados entre  25y 40, condecimales");
		double t;
		int y;
		
        Scanner in=new Scanner(System.in);
		
		System.out.print("Introduce t: ");
		t=in.nextDouble();
		System.out.print("Introduce y: ");
		y=in.nextInt();
		
		for (int i=y;i<t;i++) {
			
			double numAleatorio=Math.random()*(5*7)+5;// (20-5)
			System.out.println(numAleatorio);

	}


	}

}
