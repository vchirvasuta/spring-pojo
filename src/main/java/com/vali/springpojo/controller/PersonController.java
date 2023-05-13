package com.vali.springpojo.controller;

import com.vali.springpojo.model.Person;
import com.vali.springpojo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable int id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/add")
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @PutMapping("{id}")
    public void updatePerson(@PathVariable int id, @RequestBody Person updatedPerson) {
        personService.updatePerson(id, updatedPerson);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable int id) {
        personService.deletePerson(id);
    }
}
