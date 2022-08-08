package cl.talentoDigital.service;

import java.util.ArrayList;

import cl.talentoDigital.model.Pasajero;

public interface IPasajeroService {
	
	public void save(Pasajero pasajero);
	public ArrayList<Pasajero> findAll();

}
