import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Warrior test = new Warrior("John Attacker");
        Warrior test1 = new Warrior("Defense Warrior");
        Wizard test2 = new Wizard("Voldemort");
        Battle.battleStart(test,test1);


      }
    }