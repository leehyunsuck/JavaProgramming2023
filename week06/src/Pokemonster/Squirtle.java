package Pokemonster;

import java.util.ArrayList;

public class Squirtle extends Pokemon {
    public Squirtle(Flyable f) {
        System.out.println("꼬북꼬북!");
        this.level = 1;
        this.attackRate = (int)(Math.random() * 4) + 45;
        this.defenseRate = 65;
        this.hp = 44;
        this.name = "꼬부기";
        this.flyable = f;
//        this.skills = new String[]{"하이드로펌프", "물의파동", "물대포"};
        this.skills.add("하이드로펌프");
        this.skills.add("물의 파동");
        this.skills.add("물대포");
//        this.specialAttackRate = new int[]{110, 60, 40};
        this.specialAttackRate.add(110);
        this.specialAttackRate.add(60);
        this.specialAttackRate.add(40);
    }

    public void type(){
        System.out.println(this.name + " 은(는) 물 속성!");
    }
    
    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 하이드로펌프 공격 시전!");
    }
}
