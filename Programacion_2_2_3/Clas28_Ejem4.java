package Programacion_2_2_3;

import java.util.Scanner;

public class Clas28_Ejem4 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num;
 	sc = new Scanner(System.in);
 	System.out.print("Introduce un numero para invertir : ");
	num=sc.nextInt();
	//System.out.printf(" El numero invertido es el :"+invertirNumeroString(num));
	int numCifras =String.valueOf(num).length();
   System.out.printf("  El numero invertido es el :"+invertirNumero(num, numCifras-1));
	}

	private static int invertirNumero(int num , int pos ) {
		if(num<10) {
			return num;	
		}else {
			return num%10*(int)Math.pow(10, pos)+ invertirNumero (num/10,pos-1);
		}
	}
	//  private static String invertirNumeroString(int num  ) {
		// if(num<10) {
		//	return String.valueOf(num);	
//		}else {
	//		return String.valueOf(num%10)+ invertirNumeroString(num/10);
		// }
//	}
}
