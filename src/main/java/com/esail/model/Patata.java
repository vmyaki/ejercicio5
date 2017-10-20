package com.esail.model;

public class Patata implements Comestible {

	private String nombre;
	
	
	public Patata(String nombre) {
		this.nombre = nombre;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getPrecio() {
		return 1;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Patata [nombre=" + nombre + "]";
	}

}
