class Poketmon {
    // fields, 멤버 변수, 속성
    // 캡슐화
    private String name;
    private int level;
    private int hp;

    Poketmon(){
        System.out.println("포켓몬 객체 생성!");
    }

    // alt+instert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    void evolve(Poketmon poketmon){
        poketmon.level += 1;
        System.out.println(poketmon.name + "의 레벨이 " + poketmon.level + "으로 증가!");
    }
}
public class PoketmonGame {
    public static void main(String[] args) {
        Poketmon pikachu = new Poketmon();
        Poketmon charizead = new Poketmon();

        pikachu.setName("피카츄");
        pikachu.setLevel(3);
        pikachu.setHp(100);

        charizead.setName("리자몽");
        charizead.setLevel(36);
        charizead.setHp(800);

        System.out.println(charizead.getName() + "의 체력은 " + charizead.getHp() + "이고 레벨은 " + charizead.getLevel() + "입니다.");
        charizead.evolve(charizead);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
    }

}

