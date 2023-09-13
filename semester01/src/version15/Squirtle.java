package version15;

public class Squirtle extends Pokemon {
    public Squirtle() {
        System.out.println("자식 클래스(꼬부기)의 기본 생성자");
        this.level = 1;
        this.hp = 44;
        this.name = "꼬부기";
    }

    public void type(){
        System.out.println(this.name + " 은(는) 물 속성!");
    }
    
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 하이드로펌프 공격 시전!");
    }
}
