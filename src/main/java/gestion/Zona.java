package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal>animales= new ArrayList<>();
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public Zona() {
		this(null,null);
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal){
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		int cantAnimales=animales.size();
		return cantAnimales;
	}
	
	
}
