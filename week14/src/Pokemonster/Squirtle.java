package Pokemonster;

import fly.Flyable;

import java.util.HashMap;
import java.util.Map;

public class Squirtle extends Pokemon {
    public Squirtle(Flyable f) {
        System.out.println("꼬북꼬북!");
        this.level = 1;
        this.attackRate = (int)(Math.random() * 4) + 45;
        this.defenseRate = 65;
        this.hp = 44;
        this.name = "꼬부기";
        this.flyable = f;

        this.skills = new HashMap<>(Map.of(1, "하이드로펌프", 2, "물의 파동", 3, "물대포"));
        this.specialAttackRate = new HashMap<>(Map.of("하이드로펌프", 110, "물의 파동", 60, "물대포", 40));
    }

    public void type(){
        System.out.println(this.name + " 은(는) 물 속성!");
    }
    
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 하이드로펌프 공격 시전!");
    }
}
