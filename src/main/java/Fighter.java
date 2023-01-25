public abstract class Fighter extends Player {
    public Fighter(int treasure, String name, int health) {
        super(treasure, name, health);
    }

    public abstract Weapon getWeapon();

    @Override
    public IAttack getAttack() {
        return this.getWeapon();
    }
}
