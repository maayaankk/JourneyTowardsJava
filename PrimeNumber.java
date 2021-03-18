import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, temp =0;
        System.out.println("Enter a number: " +n);

        for(i=2; i<=n-1;i++){

            if(n%i==0){
                temp = temp+1;
            }
        }

        if(temp==0){
            System.out.println(n+ " is a Prime number.");
        }else{
            System.out.println(n+ " is not a prime number.");
        }

    }
}
