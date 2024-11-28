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

    public void board(int position, Person person) {
        Gondola gondola = gondolas.get(position);

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
        throw new IllegalStateException("All the gondolas are empty!");
    }

    public void status(){
        System.out.println("*" + "Gondola status");
        System.out.println("* ___________________");
        for (Gondola g : gondolas) {
            System.out.println(g);
        }
    }

}
