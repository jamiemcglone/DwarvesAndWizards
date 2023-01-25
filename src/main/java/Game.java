public class Game {

    private Room currentRoom;


    public Game(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public boolean roomComplete(){
        return currentRoom.getMonster().getHealth() <= 0;
    }

    public String performAttack(Player player){
        if (this.roomComplete()){
            return "Room complete already";
        }
        else {
            String attackMessage = player.getAttack().doAttack(currentRoom.getMonster());
            if (this.roomComplete()){
                player.addTreasure(this.currentRoom);
                return attackMessage + " you defeat the monster and " + this.currentRoom.getTreasure() + " treasure";
            }
            else{
                return attackMessage;
            }
        }
    }


}
