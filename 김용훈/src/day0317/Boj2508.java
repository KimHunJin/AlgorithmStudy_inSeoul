package day0317;


import java.util.Scanner;

/**
 * <문제>
 * 창영이가 드디어 취직을 했다!! 그가 30세까지 취직을 안하던 이유는 바로 마음에 다니는 직장을 찾지 못해서였다. 이번에 창영이가 취직한 곳은 사탕 공장이다. 사탕 공장에 다니면 사탕 처럼 달콤한 직장생활을 할 줄 알았지만, 8시간동안 사탕 품질을 검사해야 하는 작업은 너무나 지루했다.
 * 
 * 사탕의 품질은 다음과 같이 검사한다. 가장 먼저 사탕으로 가득 찬 박스를 연 다. 그 다음 사탕의 개수와 사탕이 없는 곳의 개수를 센다.
 * 
 * 지루함을 견디지 못한 창영이는 결국 품질을 검사하는 프로그램을 작성하기로 했다.
 * 
 * r행 c열 행령이 주어진다. 이 행렬은 박스를 위에서 바라본 것이다. 행렬에는 다음과 같은 문자만 있다.
 * 
 * ".": 빈 곳
 * "o": 사탕의 먹을 수 있는 부분
 * "<>v^": 캔디 껍질
 * 사탕은 오직 2가지 모습만 있다.
 * 
 * >o<
 * v
 * o
 * ^
 * 위와 같은 연속된 3개의 문자만 사탕이다.
 * 
 * 사탕은 >o.와 같이 사탕의 일부만 존재할 수 있지만, 이 것은 사탕으로 세지 않는다.
 * 
 * r행 c열 행렬이 주어졌을 때, 사탕의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * <입력>
 * 첫째 줄에 테스트 케이스의 개수 t가 주어진다. 각 테스트 케이스는 빈 줄로 구분된다.
 * 
 * 각 테스트 케이스의 첫째 줄에는 r과 c 가 주어진다. (1<=r,c<=400) 그 다음 r개의 줄에는 행렬의 각 행이 순서대로 주어진다. 행렬의 각 행은 c개의 문자이며, ".o<>v^"만 포함하고 있다. (각각의 아스키 값은 46, 111, 60, 62, 118, 94이다)
 * 
 * <출력>
 * 각각의 테스트 케이스에 대해 한 줄에 하나의 정수만 출력한다. 이 값은 박스에 들어있는 사탕의 개수이다.
 * 
 * @date     2016. 3. 9.
 * @author <a href="mailto:btc_yh@naver.com">김용훈</a>
 *
 */
public class Boj2508 {
	public static void main(String[] args) {
		Boj2508Solver solver = new Boj2508Solver();
		solver.solve();
	}
}

class Boj2508Solver {
	Boj2508Solver() {}

	public void solve() {
		String line = "";
		int count = 0;
		int x=0, y=0;
		char[] words;
		int[] checkWord;
		int[] candyNum;
		
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();
		
		candyNum = new int[count];
		
		for(int i=0; i<count; i++){
			// 테트케이스 반복

			int candy = 0;
			
			x = scanner.nextInt();
			y = scanner.nextInt();
			
			checkWord = new int[y];
			
			for(int j=0; j<x; j++){
				// 행 반복
				
				line = scanner.next();
				words = line.toCharArray();
				
				for(int k=0; k<y; k++){
					// 열 반복
					
					if((int)words[k] == 94){
						// ^ 일 때
						if(checkWord[k] == 4){
							candy++;
						}
					}	
					
					if((int)words[k] == 111){
						// o 일 때
						
						if(k != 0 && k != y-1){
							if((int)words[k-1] == 62 && (int)words[k+1] == 60){
								candy++;
							}
						}
						
						if(checkWord[k] == 2){
							checkWord[k] = 3;
						}
					}
					
					if((int)words[k] == 118){
						// v 일 때
						checkWord[k] = 1;
					}
				} // 열 반복 끝
				
				// 초기화
				for(int l=0; l<checkWord.length; l++){
					if(checkWord[l] == 0 || checkWord[l] == 2 || checkWord[l] == 4){
						checkWord[l] = 0;
					}
					else{
						checkWord[l]++;
					}
				}
				
			} // 행 반복 끝
			candyNum[i] = candy;
		} // 테스트케이스 반복 끝
		
		for(int num : candyNum){
			System.out.println(num);
		}
	}
}