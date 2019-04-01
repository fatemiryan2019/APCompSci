import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        System.out.println("Available fleet:");

        ArrayList<Starship> fleet = new ArrayList<Starship>();

//        Names of the sample cruisers, abbreviated by three letters
        
        String registry[] = new String[]{"Rel.", "Ent.", "Yor.", "Sar.", "Voy.", "Dis.", "Consti.", "Conste.", "Gri.", "Def.", "Int.", "Bri.", "Sta.", "Yam.", "Iow.", "Gal.", "Amb.", "Nim.", "Equ.", "Rel."};

        for (int i = 10; i < 15; i++) {
            fleet.add(new Cruiser(registry[i]));
        }
        for (int i = 15; i < 20; i++) {
            fleet.add(new Battleship(registry[i]));
        }
        for (int i = 0; i < 5; i++) {
            fleet.add(new Escort(registry[i]));
        }
        for (int i = 5; i < 10; i++) {
            fleet.add(new Frigate(registry[i]));
        }


        System.out.println(fleet.size());
        
        }

    }
