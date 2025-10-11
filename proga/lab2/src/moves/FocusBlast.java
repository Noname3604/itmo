package moves;

import ru.ifmo.se.pokemon.*;

public final class FocusBlast extends SpecialMove {
    public FocusBlast() { super(Type.FIGHTING, 120, 70); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() { return "заряжает Focus Blast, наносит урон и с 10% шансом снижает Special Defense цели на один"; }
}
