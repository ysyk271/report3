package jp.ac.uryukyu.ie.e225421;

public class Warrior extends Hero{
    private int damage;
    
    public int getDamage(){
        return damage;
    }
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if (isDead() == false){
            damage = (int)(getAttack()*1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    @Override
    public void wounded(int damage){
        super.wounded(damage);
    }
}
