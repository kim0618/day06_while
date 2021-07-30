package day06_while;

public class Quiz02 {
	public static void main(String[] args) {
		//첫날 1원 예금, 다음날 2배씩 증가 30일째 예금 금액해야하는?
	/*	int j=1,sum=0;
		for(int i=1; i<=30; i++) {
		//	sum= sum+j;
			j+=i;
			j*=2;
			if(i == 30) {
				break;
			}
		}System.out.println("예금 금액 : "+j);
		*/
		
	
		// 1~1000까지 합 3의 배수 제외, 3의배수면서 5의 배수 제외 X
		
	/*	int i=0;
		int sum=0;
		int sum1=0;
		for(i=1; i<=1000; i++) {
			sum = sum + i;
			if(i%3 == 0 && i%5 != 0) {
			sum1 = sum1+i;
			}
		}
		sum = sum-sum1;
		System.out.println("합 : "+sum);
		*/
		
		// 1부터 시작해 홀수의 합을 구하면서 그합이 10000을 넘지 않는 마지막 수
		
		/*int i=0;
		int sum=0;		
		for(i=1; sum<10000; i++) {
			if(i%2 == 0) {
			continue;
			}
			sum = sum+i;
		}
		i--;
		System.out.println("마지막 수 : "+i);
		*/
		
		
	/*	int i=0;
		int j=0;
		int sum=0;
		for(i=1;i<=1000;i++) {
			if(i%3 == 0 && i%5 != 0) {
				continue;
			}
			sum = sum+i;
		}System.out.println("합 : "+sum);
		*/
		
	/*	int i=0;
		int sum=0;
		for(i=1;sum<10000;i++) {
			if(i%2 == 1) {
				sum= sum+i;
			}
		}
		i--;
		System.out.println("수 : "+i);
		*/
		
		
		int i=1, sum=0;
		for(;sum<10000;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}i--;
		System.out.println(i+" : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
