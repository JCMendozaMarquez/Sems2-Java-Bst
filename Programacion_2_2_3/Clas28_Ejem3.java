package Programacion_2_2_3;

import java.util.Scanner;

public class Clas28_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner in=new Scanner(System.in);
		System.out.print("Inserte el dato : ");
		t=in.nextInt();
		sumar_dig(t);
		System.out.println("Resultado "+(sumar_dig(t)));
	}
 
	static int sumar_dig( int n) {
		if(n==0)
		return n;
		else
			return sumar_dig (n/10)+(n%10);
	}
}
