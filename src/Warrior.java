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
    public void setStaminaInAttack(int stamina){
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = (int) (Math.random() * 9 + 1);
    }

    @Override
    public String toString() {
        return Warrior.super.toString() + ", character class: Warrior ," +
                "stamina: " + stamina +
                ", strength: " + strength + "\n";
    }

    @Override
    public void attack(Character character) {
        int random = (Math.random()<= 0.5)?1:2;
        System.out.println("random attack: " + random);
        if( random == 1){
            int resultHp = character.getHp() - this.strength;
            character.setHpInAttack(resultHp);
            setStaminaInAttack(this.stamina-5);
            System.out.println(getName() + " has attacked with a heavy attack");

        } else if(random == 2 || this.stamina < 5) {
            int resultHp = character.getHp() - (this.strength/2);
            character.setHpInAttack(resultHp);
            setStaminaInAttack(this.stamina+1);
            System.out.println(getName() + " has attacked with a weak attack");
        } else if (this.stamina < 1) {
            setStaminaInAttack(this.stamina += 2);
            System.out.println(getName() + " does not have enough stamina to attack");
            
        }

    }
}
