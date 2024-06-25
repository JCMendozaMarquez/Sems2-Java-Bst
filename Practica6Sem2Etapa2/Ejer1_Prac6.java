package Practica6Sem2Etapa2;

import java.util.Scanner;

public class Ejer1_Prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Mostrar vector");
		       System.out.println("3.Serie Fibonacci ");//(0+1=1 / 1+1=2 / 1+2=3 / 2+3=5 / 3+5=8 / 5+8=13 / 8+13=21 / 13+21=34...)
		       System.out.println("opcion");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                T=entrada.nextInt();
		                a=new int [T];
		                leerElementos (a,T);
	                 	break;
		         case 2: System.out.println("Vector: ");
		                mostrar(a,T);
	                 	break;
		         case 3:System.out.println("Serie Fibonacci :");
		         
		         Fibunacci(a,T);
		         break;
		}
		}while(op!=0);
	}
	
	
	public static void leerElementos(int M[],int N)

	{  Scanner entrada=new Scanner(System.in);
		for (int f=0; f<N;f++)
	{ System.out.println("Elemento "+f+" :");
	M[f]= entrada.nextInt();
		}
	} 
	public static void Fibunacci(int M[],int N) {
		 int r,t;
		 t=3;
		 r=-1;
		  
	    for(int i=1;i<=N;i++) {
	    	System.out.println(", La serie es: "+r);
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
	public static void mostrar (int M[],int N)
	{ for (int  f=0;f<N;f++)
	{
		System.out.print( " "+M[f] );
	}
	System.out.println(" ");		

	}

}
