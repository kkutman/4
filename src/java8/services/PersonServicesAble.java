package java8.services;

import java8.classes.Person;

import java.util.List;

public interface PersonServicesAble {
    String greate(Person people);
    List<Person>getPerson();
    Person getPersonFirsName(String name,List<Person>people);
}
