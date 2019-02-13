import java.util.UUID;

public class Motorbike extends Vehicle{
    private boolean trike;
    private String numPlate;
    public Motorbike( double weightKG, boolean hasHeadLights, int numDoors, int numWheels, String make) {
        super(weightKG, hasHeadLights, numDoors, numWheels, make);
    }

    public void revIt() {
        System.out.println("VRRRRR");
    }

    public boolean isTrike() {
        return trike;
    }

    public void setTrike(boolean trike) {
        this.trike = trike;
    }

    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    public void turnOn() {
        System.out.println("THRRRRRR");
    }
}
