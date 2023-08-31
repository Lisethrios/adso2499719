package com.sena.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import entities.Profesor;

public interface IProfesorService {

	List<Profesor> getAll();
	Optional<Profesor> getById(long id);
}
