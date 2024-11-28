package entities;

import java.util.ArrayList;
import java.util.List;

public class Adult extends Person {

    private List<Child> children = new ArrayList<Child>();
    public Adult(String name, int age) {
        super(name, age);
    }
    public void addChild(Child child) {
        children.add(child);
    }

}
