public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Warrior warrior1 = new Warrior ("John");
        Wizard wizard1 = new Wizard("Voldemort");
        System.out.println(warrior1.getName());
        System.out.println(warrior1.getHp());
        System.out.println(warrior1.getStamina());
        System.out.println(warrior1.getStrength());

        System.out.println(wizard1.getName());
        System.out.println(wizard1.getHp());
        System.out.println(wizard1.getMana());
        System.out.println(wizard1.getIntelligence());
    }
}