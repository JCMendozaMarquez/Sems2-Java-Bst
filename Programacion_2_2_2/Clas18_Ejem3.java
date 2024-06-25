package Programacion_2_2_2;

import java.util.Scanner;

public class Clas18_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] a= new int [0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Imvertir un  vector");
		       System.out.println("2.Mostrar  vector");
		       System.out.println("3.rotar a la izquierda");
		       System.out.println("4.rotar mas de una vez");
		       System.out.println("5.rotar mas de una vez a la derecha");
		       System.out.println("6.rotar a la derecha ");
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
		            
		          case 4: System.out.println("Rotar N veces a la izquierda: "); 
		               System.out.println("K: ");
		               int K;
		               K=entrada.nextInt();
		               System.out.println("Vector original : ");
		               mostrar(a,T);
		               for(int x=1;x<=K;x++) {
		            	   rotarIzq(a,T);
		            	   mostrar (a,T);
		               }
		               break;
		               
		          case 5:System.out.println("Rotar N veces a la derecha: "); 
		               System.out.println("K: ");
		               int L;
	                   L=entrada.nextInt();
	                   System.out.println("Vector original : ");
	                   mostrar(a,T);
	                   for(int x=1;x<=L;x++) {
	            	          rotarDerM(a,T);
	            	          mostrar (a,T);
	               }
	               break;  
		          
		          case 6:System.out.println("Rotar a la derecha: ");
	               rotarDer(a,T);
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
	
	  public static void rotarDerM(int numeros[],int N) {
	   		int primero=numeros[0];
	   		int x;
	   		for(x=0;x<N;x++) {
	   			numeros[x]=numeros [x+1];
	   		}
	   	 numeros [x]=primero;
	   	 }
	 
	 
	 
	  public static void rotarDer(int numeros[],int N) {
   		int primero=numeros[0];
   		int x;
   		for(x=0;x<N;x++) {
   			numeros[x]=numeros [x+1];
   		}
   	 numeros [x]=primero;
   	 }
	 
	
	
	  public static void mostrar (int M[],int N)
      { for (int  f=0;f<N;f++)
 {
	    System.out.print( " "+M[f] );
 }
     System.out.println(" ");		

	}

}
