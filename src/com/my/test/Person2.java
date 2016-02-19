package com.my.test;

public class Person2 {
    private String name;
    private String name2=null;
    public Person2(String name) {
        this.name = name;
 // add this to test within project reference of another class
        Person otherPerson = new Person(name);
        this.name2 = otherPerson.getName();        
    }   
    // testing a change
    public String getName() {
        return name;
    }
   
}
