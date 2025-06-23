package com.practica01.dao;

import com.practica01.domain.Arbol;
import org.springframework.data.repository.CrudRepository;

public interface ArbolDao extends CrudRepository<Arbol, Long> {
}