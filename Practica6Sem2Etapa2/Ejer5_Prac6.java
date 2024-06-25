package Practica6Sem2Etapa2;

import java.util.Scanner;

public class Ejer5_Prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		String[] a= new String[0];
		int op,T=0;
		do {   System.out.println("0.Salir");
		       System.out.println("1.Generar vector");
		       System.out.println("2.Nombres");
		       System.out.println("opcion");
	           op=entrada.nextInt();
		switch (op)
		{         case 1: System.out.println("Tamaño del vector : ");
		                T=entrada.nextInt();
		                a=new String[T];
		                leerElementos (a,T);
	                 	break;
		            case 2:nombres(a,T);
                 	    break;
		}
		}while(op!=0);
	}
	
	
	public static void leerElementos(String M[],int N)

	{  Scanner entrada=new Scanner(System.in);
		for (int f=0; f<N;f++)
	{ System.out.println("Elemento "+f+" :");
	M[f]= entrada.next();
		}
	} 
	public static void nombres(String M[],int N) {
		String Str=new String ("juan"); 
		int longitud=Str.length();
		String Cab=" ";
		System.out.println("Tine "+longitud+" caracteres");
		for(int i=0;i<Str.length();i++) {
			char xcar=Str.charAt(i);
			if(xcar=='a'||xcar=='e'||xcar=='i'|| xcar=='o'|| xcar=='u' ) {
				Cab=Cab+"o";
			}else {
				Cab=Cab+Str.charAt(i);  }
		}
		System.out.println("El resultado es : "+Cab);
	}
	

}
