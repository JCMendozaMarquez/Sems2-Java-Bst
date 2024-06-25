package Programcion_2;

import java.util.Scanner;

public class Clas5_Ejem3 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		int num1,num2;
		Scanner entrada =new Scanner (System.in);
		System.out.print("Escriba el numero 1:");
		num1=entrada.nextInt();
		System.out.print("Escriba el numero 2:");
		num2=entrada.nextInt();
		System.out.println("Suma"+ suma (num1,num2));
		System.out.println("Resta"+ resta (num1,num2));
		System.out.println("producto"+ multiplica (num1,num2));
		System.out.println("Division"+ division (num1,num2));
		System.out.println("division"+ division(num2,num1));
		System.out.println("Residuo"+ residuo (num1,num2));
		System.out.println("residuo"+ residuo (num2,num1));
	}
	public static int suma (int a,int b)
	{return(a+b);
	}
	public static int resta(int a,int b)
	{return(a-b);
	}
	public static int multiplica(int a,int b)
	{return(a*b);
	}
	public static int division(int a,int b)
	{return(a/b);
	}
	public static int residuo (int a,int b)
	{return(a%b);
	}

}
