package Programacion_2_2_2;

import java.util.Scanner;

public class Clas19_Ejem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Imvertir un  vector");
		       System.out.println("2.Mostrar  vector");
		       System.out.println("3.rotar a la izquierda");
		       System.out.println("4.Busqueda secuencial");
		       System.out.println("5.Ordenacion pro burbuja");
		       System.out.println("Opcion: ");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                  T=entrada.nextInt();
		                  a=new int [T];
		                  generarElementos(a,T);
		                  break;
		          case 2:System.out.println("Vector");
		               mostrar(a,T);
		          break;
		          
		          case 3: System.out.println("Rotar a la izquierda: ");
		               rotarIzq(a,T);
		               mostrar(a,T);
		               break;
		            
		          case 4:System.out.println("Busqueda secuencial: ");
	               busquedaSecuencial(a,T);
	               mostrar(a,T);
	               break;
		          case 5: System.out.println("Busqueda secuencial: ");
	               ordenacionBurbuja(a,T);
	               mostrar(a,T);
	               break;
		        
		}
		}while (op!=0);
		
	}
	public static void generarElementos(int M[],int N)

	{  Scanner entrada=new Scanner(System.in);
		for (int f=0; f<N;f++)
	{ System.out.println("Elemento "+f+" :");
	M[f]= entrada.nextInt();
		}
	} 
	 public static void rotarIzq (int numeros[],int N) {
		 int primero=numeros[0];
		 int x;
		 for(x=0;x<N-1;x++) {
			 numeros[x]=numeros[x+1];
		 }
			 numeros[x]=primero;
	 }
	
	 public static void  busquedaSecuencial(int A[], int N) {
		 Scanner entrada =new Scanner (System.in);
		 boolean sw=false ;
		 int x;
		 System.out.println("Buscar :");
		 x=entrada.nextInt();
		 for (int f=0;f<N;f++) {
			 if(A[f]==x) {
				 sw=true;
				 System.out.println("esta es la poscicion : "+f);
		 
			 }
		 } if (sw==false) {
			 System.out.println(x+" No se emcontro ");
		 } 
	 }
	 
	 public static void   ordenacionBurbuja (int A[], int N) {
		 int x;
		 for(int f=0;f<N-1;f++)
		 { for(int k=f+1;k<N;k++)
        		 { if (A[f]>A[k]) {
        			 x=A[f];
        			 A[f]=A[k];
        			 A[k]=x;
        		      }
		         }		 
		 }
	 }
	 
	 
	
	
	  public static void mostrar (int M[],int N)
      { for (int  f=0;f<N;f++)
 {
	    System.out.print( " "+M[f] );
 }
     System.out.println(" ");		
		

		
	}

}
