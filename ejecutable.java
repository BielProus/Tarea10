package tarea;

import java.util.Scanner;

public class ejecutable {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int longitud = 0;
		
		System.out.println("Tamanyo del Array?");
		password[] passwords=new password[teclado.nextInt()];
		
		System.out.println("Longitud de la contrasenya?");
		longitud=teclado.nextInt();
		
		boolean[] booleans = new boolean[passwords.length];
		
		for (int i = 0; i < passwords.length; i++) {
			passwords[i]=new password(longitud);
			booleans[i]=passwords[i].esFuerte();
			
			passwords[i].Datos(); 
			System.out.println(booleans[i]);
	    }
		teclado.close();
	}


}
