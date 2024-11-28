package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Person spouse;

    private List<Person> children = new ArrayList<Person>();

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Person parent) {
        this.name = name;
        if (parent != null) {
            parent.addChild(this);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person getSpouse() {
        return spouse;
    }
    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
    public List<Person> getChildren() {
        return children;
    }
    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

}
