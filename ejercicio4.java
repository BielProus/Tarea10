package tarea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2, menu=0;

		do {
			try {
				System.out.println("1.Suma \n2.Resta \n3.Multiplicacion \n4.Potencia \n5.Raiz cuadrada \n6.Raiz cubica \n7.Division \n8.Salir");
	        	menu = teclado.nextInt();
	        	
	        	if(menu<1||menu>8) { 
	        		throw new Excepcion(4);
	        	}
			}catch (Excepcion prueba) {
	            System.out.println(prueba.getMessage());
			}
			try {
				switch (menu) {
					case 1:
						System.out.println("1.Suma");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Pon el segundo numero");
						numero2 = teclado.nextInt();
		        		        	
						System.out.println("Resultado: "+(numero1+numero2));
						break;
		        	
					case 2:
						System.out.println("2.Resta");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Pon el segundo numero");
						numero2 = teclado.nextInt();
		        		        	
						System.out.println("Resultado: "+(numero1-numero2));
						break;
						
					case 3:
						System.out.println("3.Multiplicacion");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Pon el segundo numero");
						numero2 = teclado.nextInt();
		        		        	
						System.out.println("Resultado: "+(numero1*numero2));
						break;
		        	
					case 4:
						System.out.println("4.Potencia");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Pon el segundo numero");
						numero2 = teclado.nextInt();
		        	
						System.out.println("Resultado: "+(Math.pow(numero1, numero2))+"\n");
						break;
						
					case 5:
						System.out.println("5.Raiz cuadrada");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						numero1 = (int)Math.sqrt(numero1);
						System.out.println("Resultado: "+ numero1);
						break;
						
					case 6:
						System.out.println("6.Raiz cubica");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						numero1 = (int)Math.cbrt(numero1);
						System.out.println("Resultado: "+ numero1);
						break;
						
					case 7:
						System.out.println("7.Division");
						System.out.println("Pon el primer numero");
						numero1 = teclado.nextInt();
						System.out.println("Pon el segundo numero");
						numero2 = teclado.nextInt();
			        
						System.out.println("Resultado: "+(numero1/numero2)+"\n");
			        	break;
					case 8:
						System.out.println("Adios");
						break;
				}
			}
			catch (InputMismatchException excepcion) {
				 System.out.println("Numero Incorrecto");
                 teclado.next();
			}
		}while (menu!=8);
        teclado.close();

	}

}
