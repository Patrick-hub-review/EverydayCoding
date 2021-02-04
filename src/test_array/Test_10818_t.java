package test_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_10818_t {

	public static void main(String[] args) throws IOException {
		//java.util.arrays 유틸리티 클래스의 sort 메소드를 이용하면 시간 초과 없음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int index = 0;
		
		while (st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[index-1]);
	}
}
