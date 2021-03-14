class Cat {
    boolean hasFur = true;
    String color, breed;
    int legs, eyes;

    public void walk(){
        System.out.println("Cat is walking.");
    }
    public void eat(){
        System.out.println("Cat is eating.");
    }
    public void description(){
        System.out.println("My cat has " + legs + " legs , " + eyes +" eyes" + " and her breed is " + breed);
    }
}
class Dog {
    boolean isMale = true;
    int legs, eyes;
    String color;

    public void sleeping(){
        System.out.println("My dog is sleeping.");
    }
    public void breed(){
        System.out.println("The breed of my dog is Germansheppard.");
    }
    public void descriptionOfMyDog(){
       System.out.println("My dog has "+ legs + " legs " + eyes + " eyes ");
    }
}

public class ObjectOrientedProgramming {

    public static void main(String[] args) {

        Cat chemu = new Cat(); // creating object of the class.
        chemu.walk();
        chemu.eat();
        chemu.legs = 4; // defining the values
        chemu.eyes = 2;
        chemu.breed = "White";
        chemu.description();

        Dog tom = new Dog();
        tom.eyes = 2;
        tom.color = "Black";
        tom.legs = 4;
        tom.sleeping();
        tom.breed();
        tom.descriptionOfMyDog();

    }
}
