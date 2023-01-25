import java.util.HashMap;

public class Cleric extends Player implements IAttack{

    private HashMap<HealingTool, Integer> inventory;
    private HealingTool currentTool;

    public HealingTool getCurrentTool() {
        return this.currentTool;
    }

    public void setCurrentTool(HealingTool currentTool) {
        this.currentTool = currentTool;
    }

    public Cleric(int treasure, String name, int health, HealingTool currentTool) {
        super(treasure, name, health);
        this.currentTool = currentTool;
        this.inventory = new HashMap<>();
        for(HealingTool tool : HealingTool.values()){
            this.inventory.put(tool, 0);
        }
    }

    public int getInventoryForHealingTool(HealingTool tool) {
        return this.inventory.get(tool);
    }

    public void addToInventory(HealingTool tool, int amount){
        int previous = this.inventory.get(tool);
        this.inventory.put(tool, previous + amount);
    }

    public boolean takeOneFromInventory(HealingTool tool){
        int previous = this.inventory.get(tool);
        if (previous >= 1) {
            this.inventory.put(tool, previous - 1);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String doAttack(IDamageable player) {
       if (this.takeOneFromInventory(this.getCurrentTool())){
           return this.getCurrentTool().doHeal(player);
       }
       else {
           return "Out of inventory";
       }
    }

    @Override
    public IAttack getAttack() {
        return this;
    }
}
