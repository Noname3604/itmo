package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Vikavolt extends Charjabug {
    public Vikavolt(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(77, 70, 90, 145, 75, 43);
        addMove(new ViceGrip());
    }
}
