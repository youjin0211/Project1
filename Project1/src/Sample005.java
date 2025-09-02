/**
 *  간단한 계산기
 */

import java.util.Scanner;

/**
 * @author youjin lee
 */
public class Sample005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요");
		int num1 = scanner.nextInt();
		System.out.println("두 번째 숫자를 입력하세요");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;  // 합
		int sub = num1 - num2;  // 차
		int mul = num1 * num2;  // 곱하기
		int div = num1 / num2;  // 나누기
		int mod = num1 % num2;  // 나머지
		
		System.out.println("합은" + sum);
		System.out.println("차는" + sub);
		System.out.println("곱은" + mul);
		System.out.println("몫은" + div);
		System.out.println("나머지" + mod);
		

	}

}
