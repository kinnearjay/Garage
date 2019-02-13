import java.util.UUID;

public class Gokart extends Vehicle {
    private Boolean electric;



    public Gokart( double weightKG, boolean hasHeadLights, int numDoors, int numWheels, String make ) {
        super(weightKG, hasHeadLights, numDoors, numWheels, make);
    }

    public void revIt() {
        System.out.println("bbbbbbbbbbb");
    }

    public void turnOn() {
        System.out.println("cuggachuggachugga");
    }
    public Boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }
}
