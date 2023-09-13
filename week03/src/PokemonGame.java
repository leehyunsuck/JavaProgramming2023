
public class PokemonGame {
    public static void main(String[] args) {
//        Poketmon p0 = new Poketmon();
//        p0.attack();
//        p0.evolve();

        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Charizard c1 = new Charizard();

        s1.setFlyable(new NoFly());
        p1.setFlyable(new NoFly());
        c1.setFlyable(new Wings());

        p1.performFly();
        c1.performFly();
        s1.performFly();

        JetBack jetBack = new JetBack();
        p1.setFlyable(jetBack);
        p1.performFly();
//        p1.evolve();
//        s1.evolve();
//        c1.evolve();
//
//        p1.attack();
//        s1.attack();
//        c1.attack();





    }
}