
public class PoketmonGame {
    public static void main(String[] args) {
        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Charizard c1 = new Charizard();
        Charizard c2 = new Charizard(100,100,"리자몽");

        //s1.level = 2;   //상속관계 아니며, 같은 패키지가 아니기에 protected로 선언된건 사용 불가능
        s1.setLevel(2);
        System.out.println(s1.getLevel());
        p1.attack();
        c1.attack();
        s1.attack();

        c1.evolve();

        System.out.println(s1.getLevel()+"(LV)");
        System.out.println(s1.getHp()+"(HP)");

        s1.info();

        c1.info();
        c2.info();
    }
}