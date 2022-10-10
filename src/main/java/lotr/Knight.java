package lotr;

import java.util.Random;

public class Knight extends Noble{

    public Knight(){
        super(2, 12);
    }

    private  static final Random randomGenerator = new Random();

    @Override
    public void kick( lotr.Character whoKicked) {
        whoKicked.setHp(whoKicked.getHp() - randomGenerator.nextInt(this.getPower()));
    }
}
