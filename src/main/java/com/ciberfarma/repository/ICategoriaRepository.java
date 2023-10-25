package com.ciberfarma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciberfarma.model.Categoria;

//agregamos la anotacion para el repositorio
@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>{

}
