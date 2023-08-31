package com.sena.adso2499719.interfaces;



import java.util.List;
import java.util.Optional;

import entities.Especialidad;

public interface IEspecialidadService {
	
	List<Especialidad> getAll();
	
	Optional<Especialidad> getById(Long id);
	
	 Especialidad save(Especialidad especialidad);
	 
	 void update(Long id, Especialidad especialidad);
	 
	 void delete (Long id);
	 
	 
}
