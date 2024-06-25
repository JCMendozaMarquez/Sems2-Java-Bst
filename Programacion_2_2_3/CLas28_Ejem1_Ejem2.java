package Programacion_2_2_3;

import java.util.Scanner;

public class CLas28_Ejem1_Ejem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int t;
		Scanner in=new Scanner(System.in);
		System.out.print("Inserte el dato : ");
		t=in.nextInt();
		fibunaci(t);
		System.out.println(" Resultado "+fibunaci (t));
	}
	    static int fibunaci(int n) {
	
		if(n==1) return 0;
		if(n==2) return 1;
		else return fibunaci (n-1)+fibunaci(n-2);
		
	}
	   
}
