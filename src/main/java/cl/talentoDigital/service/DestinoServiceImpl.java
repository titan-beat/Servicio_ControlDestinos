package cl.talentoDigital.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.talentoDigital.model.Destino;
import cl.talentoDigital.repository.IDestinoRepository;
@Service
public class DestinoServiceImpl implements IDestinoService {
	@Autowired
	IDestinoRepository dao;
	@Override
	public void save(Destino destino) {
		dao.save(destino);

	}

	@Override
	public ArrayList<Destino> findAll() {
		return (ArrayList<Destino>)dao.findAll();
	}

}
