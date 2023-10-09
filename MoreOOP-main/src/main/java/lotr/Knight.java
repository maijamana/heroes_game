package lotr;

import java.util.Random;

import kick.KickStrategy;

public class Knight extends Character {
    private static KickStrategy kickStrategy;
    private int power;
    private int hp;
    

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Knight() {
        super(0, 0, kickStrategy);
        Random random = new Random();
        this.power = random.nextInt(3) + 5;
        this.hp = random.nextInt(3) + 10;
    }
    
    public void kick(Character opponent) {
        int enemyHp = opponent.getHp();
        int damage = Math.min(enemyHp, (int) (Math.random() * this.power) + 1);
        opponent.setHp(enemyHp - damage);
    }
}
