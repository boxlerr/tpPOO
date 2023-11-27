public class Equipo extends Jugador{
	
	//Atributos: nombre, ciudad, lista de jugadores (LinkedList<Jugador>).
	//Métodos:
	//Agregar un jugador a la lista.
	//Eliminar un jugador de la lista.
	//Buscar un jugador por nombre.
	//Obtener la cantidad total de jugadores en el equipo.
	//Obtener la lista de jugadores en el equipo.
	//aca hago uso de la linkedlist
	
	private String nombre;
	
	private String foto;
	

	public Equipo(String nombre, String foto) {
	super();
	this.nombre = nombre;
	
	this.foto = foto;
	
}

	public void GenerarEquipo() {
		
		String [] posicion = {"Delantero","Arquero","Defensa","Mediocampista"};		//generar jugador random
		for (int i = 0; i < 11; i++) {
			int aleatorio = (int)(Math.random()*4);
			this.getJugadores().add(new Jugador("Jugador: " + i,posicion[aleatorio],i,4));
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", foto=" + foto + "]";
	}
}