package day06_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	/*	int i=0;
		int j=0, sum=0;
		while(true) {
			System.out.println("입력 숫자 : ");
			i = input.nextInt();
			if(i>=1 && i<=10) {
				break;
			}
			System.out.println("잘못 입력");
		}
		for(j=1;j<=i;j++) {
			sum+=j;
		}
		System.out.println("합 : "+sum);
		*/
		
		int i=0,sum=0;
		while(true) {
			System.out.println("입력 숫자 : ");
			i=input.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
			System.out.println("잘못 입력");
		}
		for(int j=10; j<=i; j++) {
			sum += j;
		}
		System.out.println("합 : "+sum);
		
		
		
		
		
	}
}
