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
		
		//(N%10) * 10 - 10�� �ڸ� ��
		//(N/10 + N%10)%10 - ���� �ڸ� ��
		while(true) {
			N = ((N%10)*10) + ((N/10 + N%10)%10);	
			//int T = ((N%10)*10) + ((N/10 + N%10)%10);
			//���� ���� �ȵǴ� ������ N�� ���� ������ �ʱ� �����̴�.
			cnt++;
			if (N == copy) break;
		}
		System.out.println(cnt);
	}

}
