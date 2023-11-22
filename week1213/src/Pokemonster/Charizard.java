package Pokemonster;

import fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;

public class Charizard extends Pokemon {
    public Charizard(Flyable f) {
        System.out.println("리이~자몽!");
        this.level = 36;
        this.attackRate = (int)(Math.random() * 11) + 74;
        this.defenseRate = 78;
        this.hp = 78;
        this.name = "리자몽";
        this.flyable = f;
        this.skills = new ArrayList<>(Arrays.asList("화염방사", "용의숨결", "할퀴기"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(90, 60, 40));
    }

    public Charizard(int level, int hp, String name) {
        super(level, hp, name);
        System.out.println("자식 클래스(리자몽)의 매개변수 생성자 (생성자 오버로딩)");
    }

    @Override
    public void attack(){
        System.out.println(this.name + " 이(가) 플레어드라이브 공격 시전!");
    }
    public void type(){
        System.out.println(this.name + " 은(는) 화염 속성!");
    }
}
