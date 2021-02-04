package test_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_10818_f {

	public static void main(String[] args) throws IOException {
		//N개의 정수가 주어진다.
		//이 때 최솟값과 최대값을 구하는 프로그램을 작성하시오.
		//결과: 시간 초과
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); 	
		st = new StringTokenizer(br.readLine());		
		int[] arr = new int[N];
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			}
		for (int i = 0; i < arr.length; i++) {
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
