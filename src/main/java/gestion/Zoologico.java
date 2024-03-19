package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}

	public Zoologico() {
		this(null,null);
	}
	
	public Zoologico(String nombre,String ubicacion ) {
		this.nombre=ubicacion;
		this.ubicacion=ubicacion;
	}
	
	public void agregarZona(Zona zona){
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		
		int totalAnimales = 0;
		for (Zona zonas:zonas) {
			totalAnimales += zonas.cantidadAnimales();
		}
		return totalAnimales;
	}
	
}
