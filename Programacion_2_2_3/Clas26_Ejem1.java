package Programacion_2_2_3;

import java.util.Scanner;

public class Clas26_Ejem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] Datos=new  String[50];
	Scanner entrada=new  Scanner (System.in);
			 int op,T=-2 ;
			 do { System.out.println("0.Salir");
			      System.out.println("1.Cargar un nombre y su edad");
			      System.out.println("2.Mostrar datos");
			      System.out.println("3.Promedio de edades");
			      System.out.println("Opciones");
				op=entrada.nextInt();
			 switch(op)     
			 { case 1: T=T+2;	
			          cargarDatos(Datos,T);
			           break;
			 case 2: System.out.println("Datos");
		              mostrar(Datos,T);
		              break;
			 case 3: System.out.println("Promedio de edades: ");
	                 promedioEdades(Datos,T);
	                 break;
			 }	
			 }while(op!=0);
			}
			
		public static void cargarDatos(String D[],int N)
		{     Scanner entrada=new  Scanner (System.in);
		
			    System.out.println("Nombre: ");
		        D[N]=entrada.next();
		        System.out.println("Edad: ");
		        D[N+1]=entrada.next();
		}
		public static void mostrar(String D[],int N) {
			
			 for(int i=0;i<=N;i=i+2) {
				 System.out.print(" "+D[i]);
				 System.out.print(" "+D[i+1]);
				 System.out.println(" ");
			 }	 
		}
		
		public static void promedioEdades (String D[],int N) {
			float s=0,c=0,p=0;
			 for(int j=1;j<=N+1;j=j+2) {
				 s=s+Integer.parseInt(D[j]);
				 c++;
			 }
			 p=s/c;
			 System.out.println(" "+p);
		}
		
}