package test_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1110 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int copy = N;
		
		//(N%10) * 10 - 10의 자리 수
		//(N/10 + N%10)%10 - 일의 자리 수
		while(true) {
			N = ((N%10)*10) + ((N/10 + N%10)%10);	
			//int T = ((N%10)*10) + ((N/10 + N%10)%10);
			//위의 것이 안되는 이유는 N의 값이 변하지 않기 때문이다.
			cnt++;
			if (N == copy) break;
		}
		System.out.println(cnt);
	}

}
