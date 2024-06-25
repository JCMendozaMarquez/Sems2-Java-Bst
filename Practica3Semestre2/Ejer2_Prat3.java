package Practica3Semestre2;

import java.util.Scanner;

public class Ejer2_Prat3 {

	public static void main(String[] args) {
		//  JUAN CARLOS MENDOZA MENDOZA|
		    int x;
		    Scanner entrada =new Scanner (System.in);
			
			System.out.println("Introduce un numero: ");
		    x=entrada.nextInt();
		    numero(x);
		}

		 public static void numero(int y)
		 {
			int cp=0;
			int ci=0;
			while(y!=0)
			{	int d;
		      	d=y%10;
		     	y=y/10;
				if(d%2==0) {
					cp=cp+1;
				}else {
					ci=ci+1;
				}
			}
			System.out.println("El promedio de numeros pares es : "+cp);
			System.out.println("El promedio de numeros impares es "+ci);
			
			
		 }

	}

	


