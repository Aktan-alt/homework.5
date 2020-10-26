package com.company;

import com.company.rpg.boss;
import com.company.rpg.hero;

public class Main {

    public static void main(String[] args) {
        boss boss = new boss("Krasava", 1000, 70, "Physical","YOur soul is mine!!!!");
        System.out.println("Name: " + boss.Name + " Health:" + boss.health + " Boss damage:" + boss.bossDamage +
                " Boss attack type:" + boss.bossAttackType + " Battle cry:" + boss.battleCry);


        hero hero = new hero();
        hero.setName("Fox");
        hero.setHealth(200);
        hero.setHeroDamage(45);
        hero.setHerAttackType("Magic");
        hero.setBattleCry("Vengeance will be mine");
        System.out.println("Name: " + hero.getName() + " Health:" + hero.getHealth() + " Hero Damage: " + hero.getHeroDamage()
         + " Hero attack type:" + hero.getHerAttackType() + " Battle cry:" + hero.getBattleCry());

        }

    }
