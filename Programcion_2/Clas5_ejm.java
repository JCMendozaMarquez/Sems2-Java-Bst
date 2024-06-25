package Programcion_2;

import java.util.Scanner;

public class Clas5_ejm {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
		int num1,num2;
		Scanner entrada=new Scanner (System.in);
		System.out.print("Escriba el numero1: ");
		num1=entrada.nextInt();
		System.out.print("Escriba el numero2: ");
		num2=entrada.nextInt();
		System.out.println("Suma"+suma(num1,num2));
    	}
	   	public static int suma(int a ,int b)
		{return(a+b);
		}

	}


