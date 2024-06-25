package Programcion_2;

import java.util.Scanner;

public class Clas9_Ejem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		
		   Scanner entrada =new Scanner (System.in);		
	       System.out.println("Introduce el numero: ");
		   A=entrada.nextInt();
		  FactDig(A);
	}
	public static void FactDig(int B)
	 {
		 int D;
		 while(B!=0) {
			 D=B%10;
			 B=B/10;
			 Factorial(D);
		 } 
	 }
	public static void Factorial(int x)
	{
	int	f=1;
			for(int k=2;k<=x;k++)
			{f=f*k; 
			}
			System.out.println(" "+x+" "+f);
				
	}

}
