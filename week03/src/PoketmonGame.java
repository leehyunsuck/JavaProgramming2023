public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikachu = new Poketmon();
        Poketmon charizead = new Poketmon();

        pikachu.name = "피카츄";
        pikachu.level = 3;
        pikachu.hp = 100;

        charizead.level = 36;
        charizead.hp = 800;
        charizead.name = "리자몽";

        System.out.println(charizead.name + "의 체력은 " + charizead.hp + "이고 레벨은 " + charizead.level + "입니다.");
        charizead.evolve(charizead);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
    }

}
