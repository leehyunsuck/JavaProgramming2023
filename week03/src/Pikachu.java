
public class Pikachu extends Poketmon {
    public Pikachu() {
        System.out.println("자식 클래스(피카츄)의 기본 생성자");
        this.level = 1;
        this.hp = 35;
        this.name = "피카츄";
    }
    public void type(){
        System.out.println(this.name + " 은(는) 전기 속성!");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 100만 볼트 공격 시전!");
    }
}
