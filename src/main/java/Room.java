public class Room {

    private int treasure;
    private Monster monster;

    public Room(int treasure, Monster monster) {
        this.treasure = treasure;
        this.monster = monster;
    }

    public int getTreasure() {
        return this.treasure;
    }

    public IDamageable getMonster() {
        return this.monster;
    }

    public void resetRoom(){
        monster.resetMonster();
    }
}
