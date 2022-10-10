package lotr;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    @SneakyThrows
    public Character createCharacter(){
        Reflections reflections = new Reflections("lotr");

        Set<Class<?>> subTypes =
                reflections.get(SubTypes.of(Character.class).asClass());

        Class cls = (Class) subTypes.toArray()[new Random().nextInt(subTypes.size())];
        return (Character) cls.newInstance();
    }
}
