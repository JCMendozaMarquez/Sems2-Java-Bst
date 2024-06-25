package Programcion_2;

import java.util.Scanner;

public class Clas6_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B;
		Scanner entrada =new Scanner (System.in);
		System.out.print("Escriba un numero: ");
		A=entrada.nextInt();
		System.out.print("Escriba otro numero: ");
		B=entrada.nextInt();
		
		if (iguales (A,B)==true)
		{ System.out.println("iguales");}
		else
		{ System.out.println("Mayor "+ mayor (A,B));}
	}
	public static boolean iguales (int A ,int B)
	{ if (A==B)
	{ return (true);}
	else
	{ return(false);}
	
	}
public static int mayor (int A , int B)
{ if (A>B )
{ return (A);}
else 
{return (B);}
}
}

