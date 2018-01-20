package service;

import model.Person;

@FunctionalInterface
public interface PersonService {

    Person create(String name, int age);

}