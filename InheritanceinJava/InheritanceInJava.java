package InheritanceinJava;

public class InheritanceInJava {

    public static void main(String[] args) {
        Mobile obj = new Mobile("iPhone", 500);
        obj.buy();

        Buyer d1 = new Buyer("Samsung", 100);
        d1.buy();

        Dealer x1 = new Dealer("Realme", 50);
        x1.buy();
    }
}

class Dealer extends Mobile {  

    public Dealer(String newMobileName, int newPrice){
        super(newMobileName, newPrice);
    }
}

class Buyer extends Mobile { // Child class.

    public Buyer(String newMobileName, int newPrice) {
        super(newMobileName, newPrice);
    }
}
class Mobile{ // Parent class.
    String mobileName;
    int price;

    public Mobile(String newMobileName, int newPrice){

        this.mobileName = newMobileName;
        this.price = newPrice;
    }
    void buy(){
        System.out.println(mobileName + " is of price " + price + " Rs ");
    }
}