package AbastractionInJava;

public class Audi extends Car {

    @Override
    public void acceleration() {
        System.out.println("Audi is accelerating.");
    }

    public void breaking(){
        System.out.println("Audi is breaking.");
    }
}
