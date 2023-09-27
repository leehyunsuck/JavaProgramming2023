
public class Pikachu extends Pokemon {
    public Pikachu(Flyable f) {
        System.out.println("피카츄~!");
        this.level = 1;
        this.attackRate = 55;
        this.hp = 35;
        this.name = "피카츄";
        this.flyable = f;
//        this.flyable = new NoFly();
    }
    public void type(){
        System.out.println(this.name + " 은(는) 전기 속성!");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 100만 볼트 공격 시전!");
    }
}
