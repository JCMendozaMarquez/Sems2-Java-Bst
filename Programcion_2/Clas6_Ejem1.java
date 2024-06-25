package Programcion_2;

import java.util.Scanner;

public class Clas6_Ejem1 {

	public static void main(String[] args) {
		// Juan Carlos Mendoza Marquez 
		
		double base , altura ,area ,perim;
		Scanner entrada=new Scanner (System.in);
		
		System.out.print("Escriba la base: ");
		base =entrada.nextDouble();
		System.out.print("Escriba la altura: ");
		altura =entrada.nextDouble();
	
		area=  CalcularA(base,altura);
		perim=CalcularP(base,altura);
	    System.out.println("Area: "+ area);
     	System.out.println("Perimetro : "+ perim);
	}
	public static double CalcularA( double B, double A)
	{ return(A*B/2);
	}
	public static  double CalcularP (double B, double A)
	{ double H=Math.sqrt( Math.pow(B,2)+Math.pow(A,2));
	return(B+A+H);
	}

}
