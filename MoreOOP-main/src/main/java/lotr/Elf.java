package lotr;

import kick.Cry;
// import lombok.ToString;

public class Elf extends Character {
    
    public Elf() {
        super(10, 10, new Cry());
    }

    @Override
    public void kick(Character opponent) {
        int opponentPower = opponent.getPower();
        int thisPower = this.getPower();
    
        if (opponentPower < thisPower) {
            opponent.setHp(0);
        } else {
            opponent.setPower(opponentPower - 1);
        }
    }
}


