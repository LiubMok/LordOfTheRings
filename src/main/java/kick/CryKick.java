package kick;

public class CryKick implements BasicKick{
    @Override
    public void kick(lotr.Character whoKick, lotr.Character whoKicked) {
        System.out.println("Crying...");
    }
}
