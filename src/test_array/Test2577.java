package test_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test2577 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int result = 1;
		ArrayList<Integer> arr = new ArrayList<>();
		int count0 = 0;	int count1 = 0;	int count2 = 0;	int count3 = 0;	int count4 = 0;	int count5 = 0;	
		int count6 = 0;	int count7 = 0;	int count8 = 0;	int count9 = 0;
		
		//���ڸ� ���� �Է¹޾Ƽ� ���Ѵ�.
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			result *= num;
		}
		
		//���ڸ� ���� ���� ��������� 10���� ���ʴ�� �����鼭 
		//10���� ���� �������� ArrayList�� �����Ѵ�.
		while (result > 0) {
			int rest = result % 10;
			result /= 10;
			arr.add(rest);
		}
		
		//ArrayList�� �ִ� ������ 0~9���� �з��ϸ鼭 ī��Ʈ ���ش�.
		for (int i : arr) {
			if (i == 0) count0++;	if (i == 1) count1++;	if (i == 2) count2++;	if (i == 3) count3++;	if (i == 4) count4++;
			if (i == 5) count5++;	if (i == 6) count6++;	if (i == 7) count7++;	if (i == 8) count8++;	if (i == 9) count9++;
		}
		
		System.out.println(count0);	System.out.println(count1);	System.out.println(count2);	System.out.println(count3);	
		System.out.println(count4);	System.out.println(count5);	System.out.println(count6);	System.out.println(count7);	
		System.out.println(count8);	System.out.println(count9);
	}
}
