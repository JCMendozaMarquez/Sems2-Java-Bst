package Programacion_2_2_3;

import java.util.Scanner;

public class Clas28_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    int t;
			Scanner in=new Scanner(System.in);
			System.out.print("Inserte el dato : ");
			t=in.nextInt();
			invertir(t);
			System.out.println("Resultado "+(invertir(t)));
	}
	 static int  invertir (int n) {
		if(n<10)
			return n;
		else 
			return (n/10)+ invertir(n%10)*10;
	}

}
