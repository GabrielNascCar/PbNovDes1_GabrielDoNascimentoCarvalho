package entities;

public class Child extends Person {

    private Adult responsible;
    public Child(String name, int age, Adult responsible) {
        super(name, age);
        this.responsible = responsible;
        if (responsible != null) {
            responsible.addChild(this);
        }
    }
    public Adult getResponsible() {
        return responsible;
    }

}
