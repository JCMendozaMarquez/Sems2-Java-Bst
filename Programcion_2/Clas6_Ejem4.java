package Programcion_2;

import java.util.Scanner;

public class Clas6_Ejem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c,p,pd;
		String n;
		 Scanner entrada = new Scanner ( System.in );
		 
		 System.out.print("Escriba el nombre :");
		 n=entrada.nextLine();
		 System.out.print("Escriba la clave :");
		 c=entrada.nextDouble();
		 System.out.print("Escriba el precio :");
		 p=entrada.nextDouble();
		 
		 pd=Calcular(c,p);
		 if(pd!=0)
		 { System.out.println("Nombre "+n);
		 System.out.println("Clave "+c);
		 System.out.println("Presio original  "+p);
		 System.out.println("Presio con descuento  "+pd);
		 }
		 else
			 System.out.println("Clave inexistente ");
	    }
		 public static double Calcular (double c,double p)
		 {double pd=0;
		 switch((int)c)
		 { case 1 : pd=p-p*0.10; break  ;
		 case 2:    pd=p-p*0.20; break  ;
		 case 3 :   pd=p-p*0.30; break  ;
		 default: pd =0; break ;
		 }
		 return(pd);
			 
		 }

	}


