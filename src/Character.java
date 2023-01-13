public class Character {
    private String id;
    private String name;
    private int hp;
    private boolean isAlive = true;

    public Character(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    public Character(String name) {
        setName(name);
        if (this instanceof Warrior) this.hp = (int)(Math.random() * 100 + 100);
        else if (this instanceof Wizard) this.hp = (int)(Math.random() * 50 + 50);
        else setHp(hp);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
