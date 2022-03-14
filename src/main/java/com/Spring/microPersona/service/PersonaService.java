package com.Spring.microPersona.service;

import com.Spring.microPersona.domain.entity.Persona;

import java.util.List;

public interface PersonaService  {

    Persona findById(Integer id);

    void savePersona(Persona persona);

    Boolean deletePersona(Integer id);

    Boolean isExistPersona(Persona persona);

    List<Persona> ConsultaEdadMayoresde(int edad);
}
