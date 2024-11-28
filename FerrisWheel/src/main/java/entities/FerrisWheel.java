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

}
