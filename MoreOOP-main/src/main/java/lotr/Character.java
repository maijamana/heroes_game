package lotr;

import lombok.Setter;
// import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import kick.KickStrategy;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    int hp;
    private int power;
    private KickStrategy kickStrategy;
    public abstract void kick(Character opponent);

    public boolean isAlive() {
        return hp > 0;
    }
    
    public void setHp(int hp) {
        if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "{"
                + "hp=" + hp
                + ", power=" + power
                + "}";
    }
    
}       
