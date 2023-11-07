package moves.chatot;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Aerial_Ace extends PhysicalMove {

    public Aerial_Ace() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    String className = "Aerial Ace";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
