import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HunJin on 2016-03-08.
 */
public class Problem10866 {

    static ArrayList arrayList = new ArrayList();
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
        if(checkMethod.equals("push_front")) {
            arrayList.add(0,str[1]);
        } else if(checkMethod.equals("push_back")) {
            arrayList.add(str[1]);
        } else if(checkMethod.equals("pop_front")) {
            if(arrayList.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(arrayList.get(0));
                arrayList.remove(0);
            }
        } else if(checkMethod.equals("pop_back")) {
            if(arrayList.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(arrayList.get(arrayList.size()-1));
                arrayList.remove(arrayList.size()-1);
            }
        } else if(checkMethod.equals("size")) {
            System.out.println(arrayList.size());
        } else if(checkMethod.equals("empty")) {
            if(arrayList.isEmpty()) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if(checkMethod.equals("front")) {
            if(arrayList.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(arrayList.get(0));
            }
        } else if(checkMethod.equals("back")) {
            if(arrayList.isEmpty()) {
                System.out.println(-1);
            } else {
                System.out.println(arrayList.get(arrayList.size()-1));
            }
        }
    }

}
