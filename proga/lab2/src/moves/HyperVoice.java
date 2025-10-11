package moves;

import ru.ifmo.se.pokemon.*;

public final class HyperVoice extends SpecialMove {
    public HyperVoice() { super(Type.NORMAL, 90, 100); }

    @Override
    protected String describe() { return "применяет Hyper Voice и наносит урон"; }
}
