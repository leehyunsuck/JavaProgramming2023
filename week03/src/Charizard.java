
public class Charizard extends Poketmon {
    public Charizard() {
        this.level = 36;
        this.hp = 78;
        this.name = "리자몽";
    }

    @Override
    void attack(){
        System.out.println(this.name + " 이(가) 불꽃 공격 시전!");
    }
}
