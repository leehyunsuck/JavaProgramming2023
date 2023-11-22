package Pokemonster;

import fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;

public class Pikachu extends Pokemon {
    public Pikachu(Flyable f) {
        System.out.println("피카츄~!");
        this.level = 1;
        this.attackRate = (int)(Math.random() * 6) + 50;
        this.defenseRate = 40;
        this.hp = 35;
        this.name = "피카츄";
        this.flyable = f;
        this.skills = new ArrayList<>(Arrays.asList("10만 볼트", "전기쇼크", "볼부비부비"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(90, 40, 20));
    }
    public void type(){
        System.out.println(this.name + " 은(는) 전기 속성!");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 100만 볼트 공격 시전!");
    }
}
