package Programcion_2;

import java.util.Scanner;

public class Clas9_Ejem1 {

	public static void main(String[] args) {
		// JCMM
		int R;
     	Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce R: ");
	    R=entrada.nextInt();
	    Serie(R);
	}
	  public static void Serie(int N)
	  {
		int  s=1;
		 int c=0;
		  for(int i=1;i<=N;i++)
		  {
			  System.out.println(":"+s);
			  c=c+1;
			  if(s==c)
			  {
				  s=s+1;
				  c=0;		  
			  }
			  
		  }
				  
	  }

}
