
public class Squirtle extends Poketmon {
    public Squirtle() {
        this.level = 1;
        this.hp = 44;
        this.name = "꼬부기";
    }
    
    @Override
    void attack(){
        System.out.println(this.name + " 이(가) 하이드로펌프 공격 시전!");
    }
}
