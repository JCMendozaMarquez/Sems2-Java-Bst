package Programacion_2_2_2;

import java.util.Scanner;

public class Clas21_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] B=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Leer matriz");
	      	System.out.println("2.Mostrar matriz");
	      	System.out.println("Opcion");
	      	op=entrada.nextInt();
	      	switch(op) {
	      	case  1:System.out.println("Filas de la matriz: ");
	      	   F=entrada.nextInt();
	      	   System.out.println("Columnas de la matriz: ");
	      	   C=entrada.nextInt();
	      	   B=new int [F][C];
	      	   leerMatriz(B,F,C);
	      	break;
	      	case 2: System.out.println("Matriz:");
	      	mostrarMatriz(B,F,C);
	      	break;
	      	}
	}while(op!=0);
}
	public static void leerMatriz(int M[][],int f,int c) {
	Scanner entrada=new Scanner (System.in);
	for(int i=0;i<f;i++) {
		for(int j=0;j<c;j++) {
			System.out.println("Elemento[" +i+"][" +j+"]=");
			M[i][j]=entrada.nextInt();
		}
	}
	System.out.println(" ");
	}
	public static void mostrarMatriz(int M[][],int f,int c) {
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				System.out.print("  "+M[i][j]);
			}
			System.out.println("  ");
		}
	}
}
