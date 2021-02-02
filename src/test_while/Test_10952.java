package test_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
//		각 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
//		입력의 마지막에는 0 두개가 들어온다.

public class Test_10952 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int sum;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sum = A + B;
			if (A == 0 && B == 0) {
				break;
			}else {
				bw.write(sum + "\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
