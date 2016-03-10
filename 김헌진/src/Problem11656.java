import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-10.
 */
public class Problem11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++) {
            arr.add(input.substring(i));
        }
        Collections.sort(arr);

        for(int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
}
