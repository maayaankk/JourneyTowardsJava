package ToPointerAlgorithm;

import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        twoSum();
    }

    private static void twoSum() {
        System.out.println("hhi");

    }

    public int twoSum( int x){
        int a[] = {-1, 5, 0, 2, -2, 7, 10};

        Arrays.sort(a);

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(a));

        int i = 0, j = a.length - 1;
        while (i < j){
            if(a[i] + a[j] > x){
                j--;
            }else if (a[i] + a[j] < x){
                i++;
            }else {
                return 0 ;
            }

        }
        return 1;
    }
}
