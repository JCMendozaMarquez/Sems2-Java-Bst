package Programcion_2;

public class Ejemplo3_Clas4 {

	public static void main(String[] args) {
		// JUAN CARLOS MENDOZA MENDOZA
		int num1=120;
		int num2=50;
		
		System.out.println("Numeros generados entre   50 y 120 ,sin decimales");
		
		for (int i=0 ;i<10 ;i++) {
			
			int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
			System.out.println(numAleatorio);
		
		
		}
	}

}
