public class Main {
    public static void main(String[] args) {

        Warrior test = new Warrior ("John");
        Wizard test2 = new Wizard("wizard");
        System.out.println("Intelligence: " + test2.getIntelligence());
        //System.out.println();
        System.out.println("initial hp: " + test.getHp());
        test2.attack(test);

        System.out.println("remaining hp: " + test.getHp());


    }
}