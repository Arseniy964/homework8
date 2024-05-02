public class Magic extends Hero {
    private int attackBoost;

    public Magic(int health, int damage, int attackBoost, String name) {
        super(health, damage, SuperAbility.BOOST, name);
        this.attackBoost = attackBoost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + attackBoost);
        }
    }
}
