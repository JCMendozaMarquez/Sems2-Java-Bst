package Programacion_2_2_2;

import java.util.Scanner;

public class Clas22_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] B=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Leer matriz");
	      	System.out.println("2.El mayor");
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
	      	case 2:  mayor (B,F,C);
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
	public static void mayor(int A[][],int f,int c) {
	int m=0;
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				if(i==0 && j==0) {
					m=A[0][0];
			}else {
				if(A[i][j]>m) {
					m=A[i][j];
				}
			}
		}
		
		}
		System.out.println("El mayor es: "+m);
	}
	

}
