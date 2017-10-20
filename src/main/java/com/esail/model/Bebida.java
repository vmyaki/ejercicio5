package com.esail.model;

public class Bebida implements Comestible {

	private String nombre;
	
	
	public Bebida(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getPrecio() {
		return 1.5;
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return null;
	}

}
