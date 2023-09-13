import java.util.ArrayList;

public class PoketmonGame {
    public static void main(String[] args) {
        ArrayList<Poketmon> poketmons = new ArrayList<>();
        Poketmon charizard = new Poketmon();
        Poketmon pikachu = new Poketmon("피카츄");
        Poketmon squirtle = new Poketmon("꼬부기", 13);

        poketmons.add(pikachu);
        poketmons.add(squirtle);
        poketmons.add(charizard);

        System.out.println(poketmons.size() + "마리 존재");

        poketmons.get(2).setName("리자몽");
        poketmons.get(2).attack(pikachu);
        System.out.println(poketmons.get(1).getName());
        poketmons.get(0).attack();
    }

//    public static void main(String[] args) {
//
//        System.out.println(Poketmon.getPoketmonCount());
//
//        Poketmon pikachu = new Poketmon("피카츄");
//        Poketmon charizead = new Poketmon();
//        Poketmon squirtle = new Poketmon("꼬부기", 1);
//
//        System.out.println(Poketmon.getPoketmonCount());
//
//        charizead.setName("리자몽");
//        charizead.setLevel(36);
//        pikachu.setLevel(23).setHp(500);
//
//        System.out.println();
//        System.out.println(pikachu.getName() + "의 체력은 " + pikachu.getHp() + "이고 레벨은 " + pikachu.getLevel() + "입니다.");
//        System.out.println(charizead.getName() + "의 체력은 " + charizead.getHp() + "이고 레벨은 " + charizead.getLevel() + "입니다.");
//        System.out.println(squirtle.getName() + "의 체력은 " + squirtle.getHp() + "이고 레벨은 " + squirtle.getLevel() + "입니다.");
//        System.out.println();
//
//        charizead.evolve(charizead);
//
//        squirtle.evolve(squirtle);
//        squirtle.evolve(squirtle);
//
//        pikachu.evolve(pikachu);
//        pikachu.evolve(pikachu);
//        pikachu.setName("라이츄");
//        pikachu.evolve(pikachu);
//
//        System.out.println();
//        System.out.println(pikachu.getName() + "의 체력은 " + pikachu.getHp() + "이고 레벨은 " + pikachu.getLevel() + "입니다.");
//        System.out.println(charizead.getName() + "의 체력은 " + charizead.getHp() + "이고 레벨은 " + charizead.getLevel() + "입니다.");
//        System.out.println(squirtle.getName() + "의 체력은 " + squirtle.getHp() + "이고 레벨은 " + squirtle.getLevel() + "입니다.");
//        System.out.println();
//
//        charizead.attack(pikachu);
//        squirtle.attack();
//    }
}