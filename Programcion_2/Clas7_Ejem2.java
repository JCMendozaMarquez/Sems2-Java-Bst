package Programcion_2;

import java.util.Scanner;

public class Clas7_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X;
		Scanner entrada=new Scanner (System.in);
		System.out.print("Escriba un numero : ");
		X=entrada.nextInt();
		if(Primo(X)==true)
			System.out.println(X+" es primo");
		else
			System.out.println(X+" No es primo");
	}
	public static  boolean Primo (int X)
	{int i,C=0;
	for (i=2;i<=X/2;i++)
	{if (X% i==0)
		C++;
	}
		if (C==0)
			return (true);
		else 
			return(false);
		
	}

}
