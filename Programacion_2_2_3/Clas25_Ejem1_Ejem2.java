package Programacion_2_2_3;

import java.util.Scanner;

public class Clas25_Ejem1_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[][] C=new int[0][0];
		int op,T=0;
		do { System.out.println("0.Salir");
	      	System.out.println("1.Matriz en C");
	      	System.out.println("2.Mostrar matriz ");
	    	System.out.println("3.Mostrar matriz relog ");
	      	System.out.println("Opcion");
	      	op=entrada.nextInt();
	      	switch(op) {
	      	case  1: System.out.println("Tamaño matriz cuadrada: ");
	      	         T=entrada.nextInt();
	      	         C=new int[T][T];		      	      
	      	         matrizC(C,T);    
	      	         break;
	      	case 2: mostrarMatriz(C, T, T);
	              	break;
	      	case  3: System.out.println("Tamaño matriz cuadrada: ");
 	         T=entrada.nextInt();
 	         C=new int[T][T];		      	      
 	        matrizrelog (C,T);    
 	         break;  	
	      	}
	}while(op!=0);
}
	public static void matrizC(int M[][],int t) {
	for(int i=0;i<t;i++) {
		for(int j=0;j<t;j++) {
			if(i+j==j || i==0  || j==M.length-4 || i==M.length-1)
			M[i][j]=1;
			else				
			M[i][j]=0;
		
	}
	
	}
}
	public static void matrizrelog(int M[][],int t) {
		
		for(int i=0;i<t;i++) {	//t=4 donde i=0 columna
		     for(int j=0;j<t;j++) {// donde j=0 fila    	                
		    	 if(j+i==M.length-M.length || i==1|| j==5 || i==5 || i==2 ||i==1 || j==4 || i==3 ||j==0) {	    		   	 
		 			M[i][j]=1;
                     if(j==2 ) {
                   	          M[i][j]=0;
                   	  if(i==j) {
                   	           M[i][j]=1;   }
                     }else {
                   	  M[i][j]=1;
                     }
		    	 }else {
		 			M[i][j]=0; 	
		    	 }
		}
		
	}
			
		
	
		
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
