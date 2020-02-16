package transportes;

import java.util.Arrays;

public class Autobus extends Vehiculo{
	
	private int cantPasajeros=0;
	private Persona[] pasajeros=new Persona[25];

	public Autobus(int kmRecorridos, Persona chofer) { // CONSTRUCTOR
		super(kmRecorridos, chofer);
		System.out.println("El chofer de este autobus es " + this.getChofer());
		
	}
	
	public void nuevoPasajero(Persona pasajero) {
		if(cantPasajeros<this.pasajeros.length) {
			pasajeros[cantPasajeros+1]=pasajero;
			cantPasajeros++;
		}
	}
	
	public void bajarPasajero() {
		if(this.cantPasajeros>0)
		this.cantPasajeros--;
		System.out.println("La cantidad de pasajeros actualmente es: " + this.cantPasajeros);
	}

	public void cambiarChofer(Persona otroChofer) {
		if(this.cantPasajeros==0) {
			super.asignarChofer(otroChofer);
		System.out.println("Ahora el chofer es " + this.getChofer());
		}
		else
			System.out.println("El autobus debe estar vacío para cambiar de chofer. Actualmente hay " + this.cantPasajeros + " pasajero/s.");
		
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
		Autobus other = (Autobus) obj;
		if (cantPasajeros != other.cantPasajeros)
			return false;
		if (!Arrays.equals(pasajeros, other.pasajeros))
			return false;
		return true;
	}

	// TOSTRING
	public String toString() {
		return "Autobus [kilometraje=" + this.getKmRecoridos() + ", pasajeros=" + Arrays.toString(pasajeros) + ", chofer actual: "+ this.getChofer() +"]";
	}

}
