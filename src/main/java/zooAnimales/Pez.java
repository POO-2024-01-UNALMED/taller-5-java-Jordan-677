package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	private ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public ArrayList<Pez> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public Pez () {
		super();
	}
	
	public Pez(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona zona, Pez[] listado,
			int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {	
		super(totalAnimales, nombre, edad, habitad, genero, zona);
		this.listado = listado;
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public void cantidadPeces() {
		
	}
	
	@Override
	public void movimiento() {
		
	}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
			
		}

}
	

