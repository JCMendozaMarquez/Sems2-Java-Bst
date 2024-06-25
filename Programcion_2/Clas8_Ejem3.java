package Programcion_2;

import java.util.Scanner;

public class Clas8_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hacer hay foto y video apartir de 01:00 14-09
		
		int n;
		
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce n: ");
	    n=entrada.nextInt();
	    Fibonacci(n);
	}
	    public static void Fibonacci(int m)
		{int r;	
		r=7;
	
	    for(int i=1;i<=m;i++)
	    {System.out.println("Es:"+r);
	    	if(r==5)
	    	{	r=7;
	    	} else { 		
	    	r=r-1;
	  
	    	}	
	    }

	}

}
