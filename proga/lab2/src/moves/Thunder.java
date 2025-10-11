package moves;

import ru.ifmo.se.pokemon.*;

public final class Thunder extends SpecialMove {
    public Thunder() { super(Type.ELECTRIC, 110, 70); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() { return "атакует Thunder и с 30% шансом парализует цель"; }
}
