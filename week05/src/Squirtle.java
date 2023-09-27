

public class Squirtle extends Pokemon {
    public Squirtle(Flyable f) {
        System.out.println("꼬북꼬북!");
        this.level = 1;
        this.attackRate = 48;
        this.hp = 44;
        this.name = "꼬부기";
        this.flyable = f;
    }

    public void type(){
        System.out.println(this.name + " 은(는) 물 속성!");
    }
    
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 하이드로펌프 공격 시전!");
    }
}
