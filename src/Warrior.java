public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStamina(stamina);
        setStrength(strength);
    }
    public void setHp(int hp) {
        super.setHp(99 + (int) Math.ceil(Math.random() * 101));
    }
    public Warrior(String name) {
        super(name);
        setStamina(stamina);
        setStrength(strength);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = (int) (Math.random() * 40 + 10);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = (int) (Math.random() * 9 + 1);
    }

    @Override
    public void attack(Character character) {

    }
}
