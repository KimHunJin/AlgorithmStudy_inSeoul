import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-08.
 */
public class Problem10828 {

    static ArrayList stack = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopNumber = Integer.parseInt(sc.nextLine());
        String str = "";

        for(int i=0;i<loopNumber;i++) {
            str = sc.nextLine();
            String[] s = str.split(" ");
            confilm(s);
        }
    }

    static void confilm(String[] str) {
        if(str[0].equals("push")) {
            stack.add(str[1]);
        } else if(str[0].equals("top")) {
            if(stack.size()==0) {
                System.out.println(-1);
            } else {
                System.out.println(stack.get(stack.size()-1));
            }
        } else if(str[0].equals("size")) {
            System.out.println(stack.size());
        } else if(str[0].equals("empty")) {
            if(stack.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if(str[0].equals("pop")) {
            if(stack.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(stack.get(stack.size()-1));
                stack.remove(stack.size()-1);
            }
        }
    }
}
