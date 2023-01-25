public class Barbarian extends Fighter {
    private Weapon weapon;

    public Barbarian(int treasure, String name, int health, Weapon weapon) {
        super(treasure, name, health);
        this.weapon = weapon;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
