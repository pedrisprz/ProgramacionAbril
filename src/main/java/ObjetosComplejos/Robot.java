package ObjetosComplejos;

public class Robot {

	private int name;
	private int model;
	private int clase;
	private int numeroDeRobots= 0;
	
	public Robot(int name, int model, int clase) {
	this.name = name;
	this.model = model;
	this.clase = clase;
	numeroDeRobots++;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getNumeroDeRobots() {
		return numeroDeRobots;
	}

	public void setNumeroDeRobots(int numeroDeRobots) {
		this.numeroDeRobots = numeroDeRobots;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Robot(this.name, this.model, this.clase);
	}

	@Override
	public String toString() {
	
		return "Robot [nombre: " + name + " , modelo: " + model + " , clase: " + clase + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Robot r = (Robot)obj;
		if(this==r)
			return true;
		else {
			if(this.name==r.name  &&  this.model==r.model && this.clase==r.clase)
				return true;
			return false;
		}
	}
	
	
	
	
}
