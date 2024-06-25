package Programcion_2;

import java.util.Scanner;

public class Clas8_Ejem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int P;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce P: ");
	    P=entrada.nextInt();
	    Fibonacci(P);
	}
    public static void Fibonacci(int M)
	{int k,x,b;	
	x=1;
	
    for( k=1;k<=M;k++)
    {
     System.out.println(""+x);
      x=x*2;
    	
    }
	    

	}

}
