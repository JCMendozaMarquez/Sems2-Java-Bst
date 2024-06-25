package Programacion_2_2_3;

import java.util.Scanner;

public class Clas25_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new  Scanner (System.in);
	 int [][]B=new int [0][0];
	 int op,F=0 ,C=0;
	 do { System.out.println("0.Salir");
	      System.out.println("1.Matriz fila");
	      System.out.println("2.Mostrar Matriz");
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
public static void mostrarMatriz(int M [][],int f , int c)
{       for(int i=0;i<f;i++) 
       {       for(int j=0;j<c;j++)
                  {  System.out.print(" "+M[i][j]);
                  }
       System.out.println(" ");
       }
}



}