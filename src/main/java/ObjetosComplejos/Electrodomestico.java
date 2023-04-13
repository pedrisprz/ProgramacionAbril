package ObjetosComplejos;

public class Electrodomestico {

	public String marca;
	public String modelo;
	public int consumoWatios;
	
	public Electrodomestico(String marca, String modelo, int consumoWatios) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoWatios = consumoWatios;
    }
	
	 public Electrodomestico(Electrodomestico e) {
	        this.marca = e.marca;
	        this.modelo = e.modelo;
	        this.consumoWatios = e.consumoWatios;
	    }
	 public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public int getConsumoWatios() {
	        return consumoWatios;
	    }

	    public void setConsumoWatios(int consumoWatios) {
	        this.consumoWatios = consumoWatios;
	    }

		@Override
		public boolean equals(Object obj) {
			Electrodomestico e = (Electrodomestico) obj;
			if (this.marca.equals(e.marca) && this.modelo.equals(e.modelo) && this.consumoWatios == e.consumoWatios)
	            return true;
			else
				return false;
	    }
		

		@Override
		protected Object clone() throws CloneNotSupportedException {
			Electrodomestico e1 = new Electrodomestico(this.marca, this.modelo, this.consumoWatios);
			return e1;
		}

		@Override
		public String toString() {
			return "Marca: " + marca + ", Modelo: " + modelo + ", Consumo en Watios: " + consumoWatios;
		}
	    
	    
}
