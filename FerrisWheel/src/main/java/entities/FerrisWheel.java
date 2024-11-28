package entities;

import java.util.ArrayList;
import java.util.List;

public class FerrisWheel {

    private List<Gondola> gondolas = new ArrayList<Gondola>();

    public FerrisWheel() {
        for (int i = 0; i < 18; i++) {
            gondolas.add(new Gondola(i, null, null));
        }
    }

    public void board(int number, Person person1, Person person2) {
        Gondola gondola = gondolas.get(number - 1); // Recupera a gôndola pela posição
        if (gondola.getSeat1() != null && gondola.getSeat2() != null
                || gondola.getSeat1() == null && gondola.getSeat2() != null
                || gondola.getSeat1() != null && gondola.getSeat2() == null){
            gondola = gondolas.get(searchFreeGondola());
        }
        if (person1.getAge() < 12 || person2.getAge() < 12) {
            if (person1 instanceof Child && person2 instanceof Adult) {
                if(((Child) person1).getResponsible().equals(person2)) {
                    if (gondola.getSeat1() == null && gondola.getSeat2() == null) {
                        gondola.setSeat1(person1);
                        gondola.setSeat2(person2);
                    }
                }
            } else if (person2 instanceof Child && person1 instanceof Adult) {
                if(((Child) person2).getResponsible().equals(person1)) {
                    if (gondola.getSeat1() == null && gondola.getSeat2() == null) {
                        gondola.setSeat1(person1);
                        gondola.setSeat2(person2);
                    }
                }
            }
        } else if (person1.getAge() >= 12 && person2.getAge() >= 12) {
            if (gondola.getSeat1() == null && gondola.getSeat2() == null) {
                gondola.setSeat1(person1);
                gondola.setSeat2(person2);
            }
        }
    }

    public void board(int position, Person person) {
        Gondola gondola = gondolas.get(position - 1);

        if (gondola.getSeat1() != null && gondola.getSeat2() != null){
            gondola = gondolas.get(searchFreeGondola());
        }

        if (person.getAge() >= 12){
            if(gondola.getSeat1() == null){
                gondola.setSeat1(person);
            } else if (gondola.getSeat2() == null) {
                gondola.setSeat2(person);
            }
        }
    }

    public boolean analyze(int numero) {
        Gondola gondola = gondolas.get(numero);
        return gondola.getSeat1() == null && gondola.getSeat2() == null;
    }
    public int searchFreeGondola() {
        for (int i = 0; i < gondolas.size(); i++) {
            if (analyze(i)) {
                return i;
            }
        }
        throw new IllegalStateException("All gondolas are occupied!");
    }

    public void status(){
        System.out.println("*" + "Gondola status");
        System.out.println("* ___________________");
        for (Gondola g : gondolas) {
            System.out.println(g);
        }
    }

}
