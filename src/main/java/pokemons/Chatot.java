package pokemons;

import moves.chatot.Aerial_Ace;
import moves.chatot.Boomburst;
import moves.chatot.Confide;
import moves.chatot.FeatherDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chatot extends Pokemon {
    public Chatot(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL,Type.FLYING);
        super.setStats(
                76,
                65,
                45,
                92,
                42,
                91
        );
        super.setMove(
                new Aerial_Ace(),
                new Confide(),
                new Boomburst(),
                new FeatherDance()
        );
    }

}
