package Interfaces;

public class Mensaje implements Logable{
	
	public String mensaje;
    public String prioridad;
	
    public Mensaje(String mensaje) {
    	this.mensaje = mensaje;
    	this.prioridad = "normal";
    }
    
	public String leerMensaje() {
		// TODO Auto-generated method stub
		return mensaje;
	}

	public void cambiarMensaje(String mensaje) {
		// TODO Auto-generated method stub
		this.mensaje = mensaje;
	}

	public void cambiarPrioridadAlta() {
		// TODO Auto-generated method stub
		prioridad = "alta";
	}

	public void cambiarPrioridadBaja() {
		// TODO Auto-generated method stub
		prioridad = "baja";
	}

	public void cambiarPrioridadMedia() {
		// TODO Auto-generated method stub
		prioridad = "media";
	}

}
