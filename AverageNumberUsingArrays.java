import java.util.Scanner;
public class AverageNumberUsingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        int numberOfStudents = sc.nextInt();

        int marks[] = new int[numberOfStudents];
        System.out.println("Enter the marks now: ");
        for(int i=0; i<numberOfStudents; i++){
            marks[i] = sc.nextInt();
        }
        int averageMarks = 0;
        for(int i=0; i<numberOfStudents; i++){
            averageMarks += marks[i];
        }
        averageMarks /= numberOfStudents;
        System.out.println("The average marks are " + averageMarks);
    }
}
