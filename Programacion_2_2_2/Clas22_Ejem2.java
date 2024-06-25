package Programacion_2_2_2;

import java.util.Scanner;

public class Clas22_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] B=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Leer matriz");
	      	System.out.println("2.Mostrar matriz");
	      	System.out.println("3.Pares e impares");
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
	      	case 3: contarParesImpares(B,F,C);
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
	public static void contarParesImpares(int A[][],int f,int c) {
		double cp=0,ci=0;
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				if(A[i][j]%2==0) {
					cp++;
			}else {
				ci++;
			}
		}
		
		}
		System.out.println("Cantidad de pares es: "+cp);
		System.out.println("Cantidad de pares es:"+ci);
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
