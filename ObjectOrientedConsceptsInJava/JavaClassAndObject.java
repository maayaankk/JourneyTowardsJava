package ObjectOrientedConsceptsInJava;

public class JavaClassAndObject {
      public static void main(String[] args) {
        Person obj1 = new Person(); // Object 1
        obj1.age = 24;
        obj1.name = "Mayank";

        System.out.println("Age is " + obj1.age + " Name is " + obj1.name);

        Person obj2 = new Person(); // Object 2
        obj2.age = 20;
        obj2.name = "Chotaliya";

        System.out.println("Age is " + obj2.age + " Name is " + obj2.name);

          obj1.eat();
          obj2.walk();
          obj2.walk(20);
    }
}
class Person {
    String name;
    int age;

    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void walk(int steps){
        System.out.println(name + " has walked "+ steps + " Steps.");
    }
}
