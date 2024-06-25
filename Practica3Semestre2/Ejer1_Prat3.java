package Practica3Semestre2;

import java.util.Scanner;

public class Ejer1_Prat3 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		int m;
		
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce n: ");
	    m=entrada.nextInt();
	    series(m);
	}
	    public static void series(int n)
		{ int r;	
		  r=1;
	
	    for(int i=1;i<=n;i++)
	    {System.out.println("Es:"+r);
	    	if(r==1)
	    	{	r=r+1;
	    	} 	else {
	    		if(r==3) {
	    			r=r-2;
	    		}else {
	    			r=r+1;
	    		}
	    		
	    	}
	    }

	}

	}


