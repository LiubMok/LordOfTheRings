package kick;
import lotr.Character;
import java.util.Random;

public class NobleKick implements BasicKick{
    private static final Random randomGenerator = new Random();

    @Override
    public void kick(lotr.Character whoKick, lotr.Character whoKicked) {
        whoKicked.setHp(whoKick.getHp() - randomGenerator.nextInt(whoKick.getPower()));
    }
}
