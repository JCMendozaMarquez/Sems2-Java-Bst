package Programacion_ProyFinal;

import java.util.Scanner;

public class Proyt_Final {

	public static void main(String[] args) {
		// Juan Carlos Mendoza Marquez	
		String[] Datos=new  String[50];
		String[][]  Dat=new  String[50][8];// aaaaaaa
		Scanner entrada=new  Scanner (System.in);
				 int op,T=-2 ;
				 int Op,Y=-1 ;
				 do { System.out.println("0.Salir");
				      System.out.println("1.Cargar un nombre y su edad");
				      System.out.println("2.Cargar un nombre y sus notas");// aaaaaa
				      System.out.println("3.Mostrar datos");
				      System.out.println("4.Mostrar datos con notas");  //aaaaaaaaaa
				      System.out.println("5.Descuento de edades");
				      System.out.println("6.Beca Parentesco");
				      System.out.println("7.Notas de las materias");
				      System.out.println("8.Beca por las notas");
				      System.out.println("Opciones");
					op=entrada.nextInt();
				 switch(op)     				     
				 { case  2: Y++;	
				          CargarDatos(Dat,Y);
				           break;
				 case 4: System.out.println("Datos: ");
			              MostraR(Dat,Y);
			              break;
				//aaaaaaaa
				  case 1: T=T+2;	
				          cargarDatos(Datos,T);
				           break;
				 case 3: System.out.println("Datos");
			              mostrar(Datos,T);
			              break;
				 
				 case 5: System.out.println("Descuento por edades: ");
                         edadesDes(Datos,T);
                 break;
				 case 6: System.out.println("Descuento por edades: ");
				         becaParentesco(Datos,T);
                         break;
				 case 7: Y++;
				          mejorcalificacionNot (Dat,Y);
	                     break;
				 case 8: System.out.println("Datos: ");
				         MOstraR(Dat,Y);
	                     break;
                         
				 }	
				 }while(op!=0);
				}
				
			public static void cargarDatos(String D[],int N)
			{     Scanner entrada=new  Scanner (System.in);
			
				    System.out.println("Nombre: ");
			        D[N]=entrada.next();
			        System.out.println("Edad: ");
			        D[N+1]=entrada.next();
			       
			}
			public static void mostrar(String D[],int N) {
				
				 for(int i=0;i<=N;i=i+2) {
					 System.out.print(" "+D[i]);
					 System.out.print(" "+D[i+1]);
					 System.out.println(" ");
				 }	 
			}
			 public static void mejorcalificacionNot(String D[][], int N) {
                 Scanner entrada=new  Scanner (System.in);
							System.out.println("Nombre: ");
							D[N][0]=entrada.next();
							System.out.println("Nota Materia 1: ");
							D[N][1]=entrada.next();
							System.out.println("Nota Materia 2: ");
							D[N][2]=entrada.next();
							System.out.println("Nota Materia 3: ");
							D[N][3]=entrada.next();
							System.out.println("Nota Materia 4: ");
							D[N][4]=entrada.next();
							System.out.println("Nota Materia 5: ");
							D[N][5]=entrada.next();
							System.out.println("Nota Materia 6: ");
							D[N][6]=entrada.next();
							System.out.println("Nota Materia 7: ");
							D[N][7]=entrada.next();
						}
			 public static void MOstraR(String D[][],int N) {
			 double n1e=0,n2e=0,n3e=0,n4e=0,n5e=0,n6e=0,n7e=0,nf=0;
				for(int f=0;f<=N;f++) {
					System.out.print("  "+D[f][0]);
					System.out.print(" ,"+D[f][1]);
					System.out.print(" ,"+D[f][2]);
					System.out.print(" ,"+D[f][3]);
					System.out.print(" ,"+D[f][4]);
					System.out.print(" ,"+D[f][5]);
					System.out.print(" ,"+D[f][6]);
					System.out.print(" ,"+D[f][7]);
					n1e=Double.valueOf(D[f][1]).doubleValue();
					n2e=Double.valueOf(D[f][2]).doubleValue();
					n3e=Double.valueOf(D[f][3]).doubleValue();
					n4e=Double.valueOf(D[f][4]).doubleValue();
					n5e=Double.valueOf(D[f][5]).doubleValue();
					n6e=Double.valueOf(D[f][6]).doubleValue();
					n7e=Double.valueOf(D[f][7]).doubleValue();
					nf=n1e+n2e+n3e+n4e+n5e+n6e+n7e ;
					nf=nf/7;
					System.out.print(" Nota final "+nf);
					if(nf>=92)
						System.out.print(" Su beca lo espera");
					else 
						System.out.print(" Lo lamento no puede obtener la beca");
					System.out.println(" ");
				}			 
			 }
			 public static void edadesDes (String D[],int N) {
				 Integer.valueOf(D[N+1]);
				 if (  Integer.valueOf(D[N+1])>=31 ) {
					 System.out.println(D[N]+". Puede obtener un escuento del 11%");
				 }  else  if( Integer.valueOf(D[N+1])>=23 ) {
					    System.out.println(D[N]+". Puede obtener un escuento del 12%");
				    }   else if( Integer.valueOf(D[N+1])>=18 ) {
					         System.out.println(D[N]+". Puede obtener un escuento del 13%");
				 }else {  }
			 }
			 public static void becaParentesco(String D[],int N) {
				 Scanner in=new  Scanner (System.in);
				 int i;
				 int x=0;
				 String sihay;			
				  System.out.println("Tiene Familiares en la Universidad:  ");
				  sihay=in.next();
				  if(sihay!="no") {
					  System.out.println("Cuantos familiares tiene:  ");
					  i=in.nextInt();
					  for(int j=0;j<i;j++) {  
						  x=x+10;	   
					  }
					  System.out.println(D[N]+" tiene "+x+"% de descuento");
					  
				  }else {System.out.println("No tiene descuento ya que no teniene familiares que esten estudiando en la institucion");  }
				  
			 }
			
			//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
			public static void CargarDatos(String D[][],int N) {
				Scanner entrada=new  Scanner (System.in);
					System.out.println("Nombre: ");
					D[N][0]=entrada.next();
					System.out.println("Nota primera etapa: ");
					D[N][1]=entrada.next();
					System.out.println("Nota segunda etapa: ");
					D[N][2]=entrada.next();
					System.out.println("Nota tercera etapa: ");
					D[N][3]=entrada.next();
				}
				public static void MostraR(String D[][],int N) {
					double n1e=0,n2e=0,n3e=0,nf=0;
					for(int f=0;f<=N;f++) {
						System.out.print(" "+D[f][0]);
						System.out.print(" ,"+D[f][1]);
						System.out.print(" ,"+D[f][2]);
						System.out.print(" ,"+D[f][3]);
						n1e=Double.valueOf(D[f][1]).doubleValue();
						n2e=Double.valueOf(D[f][2]).doubleValue();
						n3e=Double.valueOf(D[f][3]).doubleValue();
						nf=n1e+n2e+n3e;
						System.out.print(" "+nf);
						if(nf>=51)
							System.out.print(" Aprobado , vaya se a jugar");
						else 
							System.out.print(" Reprobado, vaya a estudiar flojo");
						System.out.println(" ");
					}
				}

}

