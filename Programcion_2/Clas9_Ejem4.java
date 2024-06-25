package Programcion_2;

import java.util.Scanner;

public class Clas9_Ejem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		
		   Scanner entrada =new Scanner (System.in);		
	       System.out.println("Introduce p: ");
		   p=entrada.nextInt();
		   Primos(p);
	}
	 public static void Primos(int R)
	 {  
		 while(R!=0) {
			 int d;
			 d=R%10;
			 R=R/10;
			 if(d==2 ||	 d==3 || d==5 || d==7) {
				 System.out.println("Los primos son :"+d);
			 }
		 }
	 }
	

}
