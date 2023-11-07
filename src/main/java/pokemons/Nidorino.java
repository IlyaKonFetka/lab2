package pokemons;

import moves.nidoran_m.nidorino.FuryAttack;

public class Nidorino extends NidoranM{
    public Nidorino(String name, int level) {
        super(name, level);
        super.setStats(
                61,
                72,
                57,
                55,
                55,
                65
        );
        super.addMove(
                new FuryAttack()
        );
    }
}
