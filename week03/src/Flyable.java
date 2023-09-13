
public interface Flyable {
    default void fly() {
        System.out.println("날개로 하늘을 날아갑니다");
    };
}
