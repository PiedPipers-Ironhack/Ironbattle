import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido/a a IronBattle");

        // Creación del personaje
        System.out.print("Ingresa el nombre de tu personaje: ");
        String name = scanner.nextLine();
        Warrior warrior = new Warrior(name);
        System.out.println("Tu personaje ha sido creado: " + warrior);

        // Selección del enemigo
        System.out.println("Escoge a tu enemigo:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        int enemyChoice = scanner.nextInt();
        Character enemy;
        if (enemyChoice == 1) {
            enemy = new Warrior("Enemy Warrior");
        } else {
            enemy = new Wizard("Enemy Wizard");
        }
        System.out.println("Tu enemigo es: " + enemy);

        // Inicio de la batalla
        while (warrior.getHp() > 0 && enemy.getHp() > 0) {
            String attack = warrior.attack(enemy);
            System.out.println(attack);
            if (enemy.getHp() <= 0) {
                System.out.println("Tu personaje ha ganado la batalla!");
                break;
            }
            attack = ((Attacker) enemy).attack(warrior);
            System.out.println(attack);
            if (warrior.getHp() <= 0) {
                System.out.println("Tu personaje ha perdido la batalla.");
                break;

                //Warrior test = new Warrior("John");
                //Warrior test1 = new Warrior("Warrior");
               // Wizard test2 = new Wizard("Voldemort");
               // Battle.battleStart(test, test2);//
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
    }
}