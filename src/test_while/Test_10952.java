package test_while;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//���� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
//		�� ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����.
//		�Է��� ���������� 0 �ΰ��� ���´�.

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
