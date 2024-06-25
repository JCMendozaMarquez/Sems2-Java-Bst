package Practica1Ses2;

import java.util.Scanner;

public class Ejercicio1Pract1 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		double A,V;
		double r;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Inserte el radio : ");
		r=in.nextDouble();
		
	    A=4*Math.PI*(Math.pow(r,2));
		V = 1.333 *(Math.PI)*(Math.pow(r, 3));
		
		System.out.println("El area es de : "+A);
		
		System.out.print("EL volumen es de :"+V);
		
		
	}

}
