package tarea;

public class ejercicio2 {

	public static void main(String[] args) {
	  
		String crearError="";
		
		try { 
			System.out.println("Mensaje de prueba");
			if(crearError.isEmpty()) { 
				throw new Excepcion(1);
			}
		} 
		
		catch (Excepcion prueba) {
            System.out.println("Excepcion capturada con mensaje: "+prueba.getMessage());
		}
        System.out.println("Programa terminado");
	}

}
