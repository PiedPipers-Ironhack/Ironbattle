import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Battle {

    public static void battleByInput() throws IOException {
        System.out.println("Welcome to IronBattle");
        System.out.println("Type your Battle Style:");
        System.out.println("1 Random Battle Players");
        System.out.println("2 Customize your Battle");
        Scanner input = new Scanner(System.in);
        Integer selection = Integer.parseInt(input.nextLine());
        if (selection == 1){
            Battle.randomBattleStart();
        } else if (selection == 2) {
            System.out.println("Choose 1 for random stats or choose 2 to customize your stats");
            Integer choose = Integer.parseInt(input.nextLine());
            if(choose == 1){
                System.out.println("You chose random stats");
                System.out.println("Choose first player Clan");
                System.out.println("Choose: 1 -> Warrior");
                System.out.println("Choose: 2 -> Wizard");
                Integer choose1 = Integer.parseInt(input.nextLine());
                if(choose1 == 1){
                    System.out.println("You chose Warrior!!");
                    System.out.println("Type your name");
                    String name = input.nextLine();
                    Warrior newWarrior = new Warrior(name);
                    System.out.println("Choose second player Clan");
                    System.out.println("Choose: 1 -> Warrior");
                    System.out.println("Choose: 2 -> Wizard");
                    Integer choose2 = Integer.parseInt(input.nextLine());
                    if (choose2 == 1){
                        System.out.println("You chose Warrior!!");
                        System.out.println("Type your name");
                        String name1 = input.nextLine();
                        Warrior newWarrior1 = new Warrior(name1);
                        Battle.battleStart(newWarrior, newWarrior1);

                    } else if( choose2 == 2){
                        System.out.println("You chose Wizard!!");
                        System.out.println("Type your name");
                        String name1 = input.nextLine();
                        Wizard newWizard = new Wizard(name1);
                        Battle.battleStart(newWarrior, newWizard);
                    }


                } else if (choose1 == 2){
                    System.out.println("You chose Wizard!!");
                    System.out.println("Type your name");
                    String name2 = input.nextLine();
                    Wizard newWizard1 = new Wizard(name2);
                    System.out.println("Choose second player Clan");
                    System.out.println("Choose: 1 -> Warrior");
                    System.out.println("Choose: 2 -> Wizard");
                    Integer choose3 = Integer.parseInt(input.nextLine());

                    if (choose3 == 1){
                        System.out.println("You chose Warrior!!");
                        System.out.println("Type your name");
                        String name3 = input.nextLine();
                        Warrior newWarrior2 = new Warrior(name3);
                        Battle.battleStart(newWizard1, newWarrior2);
                    } else if (choose3 == 2){
                        System.out.println("You chose Wizard!!");
                        System.out.println("Type your name");
                        String name4 = input.nextLine();
                        Wizard newWizard3 = new Wizard(name4);
                        Battle.battleStart(newWizard1, newWizard3);
                    }
                }

            } else if (choose ==2){
                System.out.println("You chose Custom Battle");
                System.out.println("Choose first player Clan");
                System.out.println("Choose: 1 -> Warrior");
                System.out.println("Choose: 2 -> Wizard");
                Integer choose1 = Integer.parseInt(input.nextLine());
                if(choose1 == 1){
                    System.out.println("You chose Warrior!!");
                    System.out.println("Type your name");
                    String name = input.nextLine();
                    System.out.println("Type your HP between 100-200");
                    Integer hp = Integer.parseInt(input.nextLine());
                    System.out.println("Type your Stamina between 10-50");
                    Integer stamina = Integer.parseInt(input.nextLine());
                    System.out.println("Type your Strength between 1-10");
                    Integer strength = Integer.parseInt(input.nextLine());
                    Warrior newWarrior = new Warrior(name, hp, stamina, strength);
                    System.out.println("Choose second player Clan");
                    System.out.println("Choose: 1 -> Warrior");
                    System.out.println("Choose: 2 -> Wizard");
                    Integer choose2 = Integer.parseInt(input.nextLine());
                    if (choose2 == 1){
                        System.out.println("You chose Warrior!!");
                        System.out.println("Type your name");
                        String name1 = input.nextLine();
                        System.out.println("Type your HP between 100-200");
                        Integer hp1 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Stamina between 10-50");
                        Integer stamina1 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Strength between 1-10");
                        Integer strength1 = Integer.parseInt(input.nextLine());
                        Warrior newWarrior1 = new Warrior(name1, hp1, stamina1, strength1);
                        Battle.battleStart(newWarrior, newWarrior1);

                    } else if( choose2 == 2){
                        System.out.println("You chose Wizard!!");
                        System.out.println("Type your name");
                        String name1 = input.nextLine();
                        System.out.println("Type your HP between 50-100");
                        Integer hp2 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Mana between 10-50");
                        Integer stamina2 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Intelligence between 1-50");
                        Integer intelligence2 = Integer.parseInt(input.nextLine());
                        Wizard newWizard = new Wizard(name1, hp2, stamina2, intelligence2);
                        Battle.battleStart(newWarrior, newWizard);
                    }


                } else if (choose1 == 2){
                    System.out.println("You chose Wizard!!");
                    System.out.println("Type your name");
                    String name2 = input.nextLine();
                    System.out.println("Type your HP between 50-100");
                    Integer hp3 = Integer.parseInt(input.nextLine());
                    System.out.println("Type your Mana between 10-50");
                    Integer stamina3 = Integer.parseInt(input.nextLine());
                    System.out.println("Type your Intelligence between 1-50");
                    Integer intelligence3 = Integer.parseInt(input.nextLine());
                    Wizard newWizard1 = new Wizard(name2, hp3, stamina3, intelligence3);
                    System.out.println("Choose second player Clan");
                    System.out.println("Choose: 1 -> Warrior");
                    System.out.println("Choose: 2 -> Wizard");
                    Integer choose3 = Integer.parseInt(input.nextLine());

                    if (choose3 == 1){
                        System.out.println("You chose Warrior!!");
                        System.out.println("Type your name");
                        String name3 = input.nextLine();
                        System.out.println("Type your HP between 100-200");
                        Integer hp4 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Stamina between 10-50");
                        Integer stamina4 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Strength between 1-10");
                        Integer strength4 = Integer.parseInt(input.nextLine());
                        Warrior newWarrior4 = new Warrior(name3, hp4, stamina4, strength4);
                        Battle.battleStart(newWizard1, newWarrior4);
                    } else if (choose3 == 2){
                        System.out.println("You chose Wizard!!");
                        System.out.println("Type your name");
                        String name4 = input.nextLine();
                        System.out.println("Type your HP between 50-100");
                        Integer hp5 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Mana between 10-50");
                        Integer stamina5 = Integer.parseInt(input.nextLine());
                        System.out.println("Type your Intelligence between 1-50");
                        Integer intelligence5 = Integer.parseInt(input.nextLine());
                        Wizard newWizard3 = new Wizard(name4, hp5, stamina5, intelligence5);
                        Battle.battleStart(newWizard1, newWizard3);
                    }
                }
            }
        }
    }
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
