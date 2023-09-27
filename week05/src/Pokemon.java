

public abstract class Pokemon {
    protected int level;
    protected int hp;
    protected String name;
    protected int attackRate;
    protected int defenseRate;

    private static int pokemonCount = 0;

    Flyable flyable; //연관 관계

    public void setFlyable(Flyable flyable){
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.print(this.name + "이(가) ");
        this.flyable.fly();
    }



    public Pokemon() {
        pokemonCount++;
    }

    public Pokemon(int level, int hp, String name) {
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

    public void evolve(){
        if (this instanceof Pikachu){
            System.out.println("삐까삐까!");
        } else if(this instanceof Squirtle){
            System.out.println("꼬북꼬북!");
        } else if(this instanceof  Charizard){
            System.out.println("리이~자몽!");
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

    public abstract void attack();

    public void attack(Pokemon target, String skill) {
        System.out.println(this.name + "이(가) " + target.name + "에게 " + skill + " 공격 시전!");
        target.hp = target.hp - this.attackRate + target.defenseRate;
        if (target.hp <= 0) {
            System.out.println(target.name + "은(는) 사망!");
        } else {
            System.out.println(target.name + "의 체력은 "+ target.hp + "입니다");
        }
    }
}