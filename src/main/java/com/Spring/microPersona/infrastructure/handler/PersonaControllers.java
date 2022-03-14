package com.Spring.microPersona.infrastructure.handler;

import com.Spring.microPersona.infrastructure.persistencia.dto.Persona;
import com.Spring.microPersona.infrastructure.persistencia.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaControllers {
    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAll() {
        return new ResponseEntity<>(personaRepository.getAll(), HttpStatus.OK);
    }

    @GetMapping("buscar/{id}")
    public ResponseEntity<Persona> getPersona(@PathVariable("id") Integer id) {
        return personaRepository.getPersona(id).map(persona -> new ResponseEntity<>(persona, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaRepository.save(persona), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") Integer id) {
        if (personaRepository.delete(id)){
           return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
