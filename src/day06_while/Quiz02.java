package day06_while;

public class Quiz02 {
	public static void main(String[] args) {
		//ù�� 1�� ����, ������ 2�辿 ���� 30��° ���� �ݾ��ؾ��ϴ�?
	/*	int j=1,sum=0;
		for(int i=1; i<=30; i++) {
		//	sum= sum+j;
			j+=i;
			j*=2;
			if(i == 30) {
				break;
			}
		}System.out.println("���� �ݾ� : "+j);
		*/
		
	
		// 1~1000���� �� 3�� ��� ����, 3�ǹ���鼭 5�� ��� ���� X
		
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
		System.out.println("�� : "+sum);
		*/
		
		// 1���� ������ Ȧ���� ���� ���ϸ鼭 ������ 10000�� ���� �ʴ� ������ ��
		
		/*int i=0;
		int sum=0;		
		for(i=1; sum<10000; i++) {
			if(i%2 == 0) {
			continue;
			}
			sum = sum+i;
		}
		i--;
		System.out.println("������ �� : "+i);
		*/
		
		
	/*	int i=0;
		int j=0;
		int sum=0;
		for(i=1;i<=1000;i++) {
			if(i%3 == 0 && i%5 != 0) {
				continue;
			}
			sum = sum+i;
		}System.out.println("�� : "+sum);
		*/
		
	/*	int i=0;
		int sum=0;
		for(i=1;sum<10000;i++) {
			if(i%2 == 1) {
				sum= sum+i;
			}
		}
		i--;
		System.out.println("�� : "+i);
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
