package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoking extends Nidorino {
    public Nidoking(String name, int level) {
        super(name, level);
        super.addType(Type.GROUND);
        super.setStats(
                81,
                102,
                77,
                85,
                75,
                85
        );
    }
}
