package moves.electrike.manectric;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(){
        super(Type.FIRE,130,90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK,-2));
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return super.checkAccuracy(pokemon, pokemon1);
    }
    String className = "Overheat";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
