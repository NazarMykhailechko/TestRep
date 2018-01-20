package service;


import annotations.DefaultValue;
import model.Person;

public class PersonServiceImpl implements PersonService{

    private Person person;

    @Override
    @DefaultValue(name = "Nazar", age = 34)
    public Person create(String name, int age) {

        //person.setName(name);
        //person.setAge(age);

        return new Person(name,age);
    }
}