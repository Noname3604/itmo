package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Sentret extends Pokemon {
    public Sentret(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(35, 46, 34, 35, 45, 20);
        setMove(new Confide(), new HyperVoice(), new DefenseCurl());
    }
}
