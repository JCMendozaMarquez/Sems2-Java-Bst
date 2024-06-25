package Programcion_2;

import java.util.Scanner;

public class Clas9_Ejem2 {

	public static void main(String[] args) {
		//JCMMM	
		int x;
	  Scanner entrada =new Scanner (System.in);
		
		System.out.println("Introduce x: ");
	    x=entrada.nextInt();
	    digito(x);
	}

	 public static void digito(int y)
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
		System.out.println("Es "+cp+" y "+ci);
		
		
	 }
}
