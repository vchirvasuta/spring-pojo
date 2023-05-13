package com.vali.springpojo.service;

import com.vali.springpojo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyPersonService {

    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public void deletePerson(int id) {
        persons.removeIf(person -> person.getId() == id);
    }

    public void updatePerson(Person person) {
        persons.stream()
                .filter(p -> p.getId() == person.getId())
                .findFirst()
                .ifPresent(p -> {
                    p.setName(person.getName());
                    p.setAge(person.getAge());
                    p.setId(person.getId());
                });
    }
}
