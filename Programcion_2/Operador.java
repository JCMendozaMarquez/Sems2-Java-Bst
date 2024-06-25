package Programcion_2;

import java.util.Scanner;

public class Operador {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
		
		double operador1;
		double operador2;
		
         Scanner in=new Scanner(System.in);
        
		System.out.print("Int 1: ");
		operador1=in.nextDouble();
		
		System.out.print("Int 2: ");
		operador2=in.nextDouble();
		
		System.out.println(Math.ceil(operador1));//26.0
		System.out.println(Math.floor(operador2));//15.0
		System.out.println(Math.pow(operador1, operador2));//2.4
		System.out.println(Math.max(operador1, operador2));//25.5
		System.out.println(Math.sqrt(operador1));// 5.0
	}

}
