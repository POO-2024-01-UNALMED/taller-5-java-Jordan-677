package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	
	public int getTotalAnimales() {
		return totalAnimales;
	}

	public static void  setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Animal() {
		this(null,0,null,null,null);
	}
	
	public Animal(String nombre,int edad,String habitad,String genero,Zona zona) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero=genero;
		this.zona = zona;
		
	}
	
	public void movimiento() {
		
	}
	
	public void totalPorTipo() {
		
	}
	
	
	public String toString() {
		return "";
	}

}
