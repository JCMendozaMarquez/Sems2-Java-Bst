package Programcion_2;

import java.util.Scanner;

public class Clas6_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s,sf;
		Scanner entrada=new  Scanner (System.in);
		System.out.print("Escriba el sueldo: ");
		s=entrada.nextDouble();
		sf=Calcular(s);
		System.out.println("Sueldo final "+sf);
	}
	public static double Calcular (double s)
	{ double d=0;
		if ( s>4000)
		d=s*15/100;
	return (s-d);

	}

}
