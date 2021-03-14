public class MethodIntroduction {
    public static void main(String[] args) {
        int firstNumber = 34;
        int secondNumber = 38;

        int thirdNumber = 5;
        int fourthNumber = 2;

        int result1 = maxOf(firstNumber, secondNumber); // Method calling.
        System.out.println(result1);

        int result2 = minOf(thirdNumber, fourthNumber); // Method calling.
        System.out.println(result2);

        sayHi();

    }
    static int maxOf(int a, int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }
    static int minOf (int x, int y){
        if (x < y){
            return x;
        }else {
            return y;
        }
    }
    static void sayHi(){
        System.out.println("Hi!");
        System.out.println("Good morning.");
    }
}

