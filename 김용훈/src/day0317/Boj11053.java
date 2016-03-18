package day0317;

import java.io.*;
import java.util.StringTokenizer;

/**
 * <문제>
 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
 * 
 * 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
 * 
 * <입력>
 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
 * 
 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 * 
 * <출력>
 * 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
 * 
 * @date     2016. 3. 17.
 * @author <a href="mailto:btc_yh@naver.com">김용훈</a>
 *
 */
public class Boj11053 {
	public static void main(String[] args) throws IOException {
		BojScanner bscanner = new BojScanner();
		BojPrinter bprinter = new BojPrinter();
		
		int length = 0;
		int count = bscanner.nextInt();

		int[] values = new int[count];
		int[] weightValues = new int[count];
		
		for(int i=0; i<count; i++){
			values[i] = bscanner.nextInt();
		}
		
		for(int i=0; i<count; i++){
			// 모든 숫자 확인
			for(int j=0; j<i; j++){
				// 앞에 숫자들 확인
				if(values[i] > values[j]){
					// 앞에 값이 작으면
					weightValues[i] = (weightValues[j] > weightValues[i]) ? weightValues[j] : weightValues[i];
				}
			}
			weightValues[i]++;
			length = (weightValues[i] > length) ? weightValues[i] : length;
		}
		
		bprinter.print(length);
		
		bscanner.close();
		bprinter.close();
	}
	
	public static class BojScanner {
        BufferedReader br;
        StringTokenizer st;
         
        public BojScanner () {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
         
        public String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
             
            return st.nextToken();
        }
         
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
         
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
         
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
         
        public String nextLine() throws IOException {
            return br.readLine();
        }
         
        public void close() throws IOException {
            br.close();
        }
    }
     
    public static class BojPrinter {
        BufferedWriter bw;
         
        public BojPrinter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }
         
        public void print(Object obj) throws IOException {
            bw.append("" + obj);
        }
         
        public void println(Object obj) throws IOException {
            bw.append(obj + "\n");
        }
         
        public void close() throws IOException {
            bw.close();
        }
    }

}
