package pokemons;

import moves.electrike.manectric.Overheat;
import ru.ifmo.se.pokemon.Type;

public class Manectric extends Electrike{
    public Manectric(String name, int level) {
        super(name, level);
        super.setStats(
                70,
                75,
                60,
                105,
                60,
                105
        );
        super.addMove(
                new Overheat()
        );
    }
}





