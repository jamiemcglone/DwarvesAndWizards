public abstract class Player implements IDamageable {
    private int treasure;
    private String name;
    private int health;

    public Player(int treasure, String name, int health) {
        this.treasure = treasure;
        this.name = name;
        this.health = health;
    }

    public int getTreasure() {
        return treasure;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void addTreasure(Room room) {
        this.treasure += room.getTreasure();
    }

    public abstract IAttack getAttack();

    @Override
    public void removeHealth(int damage) {
        this.health -= damage;
    }
}
