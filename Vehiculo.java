package transportes;

public abstract class Vehiculo {
	
	private int kmRecoridos;
	private Persona chofer;
	
	public Vehiculo(int kmRecorridos, Persona chofer) { // CONSTRUCTOR
		this.asignarChofer(chofer);
		this.setKmRecoridos(kmRecorridos);
	}
	
	// MÉTODOS
	public void asignarChofer(Persona chofer) {
		this.setChofer(chofer);
	}
	
	public abstract void cambiarChofer(Persona otroChofer);

	// SETTERS & GETTERS
	public int getKmRecoridos() {
		return kmRecoridos;
	}
	private void setKmRecoridos(int kmRecoridos) {
		this.kmRecoridos = kmRecoridos;
	}
	public Persona getChofer() {
		return chofer;
	}
	public void setChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// EQUALS
		public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (chofer == null) {
			if (other.chofer != null)
				return false;
		} else if (!chofer.equals(other.chofer))
			return false;
		if (kmRecoridos != other.kmRecoridos)
			return false;
		return true;
	}

	// TOSTRING
	public String toString() {
		return "Vehiculo [kilometraje=" + this.getKmRecoridos() + ", chofer actual=" + this.getChofer() + "]";
	}
	
}	// FIN CLASE VEHÍCULO
/////////////////////////
	// MAIN
 class Testeo {
	public static void main(String[] args) {
	// PERSONAS
	Persona juana=new Persona("Juana");
	Persona sergio=new Persona("Sergio");
	Persona lola=new Persona("Lola");
	// MOTO
	Motocicleta moto1=new Motocicleta(780, lola);
	moto1.subirAcompagnante(juana);
	moto1.subirAcompagnante(sergio);
	// AUTOBUS
	Autobus autobus1=new Autobus(14000, sergio);
	autobus1.cambiarChofer(lola);
	autobus1.nuevoPasajero(juana);
	autobus1.cambiarChofer(sergio);
	}
 }