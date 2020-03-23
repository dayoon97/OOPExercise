package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	int num = 0;
	
	public void mainMenu() {
		
		do {
			System.out.println("==============ȸ�� ���� �޴�=============");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.println("=====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1 : mm.insertMember(); break;
			case 2 : searchMemberMenu(); break;
			case 3 : updateMemberMenu(); break;
			case 4 : deletememberMenu(); break;
			case 5 : mm.printAllMember(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
				
			}
			
			
		} while(true);
	}
	
	public void searchMemberMenu() {
		do {
			System.out.println("==============ȸ�� ���� �˻�=============");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("=====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");

			num = sc.nextInt();

			switch(num) {
			case 1 : mm.searchId(); break;
			case 2 : mm.searchName();break;
			case 3 : mm.serachEmail(); break;
			case 9 : System.out.println("���� �޴��� �̵��մϴ�."); return;
				
			}
		} while(true);
	}
	
	public void updateMemberMenu() {
		do {
			System.out.println("==============ȸ�� ���� ����=============");
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("9. ���θ޴���");
			System.out.println("=====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");

			num = sc.nextInt();
			
			switch(num) {
			case 1 : mm.updatePwd(); break;
			case 2 : mm.updateName(); break;
			case 3 : mm.updateEmail(); break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�."); return;
				
			}
			
		} while(true);
	}
	
	public void deletememberMenu() {
		do {
			System.out.println("==============ȸ�� ���� ����=============");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("9. ���θ޴���");
			System.out.println("=====================================");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			num = sc.nextInt();

			switch(num) {
			case 1 : mm.deleteOne(); break;
			case 2 : mm.deleteAll(); break;
			case 9 : System.out.println("���θ޴��� �̵��մϴ�."); return;
				
			}

		} while(true);
	}
	
}
