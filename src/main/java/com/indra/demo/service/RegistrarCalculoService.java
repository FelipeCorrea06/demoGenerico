package com.indra.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.indra.demo.model.RegistrarCalculo;
import com.indra.demo.repository.RegistrarCalculoRepository;



@Service
public class RegistrarCalculoService {

	@Autowired
	RegistrarCalculoRepository registrosRepository;
	
	public RegistrarCalculo saveRegistroCalculo(RegistrarCalculo registro) {
		return registrosRepository.save(registro);
	}
	
	public RegistrarCalculo updateRegistroCalculo(RegistrarCalculo registro) {
		return registrosRepository.save(registro);
	}
	
	public void deleteRegistroCalculo(int id) {
		registrosRepository.deleteById(id);
	}
	
	public List<RegistrarCalculo> getAllgetAllRegistros(){
		return registrosRepository.findAll();
	}
}
