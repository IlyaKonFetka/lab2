package moves.nidoran_m;

import general.Methods;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE,110,70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(Methods.probability(0.1) && !pokemon.hasType(Type.ICE)) {
            Effect.freeze(pokemon);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if(Methods.probability(0.1) && !pokemon.hasType(Type.ICE)) {
            Effect.freeze(pokemon);

        }
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return super.checkAccuracy(pokemon, pokemon1);
    }
    String className = "Blizzard";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
