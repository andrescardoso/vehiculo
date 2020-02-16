package transportes;

public class Persona {

	private String nombre;

	public Persona(String nombre) { // CONSTRUCTOR
		this.setNombre(nombre);
	}
	
	// SETTERS & GETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
			Persona other = (Persona) obj;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
	
	// TOSTRING
		public String toString() {
		return this.getNombre();
	}
		
}