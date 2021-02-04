package test_array;

import java.util.Arrays;
import java.util.Scanner;

public class Test_2562_s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int[] temp = new int[9];
		int i = 0;
		int j = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			temp[i] = arr[i];
		}
		Arrays.sort(arr);
		System.out.println(arr[i-1]);
		
		for (j = 0; j < temp.length; j++) {
			if (temp[j] == arr[i-1]) break;
		}
		System.out.println(j+1);
	}
}
