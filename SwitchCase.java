import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayOfWeek = sc.nextInt();

        switch (dayOfWeek){
            case 1:
                System.out.println("I am on the leave.");
                break;
            case 2:
                System.out.println("I am at the college.");
                break;
            case 3:
                System.out.println("I am partying.");
                break;
            case 4:
                System.out.println("I am Studying.");
                break;
            case 5:
                System.out.println("I am codeing");
                break;
            case 6:
                System.out.println("I am Travelling");
                break;
            case 7:
                System.out.println("I am Taking rest");
                break;

            default:
                System.out.println("I dont what day it is.");
        }
    }
}
