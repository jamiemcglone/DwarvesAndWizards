public enum HealingTool {

    FOOD ("Food"),
    POTION ("Full health potion");

    private String name;

    HealingTool(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String doHeal(IDamageable player) {
        if(this == FOOD){
            player.removeHealth(-10);
            return "You have healed by 10";
        }
        else if (this == POTION){
            int healthGain = player.getMaxHealth() - player.getHealth();
            player.removeHealth(-healthGain);
            return "You have healed by " + healthGain;
        }
        else {
            return "You did not heal at all";
        }
    }
}
