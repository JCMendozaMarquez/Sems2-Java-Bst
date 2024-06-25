
package Practica6Sem2Etapa2;

import java.util.Scanner;

public class Ejer2_Prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Mostrar vector");
		       System.out.println("3.Numeros aleatorios");
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
	                 	
		         case 3: aleatorios (a,T);
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

    public static void aleatorios(int V[],int T) {
		
		
		int numAleatorio=(int)(Math.random()*(4*10)+10);// (20-5)
        System.out.println(numAleatorio);
        int numAleatorio2=(int)(Math.random()*(4*10)+10);// (20-5)
        System.out.println(numAleatorio2);
		
		if(numAleatorio<numAleatorio2) {
			

			System.out.println("El menor es: "+numAleatorio+" y el mayor es:"+numAleatorio2);
		
			}else {
			System.out.println("El menor es: "+numAleatorio2+" y el mayor es:"+numAleatorio);
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
