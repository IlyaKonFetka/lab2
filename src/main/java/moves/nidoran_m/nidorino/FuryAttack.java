package moves.nidoran_m.nidorino;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FuryAttack extends PhysicalMove {
    public FuryAttack(){
        super(Type.NORMAL,15,0);
        double p = 1;
        double currentChance = Math.random();
        if (currentChance > 7d/8d) p = 75;
        else if (currentChance > 6d/8d) p = 60;
        else if (currentChance > 3d/8d) p = 45;
        else p = 30;
        this.power = p;
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return super.checkAccuracy(pokemon, pokemon1);
    }
    String className = "Furry Attack";
    @Override
    protected String describe() {
        return super.describe() + " " + className;
    }
}
