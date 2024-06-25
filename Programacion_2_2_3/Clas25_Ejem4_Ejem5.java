package Programacion_2_2_3;

import java.util.Scanner;

public class Clas25_Ejem4_Ejem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new  Scanner (System.in);
		 int [][]B=new int [0][0];
		 int op,F=0 ,C=0;
		 do { System.out.println("0.Salir");
		      System.out.println("1.Matriz fila");
		      System.out.println("2.Mostrar Matriz");
		      System.out.println("3.Mostrar Matriz gusano en  fila");
		      System.out.println("4.Mostrar Matriz gusano en  columna");
		      System.out.println("Opciones");
		      op=entrada.nextInt();
		 switch(op)     
		 { case 1: System.out.println("Filas");
		           F=entrada.nextInt();
		           System.out.println("Columnas");
		           C=entrada.nextInt();
		           B=new int [F][C];
		           matrizFilas(B,F,C);
		           break;
		 case 2: System.out.println("Filas");
	              mostrarMatriz(B,F,C);
	              break;
		 case 3: System.out.println("Filas");
                 F=entrada.nextInt();
                 System.out.println("Columnas");
                 C=entrada.nextInt();
                 B=new int [F][C];
			     matrizgusanofila(B,F,C);
                 break;
		 case 4: System.out.println("Filas");
                F=entrada.nextInt();
                System.out.println("Columnas");
                C=entrada.nextInt();
                B=new int [F][C];
	            matrizgusanocolumna(B,F,C);
               break;
		 }	
		 }while(op!=0);
		}
		
	public static void matrizFilas(int M[][],int f ,int c)
	{ int x=1;
	         for(int i=0;i<f;i++)
	         {       for(int j=0;j<c;j++)
	                 {
	        	       M[i][j]=x; 
	                 }
	         x=x+1;
	         }
		
	}
	public static void matrizgusanofila (int M[][],int f ,int c) {
		int x=1;
		 for(int i=0;i<f;i++) {
			 if (i%2==0) {
				 for(int j=0;j<c;j++) {
					 M[i][j]=x;
					 x=x+1;
				 }
			 }else {
				 for(int j=c-1;j>-1;j--) {
					 M[i][j]=x;
					 x=x+1;
				 }
			 }		 
		 }
	}
	
	public static void matrizgusanocolumna (int M[][],int f ,int c) {
		int x=1;
		 for(int j=0;j<f;j++) {
			 if (j%2==0) {
				 for(int i=f-1;i>-1;i--) {
					 M[i][j]=x;
					 x=x+1;
				 }
			 }else {
				 for(int i=0;i<f;i++) {
					 M[i][j]=x;
					 x=x+1;
				 }
			 }		 
		 }
	}
	
	public static void mostrarMatriz(int M [][],int f , int c)
	{       for(int i=0;i<f;i++) 
	       {       for(int j=0;j<c;j++)
	                  {  System.out.print(" "+M[i][j]);
	                  }
	       System.out.println(" ");
	       }
	}


}
