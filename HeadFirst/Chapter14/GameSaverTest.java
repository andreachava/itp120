import java.io.*;

public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(50, "Harry Potter", "Half Blood", new String[] {"Invisibilty Cloak", "Hedwig", "cool scar thingy"});
        GameCharacter two = new GameCharacter(200, "Ronald Weasley", "Pure Blood", new String[] {"Scabbers", "Deluminator", "chess skills"});
        GameCharacter three = new GameCharacter(200, "Hermione Granger", "Muggleborn", new String[] {"being an insufferable know-it-all", "Crookshanks", "Time Turner"});
        GameCharacter[] game = {one, two, three};
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            for (GameCharacter i : game) {
                os.writeObject(i);
            }
            /*os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);*/
            os.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter o = (GameCharacter) is.readObject();
            GameCharacter t = (GameCharacter) is.readObject();
            GameCharacter th = (GameCharacter) is.readObject();

            System.out.println("Character One: " + o.getName() + ", " + o.getType() + ", " + o.getWeapons());
            System.out.println("Character Two: " + t.getName() + ", " + t.getType() + ", " + t.getWeapons());
            System.out.println("Character Three: " + th.getName() + ", " + th.getType() + ", " + th.getWeapons());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class GameCharacter implements Serializable {
    int power;
    String name;
    String type;
    String[] weapons;

    public GameCharacter(int p, String n, String t, String[] w) {
        power = p;
        name = n;
        type = t;
        weapons = w;
    }

    public int getPower() {
        return power;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getWeapons() {
        String weaponList = "";
        for (int i = 0; i < weapons.length + 1; i++) {
            
            if (i < weapons.length) {
                weaponList += weapons[i] + ", ";
            } else {
                weaponList = weaponList.substring(0, weaponList.length()-2);
                weaponList += ". ";
            }
            
        }
        return weaponList;
    }
}

