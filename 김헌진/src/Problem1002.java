import java.util.Scanner;

/**
 * Created by HunJin on 2016-02-16.
 *
 */
public class Problem1002 {

    static int T,x1, y1, r1, x2, y2, r2;
    static double d, abs, r1r2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int i=0;i<T;i++) {

            x1 = sc.nextInt();
            y1 = sc.nextInt();
            r1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            r2 = sc.nextInt();

            d = Math.sqrt((Math.pow((x1-x2),2) + Math.pow((y1-y2),2)));
            abs = Math.abs(r2-r1);
            r1r2 = r1 + r2;

            if(x1==x2 && y1==y2 && r1 == r2) {
                System.out.println(-1);
            } else if(abs > d) {
                System.out.println(0);
            } else if(d == abs) {
                System.out.println(1);
            } else {
                if(r1r2 > d) {
                    System.out.println(2);
                } else if(r1r2 == d) {
                    System.out.println(1);
                } else if(r1r2 <d) {
                    System.out.println(0);
                }
            }

        }
    }
}
