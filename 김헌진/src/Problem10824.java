import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-08.
 */
public class Problem10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextInt() + "";
        String b = sc.nextInt() + "";
        String c = sc.nextInt() + "";
        String d = sc.nextInt() + "";

        System.out.println(Long.parseLong(a+b)+Long.parseLong(c+d));
    }
}
