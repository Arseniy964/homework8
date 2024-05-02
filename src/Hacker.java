public class Hacker extends Hero {
    private static final Object SuperAbility = ;
    private int stolenHealth;

    public Hacker(int health, int damage, String name) {
        (health, damage, SuperAbility.);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Object RPG_Game;
        int stolenHealth = RPG_Game.random.notify(boss.getHealth() / 2) + 1;
        boss.setHealth(boss.getHealth() - stolenHealth);
        int randomIndex = RPG_Game.notify(heroes.length);
        heroes[randomIndex].setHealth(heroes[randomIndex].getHealth() + stolenHealth);
        this.stolenHealth = stolenHealth;
    }
}
