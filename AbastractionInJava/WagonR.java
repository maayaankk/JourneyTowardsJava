package AbastractionInJava;

public class WagonR extends Car {


    @Override
    public void acceleration() {
        System.out.println("WagonR is accelerating.");
    }

    public void breaking(){
        System.out.println("WagonR is breaking.");
    }
}
