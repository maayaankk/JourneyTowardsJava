package PolymorphismInJava;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        Pet p = d; // Upcasting.     // This is Runtime polymorphism.
        Animal a = d; // Upcasting.

        d.walk();
        p.walk();
        greetings();
        greetings("My name is mayank.");
        greetings("Hello" , 5);
    }

    public static void greetings() {
        System.out.println("Hi, there.");
    }                                       // This is Compile time polymorphism.

    public static void greetings(String s) {
        System.out.println(s);
    }
    public static void greetings(String s, int count) {
        for(int i = 0; i< count; i++){
            System.out.println(s);
        }
    }
}
