package Pokemonster;

import fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pikachu extends Pokemon {
    public Pikachu(Flyable f) {
        System.out.println("피카츄~!");
        this.level = 1;
        this.attackRate = (int)(Math.random() * 6) + 50;
        this.defenseRate = 40;
        this.hp = 35;
        this.name = "피카츄";
        this.flyable = f;

        this.skills = new HashMap<>(Map.of(1, "10만 볼트", 2,  "전기쇼크", 3, "볼부비부비"));
        this.specialAttackRate = new HashMap<>(Map.of("10만 볼트", 90, "전기쇼크", 40, "볼부비부비", 20));
    }
    public void type(){
        System.out.println(this.name + " 은(는) 전기 속성!");
    }
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 100만 볼트 공격 시전!");
    }
}
