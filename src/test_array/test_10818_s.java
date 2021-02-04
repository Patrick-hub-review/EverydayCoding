package test_array;

import java.util.Scanner;

public class test_10818_s {
	public static void main(String[] args) {
		//요것도 시간 초과
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		int temp = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			}
		for (int i = 0; i < N; i++) {
			for (int j = i; j < arr.length; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		System.out.println(arr[0]);
		System.out.println(arr[N-1]);
	}
}
