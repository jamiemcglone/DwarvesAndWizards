public enum Spell implements IAttack {
    FIREBALL("Fireball", 0.5),
    LIGHTNING_STRIKE("Lightning Strike", 0.9);

    private String name;
    private double multiplier;

    Spell(String name, double multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }

    public String getName() {
        return this.name;
    }

    public double getMultiplier() {
        return this.multiplier;
    }

    @Override
    public String doAttack(IDamageable monster) {
        int damage = (int)Math.round(monster.getHealth() * multiplier);
        monster.removeHealth(damage);
        return "You attacked with " + this.name + " and did " + damage + " damage";
    }
}
