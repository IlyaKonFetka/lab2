package general;

//https://pokemondb.net/pokedex/chatot
//https://pokemondb.net/pokedex/electrike
//https://pokemondb.net/pokedex/manectric
//https://pokemondb.net/pokedex/nidoran-m
//https://pokemondb.net/pokedex/nidorino
//https://pokemondb.net/pokedex/nidoking

import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p = new Chatot("Petya",1);
        Pokemon p1 = new Electrike("Kolya",1);
        Pokemon p2 = new Manectric("Vasya",1);
        Pokemon p3 = new NidoranM("Zhenya",1);
        Pokemon p4 = new Nidorino("Vova",1);
        Pokemon p5 = new Nidoking("Misha",1);

        b.addAlly(p);
        b.addAlly(p1);
        b.addAlly(p2);

        b.addFoe(p3);
        b.addFoe(p4);
        b.addFoe(p5);

        b.go();
    }
}
