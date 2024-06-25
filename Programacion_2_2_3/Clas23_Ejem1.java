package Programacion_2_2_3;

import java.util.Scanner;

public class Clas23_Ejem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[][] A=new int[0][0],B=new int[0][0],R=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Generar matriz A y B");
	      	System.out.println("2.Mostrar matriz A y B");
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
	      	mostrarMatriz(A, F, C);
	      	mostrarMatriz(B, F, C);
	      	break;
	      	}
	}while(op!=0);
}
	public static void generarMatriz(int M[][],int f,int c) {
	Scanner entrada=new Scanner (System.in);
	for(int i=0;i<f;i++) {
		for(int j=0;j<c;j++) {
			System.out.println("Elemento[" +i+"][" +j+"]=");
			M[i][j]=entrada.nextInt();
		}
	}
	System.out.println(" ");
	}
	public static void mostrarMatriz(int M[][], int c, int f) {
		
	
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("  "+M[i][j]);
				
			}
			System.out.println("  ");
		}
		System.out.println("  ");
	}
}


