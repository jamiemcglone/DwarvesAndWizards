public class Dwarf extends Fighter {
    public Dwarf(int treasure, String name, int health) {
        super(treasure, name, health);
    }

    @Override
    public Weapon getWeapon() {
        return Weapon.AXE;
    }
}
