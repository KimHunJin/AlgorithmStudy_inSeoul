package day0324;

import java.io.*;

/**
 * <문제>
 * 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 총 7가지가 있다.
 * 
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * 정수 n이 주어졌을 때, n을 1,2,3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * <입력>
 * 첫쨰 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 * 
 * <출력>
 * 각 테스트 케이스마다, n을 1,2,3의 합으로 나타내는 방법의 수를 출력한다.
 * 
 * @date     2016. 3. 10.
 * @author <a href="mailto:btc_yh@naver.com">김용훈</a>
 *
 */
public class Boj9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int count = Integer.parseInt(br.readLine());
		int num = 0;
		int result = 0;
		
		for(int i=0; i<count; i++){
			num = Integer.parseInt(br.readLine());
			for(int z=0; z<num/3+1; z++){
				for(int y=0; y<num/2+1; y++){
					for(int x=0; x<num+1; x++){
						if(3*z+y*2+x == num){
							
							if((z==0 && y ==0) || (z==0 && x ==0) || (y==0 && x ==0)){
								// 0이 두개 일 때
								result++;
							}
							else if(x ==0){
								// 0이 하나 일 때
								result += factorial(y+z)/(factorial(y)*factorial(z));
							}else if(y ==0){
								result += factorial(x+z)/(factorial(x)*factorial(z));								
							}else if(z ==0){
								result += factorial(y+x)/(factorial(y)*factorial(x));
							}
							else{
								result += factorial(x+y+z)/(factorial(x)*factorial(y)*factorial(z));
							}
						}
					}
				}
			}
			sb.append(result);
			if(!(i+1 == count)){
				sb.append("\n");				
			}
			result = 0;
		}
		
		bw.append(sb.toString());
		
		br.close();
		bw.close();
	}
	
	public static int factorial(int num){
		int multi = 1;
        for (int i = 1; i <= num; i++) {
            multi = multi * i;
        }
        return multi;
	}
}