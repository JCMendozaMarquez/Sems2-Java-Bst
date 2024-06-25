package Programacion_2_2_2;

import java.util.Scanner;

public class Clas19_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Imvertir un  vector");
		       System.out.println("2.Mostrar  vector");
		       System.out.println("2.Mostrar  vector");
		       System.out.println("Opcion: ");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                  T=entrada.nextInt();
		                  a=new int [T];
		                  generarElementos(a,T);
		                  break;
		          case 2:System.out.println("Vector");
		               mostrar(a,T);
		          break;
		          
		          
	             
		        
		}
		}while (op!=0);
		
	}
	public static void generarElementos(int M[],int N)

	{  Scanner entrada=new Scanner(System.in);
		for (int f=0; f<N;f++)
	{ System.out.println("Elemento "+f+" :");
	M[f]= entrada.nextInt();
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
