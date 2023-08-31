package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Grado;

public interface IGradoService {

	List<Grado> getAll();
	Optional<Grado> getById(Long id);
	Grado save (Grado grado);
	void update (long id, Grado grado);
	void delete (long id);
}
