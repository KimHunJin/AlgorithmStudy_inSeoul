import java.util.Scanner;

/**
 * Created by HunJin on 2016-02-22.
 */
public class Problem1008 {
    public static void main(String[] args) {
        int inputA,inputB;

        Scanner sc = new Scanner(System.in);
        inputA = sc.nextInt();
        inputB = sc.nextInt();

        double result;

        result = (double)inputA/(double)inputB;

        System.out.printf("%.9f\n",result);
    }
}
