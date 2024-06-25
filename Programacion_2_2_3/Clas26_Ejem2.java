package Programacion_2_2_3;

import java.util.Scanner;

public class Clas26_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][]  Datos=new  String[50][4];
		Scanner entrada=new  Scanner (System.in);
				 int op,T=-1 ;
				 do { System.out.println("0.Salir");
				      System.out.println("1.Cargar un nombre y sus notas");
				      System.out.println("2.Mostrar datos");
				      System.out.println("Opciones");
					op=entrada.nextInt();
				 switch(op)     
				 { case 1: T++;	
				          cargarDatos(Datos,T);
				           break;
				 case 2: System.out.println("Datos: ");
			              mostrar(Datos,T);
			              break;
				 
				 }	
				 }while(op!=0);
				}
	public static void cargarDatos(String D[][],int N) {
	Scanner entrada=new  Scanner (System.in);
		System.out.println("Nombre: ");
		D[N][0]=entrada.next();
		System.out.println("Nota primera etapa: ");
		D[N][1]=entrada.next();
		System.out.println("Nota segunda etapa: ");
		D[N][2]=entrada.next();
		System.out.println("Nota tercera etapa: ");
		D[N][3]=entrada.next();
	}
	public static void mostrar(String D[][],int N) {
		double n1e=0,n2e=0,n3e=0,nf=0;
		for(int f=0;f<=N;f++) {
			System.out.print(" "+D[f][0]);
			System.out.print(" ,"+D[f][1]);
			System.out.print(" ,"+D[f][2]);
			System.out.print(" ,"+D[f][3]);
			n1e=Double.valueOf(D[f][1]).doubleValue();
			n2e=Double.valueOf(D[f][2]).doubleValue();
			n3e=Double.valueOf(D[f][3]).doubleValue();
			nf=n1e+n2e+n3e;
			System.out.print(" "+nf);
			if(nf>=51)
				System.out.print(" Aprobado , vaya se a jugar");
			else 
				System.out.print(" Reprobado, vaya a estudiar flojo");
			System.out.println(" ");
		}
	}

}
