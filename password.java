package tarea;

import java.security.SecureRandom;

public class password {

		//Atributos
		private int longitud;
		private String contrasenya;
		//Array para generar contasenya aleatoria
		private String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		private StringBuilder sb = new StringBuilder();
		private SecureRandom random = new SecureRandom();
		boolean segura;
		int i;
		
		//Constructor por defecto
		public password() {
			this.longitud = 8;
			this.contrasenya = "";
		}
		
		public password(int longitud) {
			this.longitud = longitud;
			this.contrasenya = Generador(longitud);
		}
		
		//Generador de contrasenyas a partir de la longitud
		public String Generador(int longitud) {
			for (i = 0; i < longitud; i++) {
				int randomSimbolo = random.nextInt(letrasNumeros.length());
		        sb.append(letrasNumeros.charAt(randomSimbolo));
		    }
			return sb.toString();
		}
		
		public boolean esFuerte() {
			int mayusculas=0,minusculas=0,numeros=0;
			boolean esFuerte=false;
			String contrasenya = getContrasenya();
			
			for (int i = 0; i < contrasenya.length(); i++) { 
				if (Character.isUpperCase(contrasenya.charAt(i))) {
					mayusculas=mayusculas+1;
				}
				else if (Character.isLowerCase(contrasenya.charAt(i))) { 
					minusculas=minusculas+1;
				}else if (Character.isDigit(contrasenya.charAt(i))) {
					numeros=numeros+1;
				} 
			}
			
			if(mayusculas>2 && minusculas>1 && numeros>5) { 
				esFuerte=true;
			}
			return esFuerte;
		}
		
		public int getLongitud() {
			return longitud;
		}
		
		public String getContrasenya() {
			return contrasenya;
		}
		
		public void Datos() {
			System.out.println("Longitud: " + getLongitud());
			System.out.println("Contraseña: " + getContrasenya());
		}
		
		public static void main(String[] args) {
			//Asignamos valores
			int longitud=5;
			String contrasenya;
			//Generamos el default
			password Biel = new password();
			Biel.Datos();
			
			//Generamos el generador
			contrasenya=Biel.Generador(longitud); 
			System.out.println(contrasenya);
		 }

}
