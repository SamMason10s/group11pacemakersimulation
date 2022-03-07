package Pacemaker;

public class Mechanism {
    private String name;
    private String description;
    private float load;
    private int memory;

    public Mechanism(String name, String description, float load, int memory) {
        this.name = name;
        this.description = description;
        this.load = load;
        this.memory = memory;
    }

    public String getName() {
        return this.getName();
    } 

    public String getDescription() {
        return this.description;
    }

    public float getLoad() {
        return this.load;
    }

    public int getMemory() {
        return this.memory;
    }
}
