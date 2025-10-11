package moves;

import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {
    public ShadowBall() { super(Type.GHOST, 80, 100); }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() { return "наносит урон с помощью Shadow Ball и с 20% шансом снижает Special Defense цели на один"; }
}
