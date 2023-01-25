public enum Weapon implements IAttack {
    SWORD("Sword", 25),
    AXE("Axe", 34);

    private String name;
    private int damage;

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    @Override
    public String doAttack(IDamageable monster) {
        monster.removeHealth(this.damage);
        return "You attacked with " + this.name + " and did " + this.damage + " damage";
    }
}
