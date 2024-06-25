package Programacion_2_2_2;

import java.util.Scanner;

public class Clas17_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int[] b= new int [0];
		int[] c= new int [0];
		int op,T=0,K=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Imvertir un  vector");
		       System.out.println("2.Sumar 2 vectores");
		       System.out.println("Elija unaopcion: ");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                T=entrada.nextInt();
		                a=new int [T];
		                generarElementos(a,T);
		                System.out.println("Vector original: ");
		                mostrar(a,T);
		                invertir(a,T);
		                System.out.println("Vector invertido: ");
		                mostrar(a,T);
	                 	break; 	
		          case 2:  System.out.println("Tamaño del vector : ");
		                 T=entrada.nextInt();
		                 a=new int[T];
		                 generarElementos(a,T);
		                 b=new int [T];
		                 generarElementos(b,T);
		                 c=new int [T];
		                 suma(a,b,c,T);
		                 mostrar(a,T);
		                 mostrar(b,T);
		                 mostrar(c,T);
		                 break;
		                 
		          
		}
		}while(op!=0);
	}

	public static void generarElementos(int M[],int N)

	{  Scanner entrada=new Scanner(System.in);
		for (int f=0; f<N;f++)
	{ System.out.println("Elemento "+f+" :");
	M[f]= entrada.nextInt();
		}
	} 
	public static void invertir (int V[],int T) {
		int f=T-1 , aux=0;
		for (int i=0;i<=T/2;i++) {
			aux=V[i];
			V[f]=aux;
			f--;
		}
		
	}
	
	
	public static void suma (int X[],int Y[],int Z[],int T ) { // t o n da lo mismo pro ahora 
		for(int f=0;f<T;f++) {
			Z[f]=X[f]+Y[f];
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
