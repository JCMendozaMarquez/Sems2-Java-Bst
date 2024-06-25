package Practica1Ses2;

import java.util.Scanner;

public class Ejer2Parct1 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA|
		int A,B,C,D;
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Inserte A:  ");
		A=in.nextInt();
		System.out.print("Inserte B:  ");
		B=in.nextInt();
		System.out.print("Inserte C:  ");
		C=in.nextInt();
		System.out.print("Inserte D:  ");
		D=in.nextInt();
	
		if (A<B)  {
			System.out.println("El menor :"+A);   }
		else if(B<C) {
			System.out.println("El menor : "+B);  }
		  else if (C<D) {
			System.out.println("El menor : "+C);  }
		     else {
			System.out.println("El  menor : "+D);  }
		
	}
}
	

    		   
    		   
   

	
	



	
		
		





