import java.util.UUID;

public class Character {
    private final String id = String.valueOf(UUID.randomUUID());
    private String name;
    private int hp;
    private boolean isAlive = true;

    public Character(String name, int hp) {
        setName(name);
        setHp(hp);

    }

    public Character(String name) {
        setName(name);
        setHp(hp);
    }

    public String getId() {
        return id;
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
    public void setHpInAttack(int hp){
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Character id: " + id +", name: " + name +
                ", hp: " + hp +
                ", isAlive: " + isAlive + " ";
    }


}

