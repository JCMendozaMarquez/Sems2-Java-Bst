package Programcion_2;

import java.util.Scanner;

public class Clas8_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce R: ");
	    R=entrada.nextInt();
	    Fibonacci(R);
	}
	    public static void Fibonacci(int p)
		{int i,x,b,y;	
		x=100;
		y=1;
	    for( i=1;i<=p;i++)
	    {
	    	if(i%2==0)
	    	{	System.out.println(""+y);
	    	y=y+1;
	    	}
	    	else { 		
	    	System.out.println(""+x);
	    	x=x-1;
	    	}
		
	    	
	    	
	    }
		
	}

}
