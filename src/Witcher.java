public class Witcher extends Hero {
    private boolean revived = false;

    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.REVIVE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.attack(this);
        if (!revived) {
            for (Hero hero : heroes) {
                if (hero.getHealth() <= 0) {
                    hero.revive();
                    revived = true;
                    setHealth(0);
                    break;
                }
            }
        }
    }
}
