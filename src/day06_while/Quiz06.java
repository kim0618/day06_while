package day06_while;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 내 문제
		/*	for(int ww = 10; ww>0; ww--)
			{
				for(int qq = 1; qq<=ww; qq++)
				{
				System.out.print(qq);
			    }
				System.out.println();
			}
		*/
		
			//쥐 문제
	/*	int ri = 100000, mo=2,day;
		for(day=1;ri>0;day++) {
			ri= ri - mo*20;
			if(day%10 == 0) {
				mo*=2;
			}
		}day--;
		System.out.println(day+"일"+mo+"마리");
			*/
		
		// 4,6으로 나눠 1인거
	/*	int a=0,sum=0;
		for(a=1;a<1000;a++) {
			if(a%4==1 && a%6==1) {
			//	System.out.println(a+" ");
				sum+=a;
			}
		}System.out.println(sum);
			*/
			
		// 어떤 수의 공약수
	/*		int n1,n2=1;
			System.out.println("입력 : ");
			n1 = input.nextInt();
			while(true) {
				if(n1%n2==0) {
					System.out.println(n2+" ");
				}else if(n1==n2) {
					break;
				}n2++;
			}
			*/
		
		//두 수의 최소 공배수, 최대공약수 구하기
		/*	int a,b,max,min;
			System.out.println("두 수 입력 : ");
			a=input.nextInt();
			b=input.nextInt();
		*/
		
			int num1, num2, max=0, min=0, i=2;
			System.out.print("두 수 입력 : ");
			num1 = input.nextInt();
			num2 = input.nextInt();
			while(i<=num1&&i<=num2){
				if(num1%i==0&&num2%i==0)
						min=i;
					i++;
			}
			max=num1*num2/min;	//최소 공배수 구하는 식
			System.out.println("최소 공배수 : "+max);
			System.out.println("최대 공약수 : "+min);
			
			
			
			
			
			
			
			
	}
}
