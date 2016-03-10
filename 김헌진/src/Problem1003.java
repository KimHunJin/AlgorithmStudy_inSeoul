import java.util.Scanner;

/**
 * Created by HunJin on 2016-02-17.
 */
public class Problem1003 {

    int zero = 0;
    int one = 0;

    public static void main(String[] args) {

        Problem1003 problem1003 = new Problem1003();

        problem1003.loop();
    }

    int fibonacci(int n) {
        if (n==0) {
            zero++;
            return 0;
        } else if (n==1) {
            one++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    void loop() {
        int T, input;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int i=0;i<T;i++) {
            input = sc.nextInt();
            fibonacci(input);
            System.out.println(zero + " " + one);
            init();
        }
    }

    void  init() {
        zero = 0;
        one = 0;
    }
}
