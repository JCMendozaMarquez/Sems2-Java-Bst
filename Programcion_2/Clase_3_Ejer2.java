package Programcion_2;

import java.util.Scanner;

public class Clase_3_Ejer2 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
    double a,b,c;  // coeficientes  
    double x1,x2,d; // soluciones y edeterminante
	
	Scanner in=new Scanner(System.in);
    
    System.out.println("Introduzca primer coeficiente (a): ");
    a=in.nextDouble();
    System.out.println("Introduzca segundo coeficiente (b): ");
    b=in.nextDouble();
    System.out.println("Introduzca tercer coeficiente (c): ");
    c=in.nextDouble();
    
    d=((b*b)-4*a*c);
    if(d<0);

    x1=(-b+Math.sqrt(d))/(2*a);
	x2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("Solucion: "+ x1);	
	System.out.println("Solucion: "+ x2);	
	}

}
