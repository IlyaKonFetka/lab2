package pokemons;

import moves.chatot.Aerial_Ace;
import moves.chatot.Confide;
import moves.electrike.QuickAttack;
import moves.electrike.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Electrike extends Pokemon {
    public Electrike(String name, int level) {
        super(name, level);
        super.setType(Type.ELECTRIC);
        super.setStats(
                40,
                45,
                40,
                65,
                40,
                65
        );
        super.setMove(
                new Thunder(),
                new Confide(),
                new QuickAttack()
        );
    }
}
