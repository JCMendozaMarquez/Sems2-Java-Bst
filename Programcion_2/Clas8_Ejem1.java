package Programcion_2;

import java.util.Scanner;

public class Clas8_Ejem1 {

	public static void main(String[] args) {
		// JCMM
		int N;
		Scanner entrada =new Scanner (System.in);
		System.out.println("Introduce N: ");
	    N=entrada.nextInt();
	    Fibonacci(N);
	}
		public static void Fibonacci(int M)
		{int k,a,b,c;	
		a=-1;
		b=1;
    for( k=1;k<=M;k++)
    {	c=a+b;
		a=b;
		b=c;
		System.out.println(""+c);
		}
		
		
		

	}

}
