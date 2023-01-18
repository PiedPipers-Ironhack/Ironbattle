import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Welcome to IronBattle");
        System.out.println("Choose battle style, 1 --> Random Battle, 2 --> Select Player");
        int selection = Integer.parseInt(input.nextLine());*/

        //Warrior newWarrior = new Warrior("prueba", 23, 400, 1000);
        //Warrior test = new Warrior("John Attacker");
        //Warrior test1 = new Warrior("Defense Warrior");
        //Wizard test2 = new Wizard("Voldemort");
        //Battle.battleStart(test,test2);
        //System.out.println(test1.getHp());
        //Battle.randomBattleStart();
        System.out.println("Welcome to IronBattle");
        System.out.println("Type your battle style");
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
            }
        }

    }
    }