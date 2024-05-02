import java.util.Random;

public class Boss {
    private int health;
    private int damage;
    private String name;
    private SuperAbility defence;
    private Random random = new Random();

    public Boss(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    public void chooseDefence() {
        SuperAbility[] values = SuperAbility.values();
        int randIndex = random.nextInt(values.length);
        this.defence = values[randIndex];
    }

    public SuperAbility getDefence() {
        return defence;
    }

    public void attack(Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                hero.takeDamage(damage);
            }
        }
    }

    public int stealHealth() {
        int stolenHealth = random.nextInt(100) + 1;
        health -= stolenHealth;
        return stolenHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Boss " + name + " health: " + health + " damage: " + damage;
    }
}

