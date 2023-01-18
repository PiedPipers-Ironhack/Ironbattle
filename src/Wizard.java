public class Wizard extends Character implements Attacker {

    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public Wizard(String name) {
        super(name);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public void setHp(int hp) {
        super.setHp(49 + (int) Math.ceil(Math.random() * 51));

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {

        this.mana = (int) (Math.random() * 40 + 10);
    }
    public void setManaInAttack(int mana){
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = (int) (Math.random() * 49 + 1);
    }

    @Override
    public String attack(Character character) {

        int random = (Math.random()<= 0.5)?1:2;
        System.out.println("random attack: " + random);

        if( random == 1 && this.mana >= 5){
            int resultHp = character.getHp() - this.intelligence;
            character.setHpInAttack(resultHp);
            setManaInAttack(this.mana-5);
            //System.out.println(getName() + " has attacked with a Fireball");
            return getName() + " has attacked with a Fireball, his Mana has reduced to " + this.mana + "\n" + character.getName() + " was attacked and his HP is now " + character.getHp() + "\n" + "=====================";

        } else if(random == 2 && character.getHp() > 0 || getMana() < 5 && character.getHp() > 0) {
            int resultHp = character.getHp() - 2;
            character.setHpInAttack(resultHp);
            setManaInAttack(this.mana+1);
            //System.out.println(getName() + " has attacked with a Staff Hit, his Mana has reduced to " + this.mana);
            return getName() + " has attacked with a Staff Hit, his mana has reduced to " + this.mana + "\n" + character.getName() + " was attacked and his HP is now " + character.getHp() + "\n" + "=====================";

        } else if (getMana() < 1) {
            setManaInAttack(this.mana+ 2);
            //System.out.println(getName() + " does not have enough Mana to cast a spell");

        }
        return getName() + " does not have enough mana to cast a spell, his Mana was restored to " + this.mana + "\n" + "=====================";

    }

    @Override
    public String toString() {
        return Wizard.super.toString() + "\n" + "Character Class: Wizard ," +
                "Mana: " + mana +
                ", Intelligence: " + intelligence + "\n" + "=====================";
    }
}
