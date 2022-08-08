package cl.talentoDigital.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.talentoDigital.model.Pasajero;
import cl.talentoDigital.repository.IPasajeroRepository;
@Service
public class PasajeroServiceImpl implements IPasajeroService {
	@Autowired
	IPasajeroRepository dao;
	@Override
	public void save(Pasajero pasajero) {
		dao.save(pasajero);

	}

	@Override
	public ArrayList<Pasajero> findAll() {
		return (ArrayList<Pasajero>)dao.findAll();
	}

}
