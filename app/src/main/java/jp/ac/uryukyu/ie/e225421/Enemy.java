package jp.ac.uryukyu.ie.e225421;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    // private String name;
    // private int hitPoint;
    // private int attack;
    // private boolean dead;

    // public String getName(){
    //     return this.name;
    // }
    // public int getHitPoint(){
    //     return hitPoint;
    // }
    // public int getAttack(){
    //     return this.attack;
    // }
    // public boolean getDead(){
    //     return dead;
    // }
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    // public void setEnemy(String _name, int _hitpoint, int _attack){
    //     this.name=_name;
    //     this.hitPoint=_hitpoint;
    //     this.attack=_attack;
    // }
    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    // public void attack(Hero hero){
    //     if (dead == false){
    //         int damage = (int)(Math.random() * attack);
    //         System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
    //         hero.wounded(damage);
    //     }
    // }
    
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        super.wounded(damage);
        System.out.printf("モンスター%sは倒れた。\n", getName());
        
    }

}