package day06_while;

import java.util.Scanner;

public class Quiz04_1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	/*String saveid=null,savepw=null,newid=null,newpw=null;
	int a;
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.나가기");
		System.out.println(">>> ");
		a=scan.nextInt();
		if(a == 3) {
			System.out.println("프로그램 종료");
			break;
		}
		switch(a) {
		case 1:
			System.out.println("아이디 입력 : ");
			newid = scan.next();
			System.out.println("비밀번호 입력 : ");
			newpw = scan.next();
			if(newid.equals(saveid) && newpw.equals(newpw)) {
				System.out.println("인증 성공 ! ! ");
				break;
			}else {
				System.out.println("인증 실패 ~ ~");
				break;
			}
		case 2:
			System.out.println("저장할 아이디 : ");
			saveid=scan.next();
			System.out.println("저장할 비밀번호 : ");
			savepw=scan.next();
			System.out.println("가입 완료 !");
		}
		System.out.println("프로그램 종료");
		}
		*/
		
		
	/*	String saveid=null,savepw=null,newid=null,newpw=null;
		int a;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.println(">>> ");
			a=scan.nextInt();
			if(a == 3) {
				System.out.println("시스템 종료");
				break;
			}
			switch(a) {
			case 1:
				System.out.println("아이디 : ");
				newid=scan.next();
				System.out.println("비밀번호 : ");
				newpw=scan.next();
				if(newid.equals(saveid) && newpw.equals(savepw)) {
					System.out.println("인증 성공");break;
				}else {
					System.out.println("인증 실퍂ㅍㅍㅍㅍㅍ");break;
				}
			case 2:
				System.out.println("저장할 아이디 : ");
				saveid = scan.next();
				System.out.println("저장할 비밀번호 : ");
				savepw = scan.next();
				System.out.println("가입 완료 !!!");
			}
		}*/
		
		int money;
		int a=0;
		System.out.println("요금을 투입하세요 >>> ");
		money = scan.nextInt();
		for(;;) {
			System.out.println("1.커피(200)\t2.코코아(250)\t3.반환 4.종료");
			System.out.println("메뉴를 선택하세요 >>> ");
			a=scan.nextInt();
			if((a == 1 && money<200) || (a==2 &&  money<250)) {
				System.out.println("요금이 부족합니다.");
			}else if(a == 1) {
				System.out.println("맛있게 드세요");
				money = money-200;
			}else if(a == 2) {
				System.out.println("맛있게 드세요");
				money = money-250;
			}
			else if(a == 3) {
				System.out.println("거스름돈 : "+money);
				money = 0;
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
