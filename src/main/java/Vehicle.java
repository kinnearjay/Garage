import java.util.UUID;

public abstract class Vehicle {
    private double weightKG;
    private boolean hasHeadLights;
    private int numDoors;
    private int numWheels;
    private String make;
    private String numberPlate;
    private UUID id;

    public Vehicle(double weightKG, boolean hasHeadLights, int numDoors, int numWheels , String make) {
        this.id = UUID.randomUUID();
        this.weightKG = weightKG;
        this.hasHeadLights = hasHeadLights;
        this.numDoors = numDoors;
        this.numWheels = numWheels;
        this.make = make;
    }
    public abstract void revIt();

    public abstract void turnOn();


    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: "+id+"  Vehicle{" +
                "weightKG=" + weightKG +
                ", hasHeadLights=" + hasHeadLights +
                ", numDoors=" + numDoors +
                ", numWheels=" + numWheels +
                ", make='" + make + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public boolean isHasHeadLights() {
        return hasHeadLights;
    }

    public void setHasHeadLights(boolean hasHeadLights) {
        this.hasHeadLights = hasHeadLights;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
}
