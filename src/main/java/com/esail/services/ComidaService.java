package com.esail.services;

import java.util.List;

import com.esail.model.Comestible;
import com.esail.model.Hamburguesa;
import com.esail.model.Hotdog;

public interface ComidaService {
	
	public Hamburguesa serviceHamburguesa() ;
	public List<Hamburguesa> serviceHamburguesa(int cantidad);
	
	public Hotdog serviceHotdog();
	public List<Hotdog> serviceHotdog(int cantidad);
	
	public List<Comestible> serviceComestible(int numeroHamburguesas, int numeroPerritos);
	
	public double servicePrecio(List<Comestible> lista);
	public List<Comestible> serviceMenu(int hamburguesas, int perritos , int patatas, int bebidas);
	
}
