package pokemons;

import moves.*;

public final class Furret extends Sentret {
    public Furret(String name, int level) {
        super(name, level);
        setStats(85, 76, 64, 45, 55, 90);
        addMove(new FocusBlast());
    }
}
