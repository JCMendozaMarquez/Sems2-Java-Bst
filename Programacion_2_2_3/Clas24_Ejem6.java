package Programacion_2_2_3;

import java.util.Scanner;

public class Clas24_Ejem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		//Falta lo del zorro
		//
		Scanner entrada=new Scanner(System.in);
		int[][] C=new int[0][0];
		int op,T=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Matriz diagonal principal");
	      	System.out.println("2.Mostrar matriz ");
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
	      	}
	}while(op!=0);
}
	public static void diagonalPrincipal(int M[][],int t) {
	int n=0,y=3;
		for(int i=0;i<t;i++) {	//t=4 donde i= 0 columna
		     for(int j=0;j<t;j++) {// donde j=0 fila 
		    	 if(i+j==M.length-1|| i==0 || i==M.length-1)
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
