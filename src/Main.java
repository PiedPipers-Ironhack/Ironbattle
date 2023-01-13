public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Warrior warrior1 = new Warrior ("John");
        Wizard wizard1 = new Wizard("Voldemort");
        System.out.println(warrior1.getName());
        System.out.println(warrior1.getHp());

        System.out.println(wizard1.getName());
        System.out.println(wizard1.getHp());
    }
}