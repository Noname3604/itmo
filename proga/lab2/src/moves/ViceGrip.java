package moves;

import ru.ifmo.se.pokemon.*;

public final class ViceGrip extends PhysicalMove {
    public ViceGrip() { super(Type.NORMAL, 55, 100); }

    @Override
    protected String describe() { return "атакует Vice Grip"; }
}
