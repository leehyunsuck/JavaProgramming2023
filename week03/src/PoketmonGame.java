public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikachu = new Poketmon("피카츄");
        pikachu.setLevel(23);
        pikachu.setHp(100);

        Poketmon charizead = new Poketmon();
        charizead.setName("리자몽");
        charizead.setLevel(36);
        charizead.setHp(800);

        Poketmon squirtle = new Poketmon("꼬부기", 1, 50);
        squirtle.evolve(squirtle);
        System.out.println(squirtle.getName());
        squirtle.evolve(squirtle);

        System.out.println(charizead.getName() + "의 체력은 " + charizead.getHp() + "이고 레벨은 " + charizead.getLevel() + "입니다.");
        charizead.evolve(charizead);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
        pikachu.setName("라이츄");
        System.out.println(pikachu.getName());
        pikachu.evolve(pikachu);


    }

}

