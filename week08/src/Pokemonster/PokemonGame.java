package Pokemonster;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다\n야생 포캣몬이 나타났습니다");

        //적 포켓몬 랜덤 생성
        Pokemon enemy = null;

        int enemyPick = (int)(Math.random()*3);
        if (enemyPick == 0) {
            NoFly noFly = new NoFly();
            enemy = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            enemy = new Squirtle(noFly);
        } else {
            Wings wings = new Wings();
            enemy = new Charizard(wings);
        }

        //아군 포켓몬 선택

        try {
            Pokemon player = null;
            Scanner input = new Scanner(System.in);
            while (true) {
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
                    continue;
                }
                break;
            }


            int menu, skillMenu;
            while (true) {
                System.out.print("\t[1]전투   [2]도망   [3]종료 : ");
                menu = input.nextInt();

                if (menu == 1) {
                    while (true) {
                        System.out.print("전투기술 : ");

                        for (int i = 1; i <= player.skills.size(); i++) {
                            System.out.print(i + ") " + player.skills.get(i-1) + " ");
                        }

                        skillMenu = input.nextInt();
                        if (skillMenu <= player.skills.size() && skillMenu != 0) {
                            player.attack(enemy, skillMenu-1);
                            enemy.attack(player, (int)(Math.random() * 3));
                            break;
                        } else {
                            System.out.println("옳바르지 않은 스킬선택 입니다");
                        }
                    }
                } else if (menu == 2) {

                } else if (menu == 3) {
                    System.out.println("게임 종료");
                    break;
                } else {
                    System.out.println("옳바르지 않은 선택 입니다");
                }
            }
        } catch (InputMismatchException err) {
            System.out.println("입력값은 숫자 만 가능합니다");
            System.out.println("세부 내용 : " + err.getMessage());
        } catch (NullPointerException err) {
            System.out.println("플레이어 객체가 생성되지 않았습니다");
            System.out.println("세부 내용 : " + err.getMessage());
        } catch (IndexOutOfBoundsException err) {
            System.out.println("존재하지 않는 스킬");
            System.out.println("세부 내용 : " + err.getMessage());
        } catch (Exception err) {
            System.out.println("Exception 발생");
            System.out.println("세부 내용 : " + err.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

    }
}