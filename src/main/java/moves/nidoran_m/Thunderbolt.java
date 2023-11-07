package moves.nidoran_m;

import general.Methods;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(){
        super(Type.ELECTRIC,90,100);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if(Methods.probability(0.1) && !pokemon.hasType(Type.ELECTRIC)) {
            Effect.paralyze(pokemon);
        }
    }
    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }
    String className = "Thunderbolt";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
