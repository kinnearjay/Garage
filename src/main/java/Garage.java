import java.util.*;

public class Garage {


    public static void main(String[] argv) {
        Car v1 = new Car(140.5, true, 4, 4, "ford");
        Gokart g1 = new Gokart(50.0, false, 0, 4, "funkarts LTD");
        Motorbike m1 = new Motorbike(30.53, true, 0, 2, "yamaha");

        List<Vehicle> vh = new ArrayList<Vehicle>();


        v1.setNumPlate("7HEB43ST");
        m1.setNumPlate("3381C5123T");
        m1.setTrike(true);
        vh.add(v1);
        vh.add(g1);
        vh.add(m1);
        calculateCosts(vh);
        while (true) {
            System.out.println("press 1 to add vehicle press 2 to show vehicles");
            Scanner pickChoice = new Scanner(System.in);
            switch (pickChoice.nextInt()) {
                case 1:
                    addVehicle(vh);
                    break;
                case 2:
                    calculateCosts(vh);
                    break;
                case 3:
                    removeVehicle(vh);
                    break;
                case 4:
                    vh.removeAll(vh);
                    case 0:
                        System.exit(1);
            }

        }
    }

    public static List<Vehicle> addVehicle(List<Vehicle> lv){
        boolean hasHeadlights;
        Scanner sc = new Scanner(System.in);
        System.out.println("please eneter weight: ");
        double vWeight = Double.parseDouble(sc.nextLine());
        System.out.println("Does it have headlights: ");
        if(sc.nextLine().contains("yes") || sc.nextLine().contains("y")){
            hasHeadlights = true;
        }else {
            hasHeadlights = false;
        }
        System.out.println("please eneter number of doors: ");
        int numdoor = Integer.parseInt(sc.nextLine());
        System.out.println("please eneter # of wheels: ");
        int numWheel = Integer.parseInt(sc.nextLine());
        System.out.println("please eneter make: ");
        String maker = sc.nextLine();

        Vehicle newVeh = new Car(vWeight,hasHeadlights, numdoor,numWheel,maker);

        lv.add(newVeh);
        return lv;

    }
    public static void removeVehicle(List<Vehicle> lv){
        System.out.println("enter a thingy to delete");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< lv.size(); i++){
            if(lv.get(i).getId().toString().contains(sc.nextLine())){
                lv.remove(i);
                break;

            }
        }
    }

    public static void calculateCosts(List<Vehicle> lv){
       for(int i = 0 ; i<lv.size(); i++){
           double cost = lv.get(i).getNumDoors()*1.25 + lv.get(i).getNumWheels()*1.25+lv.get(i).getWeightKG()*2.23;
           System.out.println("the cost of the vehicle with the details " +lv.get(i).toString() +" £" + cost);
       }




    }




}
