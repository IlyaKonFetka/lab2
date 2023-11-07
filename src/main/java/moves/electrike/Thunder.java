package moves.electrike;

import general.Methods;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(Methods.probability(0.3) && !pokemon.hasType(Type.ELECTRIC)) {
            Effect.paralyze(pokemon);
        }
    }
    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return super.checkAccuracy(pokemon, pokemon1);
    }

    String className = "Thunder";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
