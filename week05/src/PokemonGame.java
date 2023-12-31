import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다\n" +
                "야생 포캣몬이 나타났습니다");

        //적 포켓몬 랜덤 생성
        Pokemon enemy = null;
        int enemyPick = (int)(Math.random()*3);
        if (enemyPick == 0) {
            NoFly noFly = new NoFly();
            enemy = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            enemy = new Squirtle(noFly);
        } else if (enemyPick == 2) {
            Wings wings = new Wings();
            enemy = new Charizard(wings);
        } else {
            System.out.println("!Error!");
        }

        //아군 포켓몬 선택
        Pokemon player = null;
        Scanner input = new Scanner(System.in);
        System.out.print("포켓몬 선택 : " +
                "   1] 피카츄" +
                "   2] 꼬부기" +
                "   3] 리자몽" +
                " : ");
        int pokemonPick = input.nextInt();
        if (pokemonPick == 1) {
            NoFly noFly = new NoFly();
            player = new Pikachu(noFly);
        } else if (pokemonPick == 2) {
            NoFly noFly = new NoFly();
            player = new Squirtle(noFly);
        } else if (pokemonPick == 3) {
            Wings wings = new Wings();
            player = new Charizard(wings);
        } else {
            System.out.println("정상적인 선택이 아닙니다");
        }

        int menu, skillMenu;
        while (true) {
            System.out.print("\t[1]전투   [2]도망   [3]종료 : ");
            menu = input.nextInt();

            if (menu == 1) {
                System.out.print("전투기술 :" +
                        "   1] " + player.skills[0] +
                        "   2] " + player.skills[1] +
                        "   3] " + player.skills[2] +
                        " : ");

                skillMenu = input.nextInt();
                player.attack(enemy, skillMenu-1);
            } else if (menu == 2) {
                
            } else {
                System.out.println("게임 종료");
                break;
            }
        }
    }
}