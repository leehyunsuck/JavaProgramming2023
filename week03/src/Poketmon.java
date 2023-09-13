public class Poketmon {
    // fields, 멤버 변수, 속성
    // 캡슐화
    private String name;
    private int level;
    private int hp;
    //static member variable
    private static int poketmonCount = 0;

    Poketmon(){
        System.out.println("포켓몬 객체 생성!");
        this.hp = 100;
        poketmonCount++;
    }
    //생성자 오버로딩
    Poketmon(String name){
        System.out.println("포켓몬 객체 생성!(매개 변수 1개 생성자)");
        //this(name, 1);
        this.name = name;
        this.level = 1;
        this.hp = 100;
        poketmonCount++;
    }
    Poketmon(String name, int level) {
        System.out.println("포켓몬 객체 생성!(매개 변수 2개 생성자)");
        this.name = name;
        this.level = level;
        this.hp = 100;
        poketmonCount++;
    }

    // alt+instert

    public static int getPoketmonCount() {
        return poketmonCount;
    }

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
        //System.out.println(poketmon.name + "의 레벨이 " + poketmon.level + "으로 증가!");
        String texts = """
                    name의 레벨이
                    level으로 증가!
                """
                .replace("level", poketmon.level+"")
                .replace("name", poketmon.name);
        System.out.println(texts);
    }
    
    void attack(){
        System.out.println(this.name + " 이(가) 광역 도발 공격을 시전");
    }

    void attack(Poketmon poketmon){
        System.out.println(this.name + " 이(가) " + poketmon.name + "에게 기본공격 시전");
    }

}