package AbastractionInJava;

public class RepairShop {

    public static void repairCar(Car car){
        System.out.println("Car is repaired.");
    }

    public static void main(String[] args) {
        WagonR obj1 = new WagonR();
        Audi obj2 = new Audi();

        repairCar(obj1);
        repairCar(obj2);
    }
}
