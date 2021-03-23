package InterfaceInJava;

public class Person implements Student, YouTuber {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.makeVideo();
        obj.study();
    }

    @Override
    public void study() {
        System.out.println("Person is studying.");
    }

    @Override
    public void makeVideo() {
        System.out.println("persom is making good videos");
    }
}
