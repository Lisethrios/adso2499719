package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Aprendiz;

public interface IAprendizService {
	
	List<Aprendiz> getALL();
	Optional<Aprendiz> getById(Long id);
	Aprendiz save (Aprendiz aprendiz );
	void update (Long id, Aprendiz aprendiz);
	void delete (Long id);
	

}
