import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-08.
 */
public class Problem10845 {

    static ArrayList queue = new ArrayList();
    static int FRONT = 0;

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
        String checkMethod = str[0];
        if(checkMethod.equals("push")) {
            queue.add(str[1]);
        } else if(checkMethod.equals("pop")) {
            if(queue.size()==0) {
                System.out.println(-1);
            } else {
                System.out.println(queue.get(FRONT));
                queue.remove(FRONT);
            }
        } else if (checkMethod.equals("size")) {
            System.out.println(queue.size());
        } else if(checkMethod.equals("empty")) {
            if(queue.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if(checkMethod.equals("front")) {
            if(queue.size()==0) {
                System.out.println(-1);
            } else {
                System.out.println(queue.get(FRONT));
            }
        } else if(checkMethod.equals("back")) {
            if(queue.size()==0) {
                System.out.println(-1);
            } else   {
                System.out.println(queue.get(queue.size()-1));
            }
        }
    }
}
