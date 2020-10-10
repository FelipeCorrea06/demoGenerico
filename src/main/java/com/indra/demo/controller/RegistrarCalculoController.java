package com.indra.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.indra.demo.model.RegistrarCalculo;
import com.indra.demo.service.RegistrarCalculoService;



@RestController
@RequestMapping("/registros")
public class RegistrarCalculoController {

	@Autowired
	private RegistrarCalculoService registrosService;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path="/guardar")
	public RegistrarCalculo insertRegistroCalculo(@RequestBody RegistrarCalculo registro) {
		return registrosService.saveRegistroCalculo(registro);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.PUT})
	@PutMapping(path = "/modificar")
	public RegistrarCalculo updateRegistroCalculo(@RequestBody RegistrarCalculo registro) {
		return registrosService.updateRegistroCalculo(registro);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.DELETE})
	@DeleteMapping(path = "/eliminar/{id}")
	public void deleteEstado(@PathVariable("id") int id) {
		registrosService.deleteRegistroCalculo(id);
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<RegistrarCalculo> getAllRegistros(){
		return registrosService.getAllgetAllRegistros();
	}
}
