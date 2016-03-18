package day0317;

import java.util.Scanner;

/**
 * <문제>
 * 수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램을 작성하시오.
 * 
 * 예를 들어, 수열 A = {10, 30, 10, 20, 20, 10} 인 경우에 가장 긴 감소하는 부분 수열은 A = {10, 30, 10, 20, 20, 10}  이고, 길이는 3이다.
 * 
 * <입력>
 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
 * 
 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 * 
 * <출력>
 * 첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열의 길이를 출력한다.
 * 
 * @date     2016. 3. 10.
 * @author <a href="mailto:btc_yh@naver.com">김용훈</a>
 *
 */
public class Boj11722 {

	public static void main(String[] args) {
		Boj11722Solver solver = new Boj11722Solver();
		solver.solve();
	}
}

class Boj11722Solver{
	int count = 0;
	int length = 0;
	int[] values;
	int[] weightValues;
	
	Boj11722Solver() {}
	
	public void solve(){
		Scanner scanner = new Scanner(System.in);
		
		count = scanner.nextInt();
		values = new int[count];
		weightValues = new int[count];
		
		for(int i=0; i<count; i++){
			values[i] = scanner.nextInt();
		}
		
		for(int i=0; i<count; i++){
			// 모든 숫자 확인
			for(int j=0; j<i; j++){
				// 앞에 숫자들 확인
				if(values[i] < values[j]){
					// 앞에 값이 크면
					weightValues[i] = (weightValues[i] < weightValues[j]) ? weightValues[j] : weightValues[i];
				}
			}
			weightValues[i]++;
			length = (weightValues[i] > length) ? weightValues[i] : length;
		}
		
		System.out.println(length);
	}
}