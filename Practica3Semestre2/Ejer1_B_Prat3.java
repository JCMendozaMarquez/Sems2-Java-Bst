package Practica3Semestre2;

import java.util.Scanner;

public class Ejer1_B_Prat3 {

	public static void main(String[] args) {
		//JUAN CARLOS MENDOZA MENDOZA|
	    int m;	
		Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce n: ");
	    m=entrada.nextInt();
	    series(m);
	}
	 public static void series(int n) {
		 int r,t;
		 t=3;
		 r=-1;
		  
	    for(int i=1;i<=n;i++) {
	    	System.out.println("La serie es: "+r);
	    	if(r==-1)
	    	{	r=0;	
	    	} else {
	    		r=r+3;
	    		if(r==3) {
	    			
	    	    }else {
	    			r=r+t-1;
	    			t=t+2;
	    			
	    		}
	    	}	
	    }
	
	 }
}
