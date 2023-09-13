
import java.util.ArrayList;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();
        String menu = """
                
                메뉴
                1. 포켓몬 생성
                2. 내 포켓몬 정보 확인
                3. 내 포켓몬 진화
                4. 다른 포켓몬 공격
                5. 종료
                """;

        System.out.println("포켓몬 게임 시작!");
        while (true) {

            System.out.print(menu);
            System.out.print("번호 선택 : ");
            int number = input.nextInt();
            input.nextLine();

            if (number == 1) {

                System.out.print("포켓몬 이름을 입력해주세요 : ");
                String name = input.nextLine();
                System.out.print("포켓몬 레벨을 입력해주세요 : ");
                int level = input.nextInt();
                Pokemon monster = new Pokemon(name, level);
                System.out.println(name + " 포켓몬 생성!");
                pokemonArrayList.add(monster);
            } else if (number == 2) {
                if (pokemonArrayList.size() == 0) {
                    System.out.println("포켓몬을 가지고 있지 않습니다!");
                } else {
                    for(int i = 0; i < pokemonArrayList.size(); i++) {
                        System.out.println("포켓몬 이름 : " + pokemonArrayList.get(i).getName());
                        System.out.println("포켓몬 레벨 : " + pokemonArrayList.get(i).getLevel());
                        System.out.println("포켓몬 체력 : " + pokemonArrayList.get(i).getHp());
                    }
                }
            } else if (number == 3) {
                if (pokemonArrayList.size() == 0) {
                    System.out.println("포켓몬을 가지고 있지 않습니다!");
                } else {
                    pokemonArrayList.get(0).evolve(pokemonArrayList.get(0));
                }
            } else if (number == 4) {
                if (pokemonArrayList.size() == 0) {
                    System.out.println("포켓몬을 가지고 있지 않습니다!");
                } else {
                    pokemonArrayList.get(0).attack(new Pokemon("파이리", 5));
                    System.out.println(pokemonArrayList.get(0).getName() + "이(가) 파이리를 공격했습니다!");
                }
            } else if (number == 5) {
                System.out.println("게임 종료!");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}

