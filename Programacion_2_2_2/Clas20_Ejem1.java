package Programacion_2_2_2;

import java.util.Scanner;

public class Clas20_Ejem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Mostrar vector");
		       System.out.println("3.Binarios ");
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
		         
		         busquedaBinaria(a,T);
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
	public static void busquedaBinaria (int M[],int N) {
		Scanner entrada=new Scanner(System.in);
		int izq=0 , der=N-1,cen=0;
		boolean sw=false;
		System.out.println("Buscar a: ");
		int x=entrada.nextInt();
		while (izq<=der && sw==false) {
			cen=(izq+der)/2;
			if(x==M[cen] ) {
				sw=true;
				System.out.println("Posicion: "+cen);
			}else {
				if(x>M[cen])
					izq=cen+1;
				else
					der=cen-1;
			}
		}
		if(sw==false)
			System.out.println("Dato inexistente ");
		
	}
	public static void mostrar (int M[],int N)
	{ for (int  f=0;f<N;f++)
	{
		System.out.print( " "+M[f] );
	}
	System.out.println(" ");
	}

}
