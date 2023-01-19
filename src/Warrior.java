public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        setStaminaInput(stamina);
        setStrengthInput(strength);
        setHpInput(hp);
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
    // Control input stamina
    public void setStaminaInput(int stamina){
        if (stamina < 10 || stamina > 50){
            throw new IllegalArgumentException("Stamina should be between 10 and 50");
        }
        this.stamina = stamina;
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

    public void setStrengthInput(int strength){
        if (strength < 1 || strength > 10){
            throw new IllegalArgumentException("Strength should be between 1 and 10");
        }
        this.strength = strength;
    }
    public void setHpInput(int hp){
        if (hp < 100 || hp > 200){
            throw new IllegalArgumentException("Hp should be between 100 and 200");
        }
        super.setHp(hp);

    }

    @Override
    public String toString() {
        return Warrior.super.toString() + "\n" + "Character Class: Warrior ," +
                "Stamina: " + stamina +
                ", Strength: " + strength + "\n" + "=====================";
    }

    @Override
    public String attack(Character character) {
        int random = (Math.random()<= 0.5)?1:2;
        System.out.println("random attack: " + random);
        System.out.println(character.getHp());

        if( random == 1 && character.getHp() > 0 && this.stamina >= 5){
            int resultHp = character.getHp() - this.strength;
            character.setHpInAttack(resultHp);
            setStaminaInAttack(this.stamina-5);
            //System.out.println(getName() + " has attacked with a heavy attack");
            return getName() + " has attacked with a Heavy Attack, his Stamina is now " + this.stamina + "\n" + character.getName() + " was attacked and his HP is now " + character.getHp() + "\n" + "=====================";

        } else if((random == 2 && character.getHp() > 0 )  || (this.stamina < 5 && character.getHp() > 0)) {
            int resultHp = character.getHp() - (this.strength/2);
            character.setHpInAttack(resultHp);
            setStaminaInAttack(this.stamina+1);
            //System.out.println(getName() + " has attacked with a Weak Attack");
            return getName() + " has attacked with a Weak Attack, his Stamina is now " + this.stamina + "\n" + character.getName() + " was attacked and his HP is now " + character.getHp() + "\n" + "=====================";
        } else if (this.stamina < 1) {
            setStaminaInAttack(this.stamina + 2);
            //System.out.println(getName() + " does not have enough Stamina to attack");
            
        }
        return getName() + " does not have enough Stamina to attack, his Stamina got restored to " + this.stamina + "\n" ;
    }
}
