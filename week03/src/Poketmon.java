public class Poketmon {
    // fields, 멤버 변수, 속성
    // 캡슐화
    private String name;
    private int level;
    private int hp;

    Poketmon(){
        System.out.println("포켓몬 객체 생성!");
    }

    Poketmon(String name, int level, int hp) {
        System.out.println("포켓몬 객체 생성!(매개 변수 3개 생성자)");
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    Poketmon(String name){
        System.out.println("포켓몬 객체 생성!(매개 변수 1개 생성자)");
        this.name = name;
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