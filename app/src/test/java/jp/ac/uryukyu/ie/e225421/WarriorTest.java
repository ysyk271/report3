package jp.ac.uryukyu.ie.e225421;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {
    @Test
    void attackTest() {
        Warrior demoWarrior= new Warrior("デモ戦士", 100, 10);
        Warrior demoWarrior2= new Warrior("デモ戦士2", 100, 15);
        Enemy demoEnemy = new Enemy("デモスライム", 100, 0);
        Enemy demoEnemy2 = new Enemy("デモスライム2", 10, 10);
        //demoWarrior.attackWithWeponSkill(demoEnemy);
        demoWarrior.attackWithWeponSkill(demoEnemy);
        demoWarrior2.attackWithWeponSkill(demoEnemy);
        demoWarrior.attackWithWeponSkill(demoEnemy2);
        assertEquals((int)(demoWarrior.getAttack()*1.5), demoWarrior.getDamage());
        assertEquals((int)(demoWarrior2.getAttack()*1.5), demoWarrior2.getDamage());
        assertEquals((int)(demoWarrior.getAttack()*1.5), demoWarrior.getDamage());


    }
}
