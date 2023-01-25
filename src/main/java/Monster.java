public class Monster implements IDamageable {

    private int health;
    private String name;

    private int maxHealth;

    public Monster(int maxHealth, String name) {
        this.health = maxHealth;
        this.name = name;
        this.maxHealth = maxHealth;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName() {
        return this.name;
    }

    public void resetMonster(){
        this.health = maxHealth;
    }

    @Override
    public void removeHealth(int damage){
        this.health -= damage;
    }

}
