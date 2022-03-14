package com.Spring.microPersona.infrastructure.persistencia.dao;

import com.Spring.microPersona.infrastructure.persistencia.dto.Persona;
import org.springframework.data.repository.CrudRepository;


public interface DaoPersona extends CrudRepository<Persona,Integer> {


}
