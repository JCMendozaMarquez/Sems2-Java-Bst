package Programcion_2;

import java.util.Scanner;

public class Clas9_Ejem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int m;
		
	   Scanner entrada =new Scanner (System.in);		
       System.out.println("Introduce m: ");
	   m=entrada.nextInt();
	   PromedioDig(m);
	}
	 public static void PromedioDig(int n)
	 {
		double s=0,p;
		double  c=0,d;
		
		while(n!=0)
		{
			d=n%10;
			n=n/10;
			s=s+d;
			c=c+1;
		}
		if(c!=0) {
			p=s/c;
		}else {
			p=0;
		}
		 System.out.println("Es :"+p);
	 }

}
