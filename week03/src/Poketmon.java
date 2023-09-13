public class Poketmon {
    String name;
    int level;
    int hp;

    Poketmon(){
        System.out.println("포켓몬 객체 생성!");
    }

    void evolve(int level){
        level += 1;
        System.out.println("포켓몬스터의 레벨 증가 : " + level);
    }
}
