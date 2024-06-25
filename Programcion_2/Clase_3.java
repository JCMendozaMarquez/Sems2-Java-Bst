package Programcion_2;

import java.util.Scanner;

public class Clase_3 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
		
		double a,r;//area y radio
	
		Scanner in=new Scanner(System.in);
		
		System.out.print("Introduce el radio de un circulo: ");
		r=in.nextDouble();
		
		a=Math.PI*(r*r);// para elevar al cuadrado otra opcion es : Math.pow(r,2)
		System.out.println("El area de una circunferencia de  radio "+r +" es : "+a);
	}

}
