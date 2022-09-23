package tarea;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ejercico1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		
		int numeroRandom = rand.nextInt(500);
		int numero = 0, intentos = 0;
		boolean encontrado;
		do {
			do {
				System.out.print("Que numero es? (Del 1 al 500)");
				 try { 
	                    numero = teclado.nextInt();
	                    intentos++; 
	                    encontrado = true;
	             } 
				 catch (InputMismatchException excepcion) {
	                    System.out.println("No ha introducido un numero entero");
	                    teclado.next(); 
	                    encontrado = false;
	             } 
			}while (encontrado == false);
			
			if (numero > numeroRandom) {
				System.out.print("El numero es mayor");
			}
			else {
				System.out.print("El numero es menor");
			}
			
		}while (numero != numeroRandom);
		
		System.out.print("Correcto! La respuesta era: " + numero + "! Lo conseguiste en: " + intentos + " intentos!");
		teclado.close();
	}

}
