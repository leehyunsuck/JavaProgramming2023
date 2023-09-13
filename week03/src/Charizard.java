

public class Charizard extends Poketmon {
    public Charizard() {
        System.out.println("자식 클래스(리자몽)의 기본 생성자");
        this.level = 36;
        this.hp = 78;
        this.name = "리자몽";
    }

    public Charizard(int level, int hp, String name) {
        super(level, hp, name);
        System.out.println("자식 클래스(리자몽)의 매개변수 생성자 (생성자 오버로딩)");
    }

    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 불꽃 공격 시전!");
    }
}
