import java.util.UUID;

public class Car extends  Vehicle{

    private String numPlate;

    public Car( double weightKG, boolean hasHeadLights, int numDoors, int numWheels, String make) {
        super(weightKG, hasHeadLights, numDoors, numWheels, make);
    }

    public void revIt() {
        System.out.println("broom broom");
    }

    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    public void turnOn() {
        System.out.println("chk chk chk ping");
    }


}
