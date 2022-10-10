package lotr;
import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    protected int hp;
    @Getter@Setter
    protected int power;


    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    public boolean isAlive(){
        return this.hp > 0;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

    public abstract void kick(Character c);
}
