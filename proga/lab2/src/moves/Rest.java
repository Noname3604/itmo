package moves;

import ru.ifmo.se.pokemon.*;

public final class Rest extends StatusMove {
    public Rest() { super(Type.PSYCHIC, 0, 100); }

    @Override
    protected void applySelfEffects(Pokemon p) {
        double need = p.getStat(Stat.HP) - p.getHP();
        p.setMod(Stat.HP, -(int) need);
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2));
    }

    @Override
    protected String describe() { return "использует Rest и засыпает на 2 хода, полностью восстанавливая HP"; }
}
