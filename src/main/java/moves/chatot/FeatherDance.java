package moves.chatot;

import ru.ifmo.se.pokemon.*;

public class FeatherDance extends StatusMove {
    public FeatherDance(){
        super(Type.FLYING,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.ATTACK,-2));
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }
    String className = "Feather Dance";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
