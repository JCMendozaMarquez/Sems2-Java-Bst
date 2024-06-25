package Programacion_2_2_2;

import java.util.Scanner;

public class Clas20_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Mostrar vector");
		       System.out.println("3.Burbuja mejorado Mejorado ");
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
		         case 3:  burbuajMM(a,T);
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
	public static void burbuajMM(int a[],int N) {
		int intervalo , i , j,k,temp;
		intervalo=N/2;
		while (intervalo>0) {
			for(i=intervalo;i<N;i++) {
				j=i-intervalo;
				while(j>=0) {
					k=j+intervalo;
					if(a[j]<=a[k])
						j=-1;
					else {
						temp=a[j];
						a[j]=a[k];
						a[k]=temp;
						j=j-intervalo;
					}
				}
			}//else
			intervalo=intervalo/2;
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
