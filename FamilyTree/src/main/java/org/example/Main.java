package org.example;

import entities.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person lily = new Person("Lily");
        lily.addSpouse(new Person("Jhon"));

        System.out.println(lily);

    }
}