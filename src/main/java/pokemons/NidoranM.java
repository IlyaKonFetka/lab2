package pokemons;

import moves.nidoran_m.Blizzard;
import moves.nidoran_m.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranM extends Pokemon {
    public NidoranM(String name, int level) {
        super(name, level);
        super.setType(Type.POISON);
        super.setStats(
                46,
                57,
                40,
                40,
                40,
                50
        );
        super.setMove(
                new Thunderbolt(),
                new Blizzard()
        );
    }
}
