import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Battle {

    public static int tryCatch(){
        Scanner scanner = new Scanner(System.in);
        boolean inputIsCorrect = false;
        int result = 0;
        while(!inputIsCorrect ){
            try{
                result = Integer.parseInt(scanner.nextLine());
                inputIsCorrect= true;
            } catch (NumberFormatException e){

            }
        }
        return result;
    }
    public static void battleByInput() throws IOException {
        System.out.println("Welcome to IronBattle");
        System.out.println("Type your Battle Style:");
        System.out.println("1 Random Battle Players");
        System.out.println("2 Customize your Battle");
        Scanner input = new Scanner(System.in);

        boolean inputIsCorrect = false;
        boolean inputControlled = false;
        boolean inputControlled1 = false;
        boolean inputControlled2 = false;
        int selection = 0;
        int choose = 0;
        int choose1 = 0;
        int choose2 = 0;
        int choose3 = 0;

        while (!inputIsCorrect) {

            try {
                selection = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                input.nextLine();
            }

            switch (selection) {
                case 1:
                    inputIsCorrect = true;
                    Battle.randomBattleStart();
                    break;
                case 2:
                    inputIsCorrect = true;
                    System.out.println("Choose 1 for random stats or choose 2 to customize your stats");
                        choose = tryCatch();

                    switch (choose) {
                        case 1:
                            System.out.println("You chose random stats");
                            System.out.println("Choose first player Clan");
                            System.out.println("Choose: 1 -> Warrior");
                            System.out.println("Choose: 2 -> Wizard");
                            choose1 = tryCatch();

                            switch (choose1) {
                                case 1:
                                    System.out.println("You chose Warrior!!");
                                    System.out.println("Type your name");
                                    String name = input.nextLine();
                                    Warrior newWarrior = new Warrior(name);
                                    System.out.println("Choose second player Clan");
                                    System.out.println("Choose: 1 -> Warrior");
                                    System.out.println("Choose: 2 -> Wizard");
                                    choose2 = tryCatch();
                                    switch (choose2) {
                                        case 1:
                                            System.out.println("You chose Warrior!!");
                                            System.out.println("Type your name");
                                            String name1 = input.nextLine();
                                            Warrior newWarrior1 = new Warrior(name1);
                                            Battle.battleStart(newWarrior, newWarrior1);
                                            break;
                                        case 2:
                                            System.out.println("You chose Wizard!!");
                                            System.out.println("Type your name");
                                            name1 = input.nextLine();
                                            Wizard newWizard = new Wizard(name1);
                                            Battle.battleStart(newWarrior, newWizard);
                                            break;
                                        default:
                                            System.out.println("No");
                                            //FINAL OPCIÓN UNO RANDOM
                                    }
                                    break;

                                case 2:
                                    System.out.println("You chose Wizard!!");
                                    System.out.println("Type your name");
                                    String name2 = input.nextLine();
                                    Wizard newWizard1 = new Wizard(name2);
                                    System.out.println("Choose second player Clan");
                                    System.out.println("Choose: 1 -> Warrior");
                                    System.out.println("Choose: 2 -> Wizard");
                                    choose3 = tryCatch();
                                    switch (choose3) {
                                        case 1:
                                            System.out.println("You chose Warrior!!");
                                            System.out.println("Type your name");
                                            String name3 = input.nextLine();
                                            Warrior newWarrior2 = new Warrior(name3);
                                            Battle.battleStart(newWizard1, newWarrior2);
                                        case 2:
                                            System.out.println("You chose Wizard!!");
                                            System.out.println("Type your name");
                                            String name4 = input.nextLine();
                                            Wizard newWizard3 = new Wizard(name4);
                                            Battle.battleStart(newWizard1, newWizard3);
                                            //Final random camino wizard
                                    }
                            }
                            break;
                        case 2:
                            System.out.println("You chose Custom Battle");
                            System.out.println("Choose first player Clan");
                            System.out.println("Choose: 1 -> Warrior");
                            System.out.println("Choose: 2 -> Wizard");
                            choose1 = tryCatch();
                            switch (choose1) {
                                case 1:
                                    Warrior newWarrior = new Warrior("name");
                                    System.out.println("You chose Warrior!!");
                                    while(!inputControlled){
                                        try{
                                    System.out.println("Type your name");
                                    newWarrior.setName(input.nextLine());
                                    System.out.println("Type your HP between 100-200");
                                    newWarrior.setHpInput(Integer.parseInt(input.nextLine()));
                                    System.out.println("Type your Stamina between 10-50");
                                    newWarrior.setStaminaInput(Integer.parseInt(input.nextLine()));
                                    System.out.println("Type your Strength between 1-10");
                                    newWarrior.setStrengthInput(Integer.parseInt(input.nextLine()));
                                    System.out.println("Choose second player Clan");
                                    System.out.println("Choose: 1 -> Warrior");
                                    System.out.println("Choose: 2 -> Wizard");
                                    choose2 = Integer.parseInt(input.nextLine());
                                    inputControlled= true;
                                        }catch(IllegalArgumentException e){
                                            System.err.println(e.getMessage() +"\n" +
                                            "Introduce your character information again.");

                                        }
                                    }
                                    switch (choose2) {

                                        case 1:
                                            Warrior newWarrior1 = new Warrior("name");
                                            System.out.println("You chose Warrior!!");
                                            while(!inputControlled1){
                                                try{
                                            System.out.println("Type your name");
                                            newWarrior1.setName(input.nextLine());
                                            System.out.println("Type your HP between 100-200");
                                            newWarrior1.setHpInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Stamina between 10-50");
                                            newWarrior1.setStaminaInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Strength between 1-10");
                                            newWarrior1.setStrengthInput(Integer.parseInt(input.nextLine()));
                                            Battle.battleStart(newWarrior, newWarrior1);
                                            inputControlled1= true;
                                            break;
                                                }catch(IllegalArgumentException e){
                                                    System.err.println(e.getMessage() +"\n" +
                                                            "Introduce your character information again.");

                                                }
                                            }

                                        case 2:

                                            Wizard newWizard = new Wizard("name");
                                            System.out.println("You chose Wizard!!");
                                            while(!inputControlled2){
                                                try{
                                            System.out.println("Type your name");
                                            newWizard.setName(input.nextLine());
                                            System.out.println("Type your HP between 50-100");
                                            newWizard.setHpInput2(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Mana between 10-50");
                                            newWizard.setManaInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Intelligence between 1-50");
                                            newWizard.setIntelligenceInput(Integer.parseInt(input.nextLine()));
                                            Battle.battleStart(newWarrior, newWizard);
                                            inputControlled2= true;
                                            break;
                                                }catch(IllegalArgumentException e){
                                                    System.err.println(e.getMessage() +"\n" +
                                                            "Introduce your character information again.");

                                                }
                                            }

                                        default:
                                            System.out.println("");

                                    }
                                    break;
                                case 2:
                                    Wizard newWizard1 = new Wizard("name");
                                    System.out.println("You chose Wizard!!");
                                    while(!inputControlled2) {
                                        try {
                                            System.out.println("Type your name");
                                            newWizard1.setName( input.nextLine());
                                            System.out.println("Type your HP between 50-100");
                                            newWizard1.setHpInput2(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Mana between 10-50");
                                            newWizard1.setManaInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Intelligence between 1-50");
                                            newWizard1.setIntelligenceInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Choose second player Clan");
                                            System.out.println("Choose: 1 -> Warrior");
                                            System.out.println("Choose: 2 -> Wizard");
                                            inputControlled2= true;
                                        } catch (IllegalArgumentException e) {
                                            System.err.println(e.getMessage() + "\n" +
                                                    "Introduce your character information again.");

                                        }
                                    }
                                    choose3 = tryCatch();
                                    switch (choose3) {
                                        case 1:
                                            Warrior newWarrior4 = new Warrior("name");
                                            System.out.println("You chose Warrior!!");
                                            while(!inputControlled2){
                                                try{
                                            System.out.println("Type your name");
                                            newWarrior4.setName(input.nextLine());
                                            System.out.println("Type your HP between 100-200");
                                            newWarrior4.setHpInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Stamina between 10-50");
                                            newWarrior4.setStaminaInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Strength between 1-10");
                                            newWarrior4.setStrengthInput(Integer.parseInt(input.nextLine()));
                                            Battle.battleStart(newWizard1, newWarrior4);
                                            inputControlled2= true;
                                            break;

                                                }catch(IllegalArgumentException e){
                                                    System.err.println(e.getMessage() +"\n" +
                                                            "Introduce your character information again.");

                                                }
                                            }
                                        case 2:
                                            Wizard newWizard3 = new Wizard("name");
                                            System.out.println("You chose Wizard!!");
                                            while(!inputControlled2) {
                                                try {
                                            System.out.println("Type your name");
                                            newWizard3.setName(input.nextLine());
                                            System.out.println("Type your HP between 50-100");
                                            newWizard3.setHp(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Mana between 10-50");
                                            newWizard3.setManaInput(Integer.parseInt(input.nextLine()));
                                            System.out.println("Type your Intelligence between 1-50");
                                            newWizard3.setIntelligenceInput(Integer.parseInt(input.nextLine()));
                                            Battle.battleStart(newWizard1, newWizard3);
                                            inputControlled2= true;
                                            break;

                                                } catch (IllegalArgumentException e) {
                                                    System.err.println(e.getMessage() + "\n" +
                                                            "Introduce your character information again.");

                                                }
                                            }


                                        default:
                                            System.out.println("no3");

                                            //final

                                    }
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

       if (characterList.get(0) instanceof Wizard && characterList.get(1) instanceof Wizard ){
           battleStart((Wizard) characterList.get(0), (Wizard) characterList.get(1));
       } else if (characterList.get(0) instanceof Wizard && characterList.get(1) instanceof Warrior) {
           battleStart((Wizard) characterList.get(0), (Warrior) characterList.get(1));
       } else if (characterList.get(0) instanceof Warrior && characterList.get(1) instanceof Wizard) {
           battleStart((Warrior) characterList.get(0), (Wizard) characterList.get(1));
       } else if (characterList.get(0) instanceof Warrior && characterList.get(1) instanceof Warrior) {
           battleStart((Warrior) characterList.get(0), (Warrior) characterList.get(1));
       }



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
