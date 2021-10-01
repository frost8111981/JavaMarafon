package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero h) {
        double attackScore = physAttack * (1 - h.physDef );
        if(h.health - attackScore < MIN_HEALTH){
            h.health = MIN_HEALTH;
        } else {
            h.health -= attackScore;
        }
    }
}
