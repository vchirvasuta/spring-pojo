package com.vali.springpojo.controller;

import com.vali.springpojo.model.Person;
import com.vali.springpojo.service.MyPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyPersonController {

    @Autowired
    private MyPersonService myPersonService;

    @GetMapping("/all")
    public List<Person> getAllPersons() {
        return myPersonService.getAllPersons();
    }

    @PostMapping("/add")
    public void addPerson(@RequestBody Person person) {
        myPersonService.addPerson(person);
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable int id) {
        myPersonService.deletePerson(id);
    }

    @PostMapping("/update")
    public void updatePerson(@RequestBody Person person) {
        myPersonService.updatePerson(person);
    }
}
