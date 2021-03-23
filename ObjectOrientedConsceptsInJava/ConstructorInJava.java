package ObjectOrientedConsceptsInJava;

public class ConstructorInJava {
    public static void main(String[] args) {
        Person2 obj = new Person2(20, "Mayank");
        obj.walk();
    }
}
class Person2 {
    int age;
    String name;

    static int count; // Static means the given property is no longer the property of object,
    public Person2(){ // It is now the property of the class.
        count++;
        System.out.println("Creating an object.");
    }
    public  Person2(int age, String name){
        this();
        this.name = name;
        this.age = age;
    }
    void walk() {
        System.out.println(name + " is walking.");
    }
}

