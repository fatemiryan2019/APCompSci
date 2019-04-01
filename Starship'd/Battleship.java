import java.util.Random;
public class Battleship extends Starship implements Offense{

    public Battleship(String newName){

        name = newName;
        Random rand = new Random();

        hull = 3000 + (rand.nextInt(2000)+1);
        shield = 1500 + (rand.nextInt(500)+1);
        beam = 4000 + (rand.nextInt(1000)+1);
        torp = 40 + (rand.nextInt(10)+1);

        System.out.printf("%s:\tHull: %d\tShields: %d\tBeam Weapons: %d\tTorpedoes: %d", newName,hull,shield,beam,torp);
        System.out.println();

    }

}
