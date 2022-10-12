import lotr.CharacterFactory;

public class GameManager {
    public static void main(String[] args) {
        lotr.Character character1 = CharacterFactory.createCharacter();
        lotr.Character character2 = CharacterFactory.createCharacter();
        fight(character1, character2);
    }

    public static void fight(lotr.Character car1, lotr.Character car2) {
        int round = 1;
//      This variable is for String ClassName of the character
        String player1 = car1.getClass().getSimpleName();
        String player2 = car2.getClass().getSimpleName();
        System.out.println("----------------------------------");
        System.out.println("First player " + car1);
        System.out.println("Second player " + car2);

        if (car1 instanceof lotr.Hobbit && car2 instanceof lotr.Hobbit) {
            System.out.println("----------------------------------");
            System.out.println("Both players are Hobbits, they are disabled in fighting");
            return;
        } else if (car1 instanceof lotr.Elf && car2 instanceof lotr.Elf) {
            System.out.println("----------------------------------");
            System.out.println("Both players are Elfs, it is tense draw");
            return;
        }
        System.out.println("----------------------------------");
        System.out.println("Fight");
        while (true) {
            System.out.println("----------------------------------");
            System.out.println("Round " + round);
            System.out.println(player1 + " is kicking " + player2);
            car1.kick(car2);
            if (car2.isAlive()){
                System.out.println(player2 + " is kicking " + player1);
                car2.kick(car1);
                if(!car1.isAlive()) {
                    resultOfTheRound(car1, car2, round);
                    break;
                }
            }
            else {
                resultOfTheRound(car1, car2, round);
                break;
            }
            resultOfTheRound(car1, car2, round);
            round++;
        }
        System.out.println("----------------------------------");
        System.out.println("Result of the battle of the century:");
        if(car1.isAlive())
            System.out.println(player1 + " is the winner");
        else
            System.out.println(player2 + " is the winner");

    }
    private static void resultOfTheRound(lotr.Character c1, lotr.Character c2, int round){
        System.out.println("");
        System.out.println("Result of the Round " + round);
        System.out.println(c1);
        System.out.println(c2);
    }
}
