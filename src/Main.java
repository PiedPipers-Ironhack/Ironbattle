import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to IronBattle");
        System.out.println("Choose battle style, 1 --> Random Battle, 2 --> Select Player");
        int selection = Integer.parseInt(input.nextLine());


        Warrior test = new Warrior("John Attacker");
        Warrior test1 = new Warrior("Defense Warrior");
        Wizard test2 = new Wizard("Voldemort");
        Battle.battleStart(test,test1);
        System.out.println(test1.getHp());


      }
    }