package Practica6Sem2Etapa2;

import java.util.Scanner;

public class Ejer4_Prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Notas");
		       System.out.println("opcion");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                T=entrada.nextInt();
		                a=new int [T];
		                leerElementos (a,T);
	                	break;
		     
		
		         case 2:  //a=new int [T]; 
		        	    promedios(a,T);
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
	public static void promedios (int M[],int N) {
	int A;
	Scanner in=new Scanner(System.in);
	
	System.out.print("Inserte la nota: ");
	A=in.nextInt();
		for(int i=0;i<N;i++) {
			if   ( A>=51 ) {
				System.out.println("Aprobado");
			}else {
				System.out.println("Reprobado");
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
