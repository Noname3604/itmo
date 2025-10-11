package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Castform extends Pokemon {
    public Castform(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(70, 70, 70, 70, 70, 70);
        setMove(new ShadowBall(), new Facade(), new ThunderWave(), new Thunder());
    }
}
