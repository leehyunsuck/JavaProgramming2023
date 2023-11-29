package Pokemonster;

import fly.NoFly;
import fly.Wings;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.*;

public class PokemonGame {
    public static Pokemon enemy = null;
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다");

        //아군 포켓몬 선택
        try {
            Pokemon player = null;
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.print("포켓몬 선택 : 1]피카츄  2]꼬부기  3]리자몽  : ");
                int pokemonPick = input.nextInt();

                player = switch (pokemonPick) {
                    case 1 -> new Pikachu( () -> System.out.println("로켓 추진기로 날아갑니다"));
                    case 2 -> new Squirtle(new NoFly());
                    case 3 -> new Charizard(new Wings());
                    default -> null;
                };
                if (player != null) break;
            }

            produceEnemy();     //적 생성 메소드 호출

            int menu, skillMenu;
            while (true) {
                System.out.print("\t1]전투   2]도망   3]회복물약  4]종료  : ");
                menu = input.nextInt();

                if (menu == 1) {
                    while (true) {

                        System.out.print("전투기술 : ");
                        for (int i = 1; i <= player.skills.size(); i++) {
                            System.out.print(i + ") " + player.skills.get(i) + " ");
                        }

                        skillMenu = input.nextInt();
                        if (skillMenu <= player.skills.size() && skillMenu != 0) {
                            player.attack(enemy, skillMenu);
                            enemy.attack(player, (int)(Math.random() * 3) + 1);
                            break;
                        } else {
                            System.out.println("옳바르지 않은 스킬선택 입니다");
                        }
                    }
                } else if (menu == 2) {
                    player.performFly();
                    System.out.println("현재 포켓몬으로부터 도망칩니다!");
                    produceEnemy();
                } else if (menu == 3) {
                    System.out.println("회복물약을 사용합니다. +HP30");
                    Supplier<Integer> healPotion = () -> 30;
                    player.setHp(player.getHp() + healPotion.get());

                    System.out.println(player.name + "의 체력은 " + player.getHp());
                } else if (menu == 4) {
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
    private static void produceEnemy() {
        //적 포켓몬 랜덤 생성
        System.out.println("야생 포켓몬이 나타났습니다!");
        int enemyPick = (int)(Math.random()*3);
        enemy = switch (enemyPick) {
            case 0 -> new Pikachu(new NoFly());
            case 1 -> new Squirtle(new NoFly());
            default -> new Charizard(new Wings());
        };
    }
}