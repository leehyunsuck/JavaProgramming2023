
public class Poketmon {
    protected int level;
    protected int hp;
    protected String name;

    private static int pokemonCount = 0;


    public Poketmon() {
        System.out.println("부모 클래스의 기본 생성자");
        pokemonCount++;
    }

    public Poketmon(int level, int hp, String name) {
        System.out.println("부모 클래스의 매개변수 생성자 (생성자 오버로딩)");
        this.level = level;
        this.hp = hp;
        this.name = name;
        pokemonCount++;
    }

    public static int getPokemonCount() {
        return pokemonCount;
    }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    public void attack(){
        System.out.println(this.name + " 이(가) 기본 공격 시전");
    }
    public void evolve(){
        if (this instanceof Pikachu){
            System.out.println("삐까삐까!");
        } else if(this instanceof Squirtle){
            System.out.println("꼬북꼬북!");
        }

        this.level += 1;
        this.hp += 100;
        String texts = """
                    ===============
                     name의 레벨이
                     level(LV) 으로 증가!
                    ===============
                    """
                .replace("level", this.level+"")
                .replace("name", this.name);
        System.out.println(texts);
    }
    //자식 클래스에서 override 불가능 메서드
    public final void info() {
        String texts = """
                =====================
                이름 : name
                레벨 : level
                체력 : hp
                =====================
                """
                .replace("name",this.name)
                .replace("level",this.level+"")
                .replace("hp",this.hp+"");
        System.out.println(texts);
    }
}