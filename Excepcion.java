package tarea;

public class Excepcion extends Exception {
		
		private int codigoException;
		
		
	    public Excepcion(int codigoError) {
	        super();
	        this.codigoException=codigoError;
	    }
	    
	    public String getMessage() {
	    	
	    	String mensaje="";
	    	
	    	switch(codigoException) {
	    		case 1:
	    			mensaje="Esto es un objeto Exception";
	    			break;
	    		case 2:
	    			mensaje="Es impar";
	    			break;
	    		case 3:
	    			mensaje="Es par";
	    			break;
	    		case 4:
	    			mensaje="Numero de menú incorrecto";
	    			break;
	    	}
	    	
	    	return mensaje;
	    }

	}

