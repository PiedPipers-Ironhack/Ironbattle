import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Battle {

   public static void randomBattleStart() throws IOException {
       Wizard east = new Wizard("East");
       Wizard wood = new Wizard("Wood");
       Wizard wizardo = new Wizard("Wizardo");
       Wizard lee = new Wizard("Lee");
       Wizard orchestra = new Wizard("Orchestra");
       Wizard ping = new Wizard("Ping");
       Wizard pong = new Wizard("Pong");
       Wizard shawn = new Wizard("Shawn");
       Wizard pulp = new Wizard("Pulp");
       Wizard pol = new Wizard("Pol");
       Wizard summer = new Wizard("Summer");
       Warrior clint = new Warrior("CLint");
       Warrior paris = new Warrior("Paris");
       Warrior willow = new Warrior("Willow");
       Warrior aragon = new Warrior("Aragon");
       Warrior legolas = new Warrior("Legolas");
       Warrior jaden = new Warrior("Jaden");
       Warrior still = new Warrior("Still");
       Warrior last = new Warrior("Last");
       Warrior valse = new Warrior("Valse");
       Warrior pray = new Warrior("Pray");

       List<Character> characterList = new ArrayList<>();

       characterList.add(east);
       characterList.add(wood);
       characterList.add(wizardo);
       characterList.add(lee);
       characterList.add(orchestra);
       characterList.add(ping);
       characterList.add(pong);
       characterList.add(pulp);
       characterList.add(shawn);
       characterList.add(pol);
       characterList.add(summer);
       characterList.add(clint);
       characterList.add(paris);
       characterList.add(willow);
       characterList.add(aragon);
       characterList.add(legolas);
       characterList.add(jaden);
       characterList.add(still);
       characterList.add(last);
       characterList.add(valse);
       characterList.add(pray);

       Collections.shuffle(characterList);
       /*for (int i = 0; i< 2; i++){
           battleStart(characterList[i], characterList[i+1]);
       }*/
       if (characterList.get(0) instanceof Wizard && characterList.get(1) instanceof Wizard ){
           battleStart((Wizard) characterList.get(0), (Wizard) characterList.get(1));
       } else if (characterList.get(0) instanceof Wizard && characterList.get(1) instanceof Warrior) {
           battleStart((Wizard) characterList.get(0), (Warrior) characterList.get(1));
       } else if (characterList.get(0) instanceof Warrior && characterList.get(1) instanceof Wizard) {
           battleStart((Warrior) characterList.get(0), (Wizard) characterList.get(1));
       } else if (characterList.get(0) instanceof Warrior && characterList.get(1) instanceof Warrior) {
           battleStart((Warrior) characterList.get(0), (Warrior) characterList.get(1));
       }

       /*for (Character character : characterList){
           System.out.println(character);
       }*/

   }

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
            writer.write("Welcome to IronBattle" + "\n"); // No printing
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
                //pending tie result.
            }

        writer.close();

    }
}
