package test_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[9];
		int[] temp = new int[9];
		int index = 0;
		int j = 0;
		while (st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			temp[index] = arr[index];
			index++;
		}
		Arrays.sort(arr);
		System.out.println(arr[index -1]);

		for (j = 0; j < temp.length; j++) {
			if (temp[j] == arr[index-1]) break;
		}
		System.out.println(j+1);
	}
}
