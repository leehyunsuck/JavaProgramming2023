package version15;

public class Charizard extends Pokemon {
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
        System.out.println(this.name + " 이(가) 플레어드라이브 공격 시전!");
    }
    public void type(){
        System.out.println(this.name + " 은(는) 화염 속성!");
    }
}
