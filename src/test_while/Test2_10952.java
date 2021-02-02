package test_while;

import java.util.Scanner;
public class Test2_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		sc.close();
	}
}
