package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado;
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Mamifero() {
		super();
	}
	
	public Mamifero(int totalAnimales, String nombre, int edad, String habitad, String genero, Zona zona,Mamifero[] listado,int caballos,int leones,boolean pelaje,int patas) {
		super(totalAnimales, nombre, edad, habitad, genero, zona);
		this.listado=listado;
		this. caballos=caballos ;
		this.leones=leones;
		this.pelaje=pelaje;
		this.patas=patas;
	}

	public void cantidadMamiferos() {
		
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
			
		}
}