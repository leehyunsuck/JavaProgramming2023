
public class Pikachu extends Poketmon {
    public Pikachu() {
        this.level = 1;
        this.hp = 35;
        this.name = "피카츄";
    }

    @Override
    void attack(){
        System.out.println(this.name + " 이(가) 100만 볼트 공격 시전!");
    }
}
