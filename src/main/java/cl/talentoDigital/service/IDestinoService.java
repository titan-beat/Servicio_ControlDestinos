package cl.talentoDigital.service;

import java.util.ArrayList;

import cl.talentoDigital.model.Destino;


public interface IDestinoService {
	
	public void save(Destino destino);
	public ArrayList<Destino> findAll();

}
