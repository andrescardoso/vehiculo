package transportes;

public class Motocicleta extends Vehiculo{

	private Persona acompagnante;
	
	public Motocicleta(int kmRecorridos, Persona chofer) { // CONSTRUCTOR
		super(kmRecorridos, chofer);
		System.out.println(this.getChofer() + " está conduciendo la moto actualmente.");
	}
	
	// MÉTODOS
	public void subirAcompagnante(Persona acompagnante) {
		if(!sinAcompagnante())
		{
			this.acompagnante=acompagnante;
		System.out.println("El acompañante ahora es " + this.acompagnante);
		}
		else
			System.out.println("Asiento de acompañante de moto ocupado.");
	}

	public void cambiarChofer(Persona chofer) {
		if(!sinAcompagnante()) {
			this.cambiarChofer(chofer);
		System.out.println("El chofer ahora es " + this.getChofer());
		}
		else
			System.out.println("Ya hay alguien manejando la moto.");
		
	}
	
	// CLONE
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motocicleta other = (Motocicleta) obj;
		if (acompagnante == null) {
			if (other.acompagnante != null)
				return false;
		} else if (!acompagnante.equals(other.acompagnante))
			return false;
		return true;
	}

	// TOSTRING
	public String toString() {
		return "Motocicleta [kilometraje=" + this.getKmRecoridos() + "chofer actual: " + this.getChofer() +"]";
	}

		public boolean sinAcompagnante() {
		if(this.acompagnante==null)
			return false;
		return true;
	}
		
}