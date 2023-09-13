public class Poketmon {
    // fields, 멤버 변수, 속성
    // 캡슐화
    private String name;
    private int level;
    private int hp;

    Poketmon(){
        System.out.println("포켓몬 객체 생성!");
        this.hp = 100;
    }

    Poketmon(String name){
        this(name, 1);
        System.out.println("포켓몬 객체 생성!(매개 변수 1개 생성자)");
    }

    Poketmon(String name, int level) {
        System.out.println("포켓몬 객체 생성!(매개 변수 2개 생성자)");
        this.name = name;
        this.level = level;
        this.hp = 100;
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

    public Poketmon setLevel(int level) {
        //return type [void] -> [Poketmon]
        this.level = level;
        return this;
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