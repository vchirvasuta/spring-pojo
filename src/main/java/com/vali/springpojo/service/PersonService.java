package com.vali.springpojo.service;

import com.vali.springpojo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> persons = new ArrayList<>();

    public List<Person> getAllPersons() {
        return persons;
    }

    public Person getPersonById(int id) {
        return persons.stream()
            .filter(person -> person.getId() == id)
            .findFirst()
            .get();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void updatePerson(int id, Person updatedPerson) {
        persons.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p -> {
                    p.setName(updatedPerson.getName());
                    p.setAge(updatedPerson.getAge());
                });
    }

    public void deletePerson(int id) {
        persons.removeIf(person -> person.getId() == id);
    }


}
