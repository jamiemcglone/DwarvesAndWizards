public enum MythicalCreature {
    OGRE("Ogre", 0.5),
    DRAGON("Dragon", 0.7);

    private String name;
    private double protection;

    MythicalCreature(String name, double protection) {
        this.name = name;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public double getProtection() {
        return protection;
    }
}
