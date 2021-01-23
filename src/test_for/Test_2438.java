package test_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test_2438 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		if (N<1 || N>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < i+1; j++) {
					bw.write("*");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
