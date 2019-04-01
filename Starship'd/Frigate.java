import java.util.Random;
public class Frigate extends Starship implements Defense{


    public Frigate(String newName){

        name = newName;

        Random rand = new Random();

        hull = 1500 + (rand.nextInt(500)+1);
        shield = 2000 + (rand.nextInt(500)+1);
        beam = 2500 + (rand.nextInt(1000)+1);
        torp = 20 + (rand.nextInt(10)+1);

        System.out.printf("%s:\tHull: %d\tShields: %d\tBeam Weapons: %d\tTorpedoes: %d", newName,hull,shield,beam,torp);
        System.out.println();

    }
}
