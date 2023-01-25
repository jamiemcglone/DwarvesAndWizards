public class Wizard extends Player {
    private Spell spell;
    private MythicalCreature creature;

    public Wizard(int treasure, String name, int health, Spell spell, MythicalCreature creature) {
        super(treasure, name, health);
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public IAttack getAttack() {
        return this.getSpell();
    }

    @Override
    public void removeHealth(int damage) {
        int adjustedDamage = (int)Math.round(damage * creature.getProtection());
        super.removeHealth(adjustedDamage);
    }
}
