package com.example.curso.service;

import java.util.List;

import com.example.curso.entity.Curso;
import com.example.curso.entity.Profesor;

public interface ICursoService {
	
	public List<Curso> findAll();
	
	public void saveCurso(Curso curso);
	
	public List<Curso> getCursosProfesor(Long id);
	
}
