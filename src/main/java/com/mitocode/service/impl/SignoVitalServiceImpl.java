package com.mitocode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.SignoVital;
import com.mitocode.repo.ISignoVitalRepo;
import com.mitocode.service.ISignoVitalService;

@Service
public class SignoVitalServiceImpl implements ISignoVitalService{

	@Autowired
	private ISignoVitalRepo repo;

	@Override
	public SignoVital registrar(SignoVital obj) {
		return repo.save(obj);
	}

	@Override
	public SignoVital modificar(SignoVital obj) {
		return repo.save(obj);
	}

	@Override
	public List<SignoVital> listar() {
		return repo.findAll();
	}

	@Override
	public SignoVital leerPorId(Integer id) {
		Optional<SignoVital> op = repo.findById(id);
		return op.isPresent() ? op.get(): new SignoVital();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
	
	
}
