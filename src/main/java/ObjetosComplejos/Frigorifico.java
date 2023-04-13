package ObjetosComplejos;

public class Frigorifico extends Electrodomestico{
	
	public int temperatura;
	
	public Frigorifico(String marca, String modelo, int consumoWatios, int temperatura) {
		super(marca, modelo, consumoWatios);
		this.temperatura = temperatura;
	}
	
	public Frigorifico (Frigorifico f) {
		super(f.marca, f.modelo, f.consumoWatios);
		this.temperatura = f.temperatura;
	}
	
	public int getTemperatura() {
        return temperatura;
    }
	
	public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

	@Override
	public boolean equals(Object obj) {
		Frigorifico f = (Frigorifico) obj;
		if(super.equals(f) && this.temperatura == f.temperatura)
			return true;
		else
			return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Frigorifico f1 = new Frigorifico(this.marca, this.modelo, this.consumoWatios, this.temperatura);
		return f1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Frigorifico: " + marca + " modelo " + modelo + " consumo en watios " + consumoWatios + " temperatura " + temperatura + " ºC ";
	}
	
	
}
