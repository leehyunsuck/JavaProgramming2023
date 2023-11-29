package StreamTest;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class Pokemon{
    protected int level;
    protected String name;

    public Pokemon(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public abstract void evolve();
}

class Pikachu extends Pokemon {

    public Pikachu(int level, String name) {
        super(level, name);
    }

    @Override
    public void evolve() {
        if (this.level >= 16) {
            this.name = "Raichu";
            System.out.println("Congratulations, your Pikachu has evolved " + this.name);
        } else {
            System.out.println(this.name + " cannot evolve");
        }
    }
}

public class PokemonDemo {
    public static void main(String[] args) {
        List<Pikachu> pokemons = Stream.of(
                new Pikachu(15, "피카츄1"),
                new Pikachu(16, "피카츄2"),
                new Pikachu(17, "피카츄3")
        ).collect(Collectors.toList());

        //pokemons.forEach(Pikachu::evolve);
        pokemons.forEach(pikachu -> pikachu.evolve());
    }
}
