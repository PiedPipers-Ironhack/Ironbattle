import java.io.FileWriter;
import java.io.IOException;

public class Battle {
    public static void battleStart(Wizard attacker, Wizard defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);
        while (defense.isAlive() && attacker.isAlive()) {
            writer.write((attacker.toString()) + "\n");
            writer.write(defense.toString() + "\n");
            writer.write(attacker.attack(defense) + "\n");

            writer.write((defense.toString()) + "\n");
            writer.write(attacker.toString() + "\n");
            writer.write(defense.attack(attacker) + "\n");

            if(defense.getHp() <= 0){
                defense.setAlive(false);
                defense.setHpInAttack(0);
                writer.write( attacker.getName() + " has Won!!\n");

            }
            if(attacker.getHp() <= 0){
                attacker.setAlive(false);
                attacker.setHpInAttack(0);
                writer.write( defense.getName() + " has Won!!\n");

            }
        }
        writer.close();

    }
    public static void battleStart(Wizard attacker, Warrior defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);
        while (defense.isAlive() && attacker.isAlive()) {

            writer.write((attacker.toString()) + "\n");
            writer.write(defense.toString() + "\n");
            writer.write(attacker.attack(defense) + "\n");

            writer.write((defense.toString()) + "\n");
            writer.write(attacker.toString() + "\n");
            writer.write(defense.attack(attacker) + "\n");


            if(defense.getHp() <= 0){
                defense.setAlive(false);
                defense.setHpInAttack(0);
                writer.write( attacker.getName() + " has Won!!\n");

            }
            if(attacker.getHp() <= 0){
                attacker.setAlive(false);
                attacker.setHpInAttack(0);
                writer.write( defense.getName() + " has Won!!\n");

            }
        }
        writer.close();

    }
    public static void battleStart(Warrior attacker, Wizard defense) throws IOException {

        FileWriter writer = new FileWriter("battlelog.txt", false);

        while (defense.isAlive() && attacker.isAlive()) {

            writer.write((attacker.toString()) + "\n");
            writer.write(defense.toString() + "\n");
            writer.write(attacker.attack(defense) + "\n");

            writer.write((defense.toString()) + "\n");
            writer.write(attacker.toString() + "\n");
            writer.write(defense.attack(attacker) + "\n");

            if(defense.getHp() <= 0){
                defense.setAlive(false);
                defense.setHpInAttack(0);
                writer.write( attacker.getName() + " has Won!!\n");

            }
            if(attacker.getHp() <= 0){
                attacker.setAlive(false);
                attacker.setHpInAttack(0);
                writer.write( defense.getName() + " has Won!!\n");

            }
        }
        writer.close();

    }
    public static void battleStart(Warrior attacker, Warrior defense) throws IOException {


            FileWriter writer = new FileWriter("battlelog.txt", false);

            while (defense.isAlive() && attacker.isAlive()) {

                    writer.write((attacker.toString()) + "\n");
                    writer.write(defense.toString() + "\n");
                    writer.write(attacker.attack(defense) + "\n");

                    writer.write((defense.toString()) + "\n");
                    writer.write(attacker.toString() + "\n");
                    writer.write(defense.attack(attacker) + "\n");

                if(defense.getHp() <= 0){
                    defense.setAlive(false);
                    defense.setHpInAttack(0);
                    writer.write( attacker.getName() + " has Won!!\n");

                }
                if(attacker.getHp() <= 0){
                    attacker.setAlive(false);
                    attacker.setHpInAttack(0);
                    writer.write( defense.getName() + " has Won!!\n");

                }
            }

        writer.close();

    }
}
