package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Charjabug extends Grubbin {
    public Charjabug(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);
        addMove(new Crunch());
    }
}
