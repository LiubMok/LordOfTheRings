package kick;

import lotr.Character;

public class ElfKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoKicked) {
        if (whoKick.getPower() > whoKicked.getPower()){
            whoKicked.setHp(0);
        }
        else
        {
            whoKicked.setPower(whoKicked.getPower() - 1);
        }
    }
}
