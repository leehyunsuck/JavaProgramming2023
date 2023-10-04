package generic;

import Pokemonster.*;

import java.util.ArrayList; //built-in
import java.util.List;      //built-in

public class ListDemo {
    List<Pokemon> pokemons = new ArrayList<>(); //<Pokemon>
    pokemons.add(new Pikachu(new NoFly()));
    pokemons.add(new Squirtle(new NoFly()));
    pokemons.add(new Charizard(new Wings()));

    for(Pokemon p : pokemons) {
        p.attack();
    }

}
