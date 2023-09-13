
public class Poketmon {
    protected int level;
    protected int hp;
    protected String name;

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    void attack(){
        System.out.println(this.name + " 이(가) 기본 공격 시전");
    }
    void evolve(){
        this.level += 1;
        this.hp += 100;
        String texts = """
                    ===============
                     name의 레벨이
                     level으로 증가!
                    ===============
                    """
                .replace("level", this.level+"")
                .replace("name", this.name);
        System.out.println(texts);
    }
}