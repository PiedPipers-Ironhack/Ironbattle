import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Warrior test = new Warrior("John");
        //Warrior test1 = new Warrior("Warrior");
        Wizard test2 = new Wizard("Voldemort");
        Battle.battleStart(test,test2);
/*        FileWriter writer = new FileWriter("battlelog.txt", false);

        System.out.println("Intelligence: " + test2.getIntelligence());
        System.out.println("initial hp defense: " + test.getHp());
        //System.out.println("initial hp attacker: " + test.getHp());
        //System.out.println("attacker strength: " + test.getStrength());
        //System.out.println("attacker stamina: " + test.getStamina());
        System.out.println("attacker mana: " + test2.getMana());
        //test2.attack(test);

        writer.write((test2.toString()) + "\n");
        writer.write(test.toString() + "\n");
        //fix bug
        writer.write(test2.attack(test) + "\n");
        writer.close();
        System.out.println("attacker remaining mana: " + test2.getMana());
        //System.out.println("attacker remaining stamina: " + test.getStamina());
        System.out.println("remaining hp defense: " + test.getHp());*/
      }
    }