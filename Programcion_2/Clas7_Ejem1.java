package Programcion_2;

import java.util.Scanner;

public class Clas7_Ejem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int N,S;
	Scanner entrada=new Scanner (System.in);
	System.out.print("Escriba la cantidad de numeros:" );
	N=entrada.nextInt();
	S=SumaNnaturales(N);
	System.out.println("La suma  de numeros naturales es : "+S);
	}
	public static int SumaNnaturales(int N)
	{ int i,S=0;
	for (i=1;i<=N;i++)
	{S=S+i;
	}
	return(S);

	}

}
