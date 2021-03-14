import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dimensions of the matrix :- ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        String s = sc.next();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];

        System.out.println("Enter first matrix:-");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter second matrix:-");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Result Matrix is:- ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }
}
