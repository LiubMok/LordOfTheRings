package lotr;


import java.util.Random;

public class King extends Noble{
    private  static final Random randomGenerator = new Random();
    public King(){
        super(5, 15);
    }

    @Override
    public void kick( lotr.Character whoKicked) {
        whoKicked.setHp(whoKicked.getHp() - randomGenerator.nextInt(this.getPower()));
    }
}
