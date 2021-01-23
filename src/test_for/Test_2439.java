package test_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test_2439 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		if (N<1 || N>100) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int k =N; k > 0; k--) {
			for (int i = 0; i < k-1; i++) {
				bw.write(" ");
			}
			for (int j = 0; j < N-(k-1); j++) {
				bw.write("*");
			}
			bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
