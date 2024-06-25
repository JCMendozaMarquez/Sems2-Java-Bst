package Programcion_2;

import java.util.Scanner;

public class Clas7_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X;
		Scanner entrada =new Scanner (System.in);
		System.out.print("Escriba un numero: ");
		X=entrada.nextInt();
		if (Capicua(X)==true)
			System.out.println(X+" es capicua");
		else
			System.out.println(X+" No es capicua");
	}
	public static boolean Capicua(int X)
	{ if (X ==inverso(X))
		return(true);
	else
		return(false);
	}
	public static int inverso (int X)
	{int inv,d;
	inv=0;
	 while(X!=0)
	 {d=X%10;
	  X=X/10;
	  inv=inv*10+d;
   }
	return(inv);
	}

}
