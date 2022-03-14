package com.Spring.microPersona.infrastructure.persistencia.repository;

import com.Spring.microPersona.infrastructure.persistencia.dao.DaoPersona;
import com.Spring.microPersona.infrastructure.persistencia.dto.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository {

    @Autowired
    DaoPersona daoPersona;


    public List<Persona> getAll() {
        return (List<Persona>) daoPersona.findAll();
    }

    public Persona save(Persona persona) {
        return daoPersona.save(persona);
    }

    public Optional<Persona> getPersona(Integer id) {
        return daoPersona.findById(id);
    }

    public boolean delete(Integer id) {
    daoPersona.deleteById(id);
        return false;
    }

}
