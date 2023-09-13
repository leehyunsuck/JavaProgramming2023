public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikachu = new Poketmon("피카츄");
        Poketmon charizead = new Poketmon();
        Poketmon squirtle = new Poketmon("꼬부기", 1);

        charizead.setName("리자몽");
        charizead.setLevel(36);
        pikachu.setLevel(23).setHp(500);

        System.out.println();
        System.out.println(pikachu.getName() + "의 체력은 " + pikachu.getHp() + "이고 레벨은 " + pikachu.getLevel() + "입니다.");
        System.out.println(charizead.getName() + "의 체력은 " + charizead.getHp() + "이고 레벨은 " + charizead.getLevel() + "입니다.");
        System.out.println(squirtle.getName() + "의 체력은 " + squirtle.getHp() + "이고 레벨은 " + squirtle.getLevel() + "입니다.");
        System.out.println();

        charizead.evolve(charizead);

        squirtle.evolve(squirtle);
        squirtle.evolve(squirtle);

        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
        pikachu.setName("라이츄");
        pikachu.evolve(pikachu);

        System.out.println();
        System.out.println(pikachu.getName() + "의 체력은 " + pikachu.getHp() + "이고 레벨은 " + pikachu.getLevel() + "입니다.");
        System.out.println(charizead.getName() + "의 체력은 " + charizead.getHp() + "이고 레벨은 " + charizead.getLevel() + "입니다.");
        System.out.println(squirtle.getName() + "의 체력은 " + squirtle.getHp() + "이고 레벨은 " + squirtle.getLevel() + "입니다.");
        System.out.println();
    }

}

