public class Poketmon {
    String name;
    int level;
    int hp;

    Poketmon(){
        System.out.println("포켓몬 객체 생성!");
    }

    void evolve(Poketmon poketmon){
        poketmon.level += 1;
        System.out.println(poketmon.name + "의 레벨이 " + poketmon.level + "으로 증가!");
    }
}
