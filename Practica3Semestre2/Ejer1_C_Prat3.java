package Practica3Semestre2;

import java.util.Scanner;

public class Ejer1_C_Prat3 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		int m;
		
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce n: ");
	    m=entrada.nextInt();
	    fibunacci(m);
	}
	  public static void fibunacci(int n) {
		  int  a,b,c,t;	
			a=-1;
			b=1;
			t=4;
	for(int i=1;i<=n;i++) {
				
			
	    	c=a+b;
			a=b;
			b=c;
			System.out.print(","+c+" ,"+t);
	}
		
	  
	    }
		  
	  }
 
