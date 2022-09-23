package tarea;

import java.util.Random;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		try {
        	int numeroRandom = rand.nextInt(999);
        	System.out.println("Creando el numero aleatorio");
        	
        	System.out.println("El numero aleatorio creado es: " + numeroRandom);
        	if(numeroRandom%2!=0) { 
        		throw new Excepcion(2);
        	}
        	else {
        		throw new Excepcion(3);
        	}
        	
		}catch (Excepcion prueba) {
            System.out.println("Excepcion capturada con mensaje: "+prueba.getMessage());
		}
	}

}
