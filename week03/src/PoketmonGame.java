

public class PoketmonGame {
    public static void main(String[] args) {
//        Poketmon p1 = new Pikachu(); // upcast 가능, 부모 클래스 타입의 변수로 받음
//        Pikachu p2 = new Pikachu(); // 캐스팅X (형변환X)
//        //Pikachu p3 = new Poketmon(); // downcast 불가, 자식 클래스 타입의 변수는 부모 클래스의 객체를 변환할 수 없다.
//
////        p1.type();
//        p2.type();
//
////        Charizard p4 = (Charizard)p1; //compile error X , runtime error O
//        Pikachu p3 = (Pikachu)p1;
//        p3.type();
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);

        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();

        p1.evolve();
        s1.evolve();

    }
}