package Programacion_2_2_3;

import java.util.Scanner;

public class Clas24_Ejem4_Ejem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] C=new int[0][0];
		int op,T=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Matriz diagonal principal");
	      	System.out.println("2.Mostrar matriz ");
	      	System.out.println("3.Matriz diagonal secundaria");
	      	System.out.println("Opcion");
	      	op=entrada.nextInt();
	      	switch(op) {
	      	case  1: System.out.println("Tamaño matriz cuadrada: ");
	      	         T=entrada.nextInt();
	      	         C=new int[T][T];		      	      
	      	         diagonalPrincipal(C,T);    
	      	         break;
	      	case 2: mostrarMatriz(C, T, T);
	              	break;
	      	case 3:System.out.println("Tamaño matriz cuadrada secundaria: ");
 	               T=entrada.nextInt();
 	               C=new int[T][T];		      	      
 	              diagonalSecundaria(C,T);    
 	               break;
	      	}
	}while(op!=0);
}
	public static void diagonalPrincipal(int M[][],int t) {
	for(int i=0;i<t;i++) {
		for(int j=0;j<t;j++) {
			if(i<=j)
			M[i][j]=1;
			else
			M[i][j]=0;
		}
	}
	System.out.println(" ");
	}
	public static void diagonalSecundaria(int M[][],int t) {
		for(int i=0;i<t;i++) {
			for(int j=0;j<t;j++) {
				if(i+j>=t-1)
				M[i][j]=1;
				else
				  M[i][j]=0;
			}
		}	
		System.out.println(" ");	
	}
	public static void mostrarMatriz(int M[][], int f, int c) 
	{	for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
			System.out.print("  "+M[i][j]);
			}
			System.out.println("  ");
		}
	}

	}

