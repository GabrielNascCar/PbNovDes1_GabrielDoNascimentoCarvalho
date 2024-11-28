package entities;

public class Gondola {

    private int number;
    private Person seat1;
    private Person seat2;

    public Gondola() {}

    public Gondola(int number, Person seat1, Person seat2) {
        this.number = number;
        this.seat1 = seat1;
        this.seat2 = seat2;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Person getSeat1() {
        return seat1;
    }
    public void setSeat1(Person seat1) {
        this.seat1 = seat1;
    }
    public Person getSeat2() {
        return seat2;
    }
    public void setSeat2(Person seat2) {
        this.seat2 = seat2;
    }

    @Override
    public String toString() {
        if (seat1 == null && seat2 == null) {
            return "*" + (number + 1) + " (Empty)";
        } else if (seat1 != null && seat2 != null) {
            return "*" + (number + 1) + " " + seat1.getName() + " e " + seat2.getName();
        } else if (seat1 != null) {
            return "*" + (number + 1) + " Only " + seat1.getName();
        } else if (seat2 != null) {
            return "*" + (number + 1) + " Only " + seat2.getName();
        }
        return "*" + (number + 1) + " (Empty)";
    }

}
