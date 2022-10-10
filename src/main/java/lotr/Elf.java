package lotr;
import lotr.Character;
import kick.BasicKick;
import kick.ElfKick;

public class Elf extends Character{

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character  whoKicked) {

        if (this.getPower() > whoKicked.getPower()){
            whoKicked.setHp(0);
        }
        else
        {
            whoKicked.setPower(whoKicked.getPower() - 1);
        }
    }
}
