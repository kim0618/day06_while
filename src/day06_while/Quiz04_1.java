package day06_while;

import java.util.Scanner;

public class Quiz04_1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	/*String saveid=null,savepw=null,newid=null,newpw=null;
	int a;
	while(true) {
		System.out.println("1.�α���");
		System.out.println("2.ȸ������");
		System.out.println("3.������");
		System.out.println(">>> ");
		a=scan.nextInt();
		if(a == 3) {
			System.out.println("���α׷� ����");
			break;
		}
		switch(a) {
		case 1:
			System.out.println("���̵� �Է� : ");
			newid = scan.next();
			System.out.println("��й�ȣ �Է� : ");
			newpw = scan.next();
			if(newid.equals(saveid) && newpw.equals(newpw)) {
				System.out.println("���� ���� ! ! ");
				break;
			}else {
				System.out.println("���� ���� ~ ~");
				break;
			}
		case 2:
			System.out.println("������ ���̵� : ");
			saveid=scan.next();
			System.out.println("������ ��й�ȣ : ");
			savepw=scan.next();
			System.out.println("���� �Ϸ� !");
		}
		System.out.println("���α׷� ����");
		}
		*/
		
		
	/*	String saveid=null,savepw=null,newid=null,newpw=null;
		int a;
		while(true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.println(">>> ");
			a=scan.nextInt();
			if(a == 3) {
				System.out.println("�ý��� ����");
				break;
			}
			switch(a) {
			case 1:
				System.out.println("���̵� : ");
				newid=scan.next();
				System.out.println("��й�ȣ : ");
				newpw=scan.next();
				if(newid.equals(saveid) && newpw.equals(savepw)) {
					System.out.println("���� ����");break;
				}else {
					System.out.println("���� �ǻu����������");break;
				}
			case 2:
				System.out.println("������ ���̵� : ");
				saveid = scan.next();
				System.out.println("������ ��й�ȣ : ");
				savepw = scan.next();
				System.out.println("���� �Ϸ� !!!");
			}
		}*/
		
		int money;
		int a=0;
		System.out.println("����� �����ϼ��� >>> ");
		money = scan.nextInt();
		for(;;) {
			System.out.println("1.Ŀ��(200)\t2.���ھ�(250)\t3.��ȯ 4.����");
			System.out.println("�޴��� �����ϼ��� >>> ");
			a=scan.nextInt();
			if((a == 1 && money<200) || (a==2 &&  money<250)) {
				System.out.println("����� �����մϴ�.");
			}else if(a == 1) {
				System.out.println("���ְ� �弼��");
				money = money-200;
			}else if(a == 2) {
				System.out.println("���ְ� �弼��");
				money = money-250;
			}
			else if(a == 3) {
				System.out.println("�Ž����� : "+money);
				money = 0;
			}else {
				System.out.println("���α׷� ����");
				break;
			}
		}
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
