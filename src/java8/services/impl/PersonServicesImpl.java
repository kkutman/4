package java8.services.impl;

import java8.classes.Person;
import java8.services.PersonServicesAble;

import java.util.ArrayList;
import java.util.List;

public class PersonServicesImpl implements PersonServicesAble {
    List<Person>people = new ArrayList<>();
    @Override
    public String greate(Person people) {
        this.people.add(people);
        return "УСПЕШНО!!!";
    }

    @Override
    public List<Person> getPerson() {
        return people;
    }

    @Override
    public Person getPersonFirsName(String name, List<Person> people) {
        for (Person person : people) {
            if(person.getFirstName().equals(name)){
                return person;
            }
        }
        return null;
    }
}
