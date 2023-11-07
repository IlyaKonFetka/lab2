package moves.chatot;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,-1));
    }
    String className = "Confide";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
