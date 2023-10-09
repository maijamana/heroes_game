package lotr;

import kick.Cry;
// import lombok.ToString;

public class Hobbit extends Character {
    
    public Hobbit() {
        super(3, 0, new Cry());
    }

    @Override
    public void kick(Character opponent) {
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }
}

