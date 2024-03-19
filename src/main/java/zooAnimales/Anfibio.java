package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public Anfibio() {
		super();
	}
	
	public Anfibio( String nombre, int edad, String habitad, String genero, Zona zona,
			ArrayList<Anfibio> listado,int ranas,int salamandras,String colorPiel,boolean venenoso) {
		super(nombre, edad, habitad, genero, zona);
		Anfibio.listado=listado;
		this.ranas=ranas;
		this.salamandras=salamandras;
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;	
		
	}
	
	public void cantidadAnfibios() {
		
	}
	
	@Override
	public void movimiento() {
		
	}
	
	public void crearRana() {
		
	}
	
	public void crearSalamandra() {
			
		}
	
	
	
	
	

}
