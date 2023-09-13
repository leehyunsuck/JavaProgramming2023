
public class PoketmonGame {
    public static void main(String[] args) {
        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Charizard c1 = new Charizard();


        p1.attack();
        c1.attack();
        s1.attack();

        c1.evolve();

        System.out.println(c1.getLevel()+"(LV)");
        System.out.println(c1.getHp()+"(HP)");

    }
}