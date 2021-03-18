import java.util.Scanner;
public class SeriesSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        float result1 = 0;
        //float result2 = 0;

        for (float i = 1; i<=n; i++){
            if( i % 2 == 0){
                result1 -= 1/i;
            }else {
                result1 +=1/i;

            }
        }

        System.out.println(result1);
    }
}
