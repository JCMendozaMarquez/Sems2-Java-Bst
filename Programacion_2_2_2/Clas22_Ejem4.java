package Programacion_2_2_2;

import java.util.Scanner;

public class Clas22_Ejem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] B=new int[0][0];
		int op,F=0,C=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Leer matriz");
	      	System.out.println("2.Sumar fila");
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
	      	case 2:  sumarfilas (B,F,C);
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
	public static void sumarfilas(int A[][],int f,int c) {
	int s=0;
		for(int i=0;i<f;i++) {
			s=0;
			for(int j=0;j<c;j++) {
			s=s+A[i][j];
		}
			System.out.println("La suma de la fila "+i+" es: "+s );
		}
		
	}

}
