package moves;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() { super(Type.NORMAL, 70, 100);}

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        Status s = att.getCondition();
        double mult = (s == Status.BURN || s == Status.POISON || s == Status.PARALYZE) ? 2.0 : 1.0;
        return super.calcBaseDamage(att, def) * mult;
    }

    @Override
    protected String describe() { return "использует Facade и наносит двойной урон, если горит, отравлен или парализован"; }
}
