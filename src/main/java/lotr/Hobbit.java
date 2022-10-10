package lotr;
import kick.CryKick;

public class Hobbit extends lotr.Character{

    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character c) {
        System.out.println("Crying...");
    }
}
