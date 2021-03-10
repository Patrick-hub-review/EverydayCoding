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
		
		//세자리 수를 입력받아서 곱한다.
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			result *= num;
		}
		
		//세자리 수를 곱한 결과값부터 10으로 차례대로 나누면서 
		//10으로 나눈 나머지를 ArrayList에 저장한다.
		while (result > 0) {
			int rest = result % 10;
			result /= 10;
			arr.add(rest);
		}
		
		//ArrayList에 있는 값들으 0~9까지 분류하면서 카운트 해준다.
		for (int i : arr) {
			if (i == 0) count0++;	if (i == 1) count1++;	if (i == 2) count2++;	if (i == 3) count3++;	if (i == 4) count4++;
			if (i == 5) count5++;	if (i == 6) count6++;	if (i == 7) count7++;	if (i == 8) count8++;	if (i == 9) count9++;
		}
		
		System.out.println(count0);	System.out.println(count1);	System.out.println(count2);	System.out.println(count3);	
		System.out.println(count4);	System.out.println(count5);	System.out.println(count6);	System.out.println(count7);	
		System.out.println(count8);	System.out.println(count9);
	}
}
