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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = (int) (Math.random() * 49 + 1);
    }

    @Override
    public int attack(Character character) {

        int resultHp = character.getHp() - this.intelligence;
        //System.out.println("character hp: " + character.getHp());
        //System.out.println("intelligence: " + this.intelligence);
        //System.out.println("result hp: " + resultHp);
        character.setHpInAttack(resultHp);
        return character.getHp();
    }
}
