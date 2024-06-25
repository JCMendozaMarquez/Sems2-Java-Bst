package Programcion_2;

import java.util.Scanner;
public class Clas5_Ejemplo1 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
		int recibido;
		int numero =1000;
		Scanner in=new Scanner(System.in);
		numero=(int) (Math.random()+numero+1);
		System.out.println("\nTengo un numero entero entre 1 y "+numero);
		System.out.println("Puede adivinarlo");
		System.out.println("\nPor favor introduzca un numero:  \n ") ;
		recibido=in.nextInt();
		while (recibido != numero ) 
		{ if (recibido > numero ) 
			 {  System.out.println("\nEl numero es muy grande , por favor intenta de nuevo.");
		     }
			else
			{  System.out.println("\nEl numero es muy chico, porfavor intenta de nuevo."); 
			}
		recibido =in.nextInt();
		
		}
		System.out.println("\nHas adivinado el numero.");
	}
}
