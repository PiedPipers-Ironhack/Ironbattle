import java.io.FileWriter;
import java.io.IOException;

public class Battle {
    public static void battleStart(Wizard attacker, Wizard defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);
        //System.out.println("Intelligence: " + defense.getIntelligence());
        //System.out.println("initial hp defense: " + attacker.getHp());
        //System.out.println("initial hp attacker: " + test.getHp());
        //System.out.println("attacker strength: " + test.getStrength());
        //System.out.println("attacker stamina: " + test.getStamina());
        //System.out.println("attacker mana: " + test2.getMana());
        //test2.attack(test);
        writer.write((attacker.toString()) + "\n");
        writer.write(defense.toString() + "\n");
        writer.write(attacker.attack(defense)+ "\n");
        writer.close();
        //System.out.println("attacker remaining mana: " + test2.getMana());
        //System.out.println("attacker remaining stamina: " + test.getStamina());
        //System.out.println("remaining hp defense: " + test.getHp());


    }
    public static void battleStart(Wizard attacker, Warrior defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);
        //System.out.println("Intelligence: " + defense.getIntelligence());
        //System.out.println("initial hp defense: " + attacker.getHp());
        //System.out.println("initial hp attacker: " + test.getHp());
        //System.out.println("attacker strength: " + test.getStrength());
        //System.out.println("attacker stamina: " + test.getStamina());
        //System.out.println("attacker mana: " + test2.getMana());
        //test2.attack(test);
        writer.write((attacker.toString()) + "\n");
        writer.write(defense.toString() + "\n");
        writer.write(attacker.attack(defense)+ "\n");
        writer.close();
        //System.out.println("attacker remaining mana: " + test2.getMana());
        //System.out.println("attacker remaining stamina: " + test.getStamina());
        //System.out.println("remaining hp defense: " + test.getHp());


    }
    public static void battleStart(Warrior attacker, Wizard defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);
        //System.out.println("Intelligence: " + defense.getIntelligence());
        //System.out.println("initial hp defense: " + attacker.getHp());
        //System.out.println("initial hp attacker: " + test.getHp());
        //System.out.println("attacker strength: " + test.getStrength());
        //System.out.println("attacker stamina: " + test.getStamina());
        //System.out.println("attacker mana: " + test2.getMana());
        //test2.attack(test);
        writer.write((attacker.toString()) + "\n");
        writer.write(defense.toString() + "\n");
        writer.write(attacker.attack(defense)+ "\n");
        writer.close();
        //System.out.println("attacker remaining mana: " + test2.getMana());
        //System.out.println("attacker remaining stamina: " + test.getStamina());
        //System.out.println("remaining hp defense: " + test.getHp());


    }
    public static void battleStart(Warrior attacker, Warrior defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);
        //System.out.println("Intelligence: " + defense.getIntelligence());
        //System.out.println("initial hp defense: " + attacker.getHp());
        //System.out.println("initial hp attacker: " + test.getHp());
        //System.out.println("attacker strength: " + test.getStrength());
        //System.out.println("attacker stamina: " + test.getStamina());
        //System.out.println("attacker mana: " + test2.getMana());
        //test2.attack(test);
        writer.write((attacker.toString()) + "\n");
        writer.write(defense.toString() + "\n");
        writer.write(attacker.attack(defense)+ "\n");
        writer.close();
        //System.out.println("attacker remaining mana: " + test2.getMana());
        //System.out.println("attacker remaining stamina: " + test.getStamina());
        //System.out.println("remaining hp defense: " + test.getHp());


    }
}
