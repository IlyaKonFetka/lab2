package moves.chatot;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Boomburst extends SpecialMove {
    public Boomburst(){
        super(Type.NORMAL, 140,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }
    String className = "Boomburst";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }

}
