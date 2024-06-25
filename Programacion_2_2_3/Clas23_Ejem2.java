package Programacion_2_2_3;

import java.util.Scanner;

public class Clas23_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] A=new int[0][0],B=new int[0][0],R=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Generar matriz A y B");
	      	System.out.println("2.Mostrar matriz A y B");
	      	System.out.println("3.Multiplicar  matriz A y B");
	      	System.out.println("Opcion");
	      	op=entrada.nextInt();
	      	switch(op) {
	      	case  1: System.out.println("Filas de las matriz: ");
	      	         F=entrada.nextInt();
	      	         System.out.println("Columnas de las matriz: ");
	      	         C=entrada.nextInt();
	      	         A=new int [F][C];
	      	         generarMatriz(A,F,C);
	      	         
	      	         System.out.println("Filas de las matriz: ");
	      	         F=entrada.nextInt();
	      	         System.out.println("Columnas de las matriz: ");
	      	         C=entrada.nextInt();
	      	         B=new int [F][C];
	      	         generarMatriz(B,F,C);
	      	         break;
	      	case 2: System.out.println("Matrices: ");
	      	mostrarMatriz(A);
	      	mostrarMatriz(B);
	      	break;
	      	case 3 : System.out.println("Multiplicacion de Matrices: ");
	      	        if(A[0].length==B.length)
	      	        {	R=new int[A.length][A[0].length];
	      	            multiMatrices(A,B,R);
	      	        	mostrarMatriz(A);
	      		      	mostrarMatriz(B);
	      		  	    mostrarMatriz(R);
	      	        }else 
	      	        	System.out.println("No existe la suma de matrices: ");
	      	        break;
	      	}	        	
	}while(op!=0);
}
	public static void generarMatriz(int M[][],int f,int c) {
	Scanner entrada=new Scanner (System.in);
	for(int i=0;i<f;i++) 
	  {   for(int j=0;j<c;j++) 
		{    M[i][j]=(int )((Math.random()*10)+1);
		}
	  }     System.out.println(" ");
	}
	public static void multiMatrices(int A[][], int B[][], int R[][]) {
		for(int a=0;a<B[0].length;a++)
		{ for(int i=0;i<A.length;i++)
		     { int suma=0;
		     for(int j=0;j<A[0].length;j++)
		     { 	 suma=A[i][j]*B[j][a];
		     }
			   R[i][a]=suma;
			 }
		}
	}
	public static void mostrarMatriz(int M[][]) {
		
	
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[0].length;j++) {
				System.out.print("  "+M[i][j]);
			}
			System.out.println("  ");
		}
		System.out.println("  ");
	}

}
