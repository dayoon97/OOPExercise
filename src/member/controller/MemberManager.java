package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void insertMember() {
		
		
			System.out.print("���̵� �Է��ϼ��� : ");
			String userId = sc.next();
			System.out.print("�н����带 �Է��ϼ��� : ");
			String userPwd = sc.next();
			System.out.print("�̸��� �Է��ϼ��� : ");
			String userName = sc.next();
			System.out.print("���̸� �Է��ϼ��� : ");
			int age = sc.nextInt();
			System.out.print("������ �Է��ϼ��� : ");
			char gender = sc.next().charAt(0);
			System.out.print("�̸����� �Է��ϼ��� : ");
			String email = sc.next();
			
			
			m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
			ctn++;
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		}
		
		 
	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(m[i].getUserId())) {
				printOne(m[i]);
				return;
			} else if(userId.equals(null)){
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			} 
		} 
	
	}
	
	public void searchName() {
		System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
		String userName = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(userName.equals(m[i].getUserName())) {
				System.out.println("ã�� �̸� : " + m[i].getUserName()); return;
			} else if(userName.equals(null)){
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
	}
	
	public void serachEmail() {
		System.out.println("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(email.equals(m[i].getEmail())) {
				System.out.println("ã�� �̸��� : " + m[i].getEmail()); return;
			} else if(email.equals(null)) {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
			}
		}
	}
	
	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String editId = sc.next();
		System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
		String editPwd = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(editId.equals(m[i].getUserId())) {
				m[i].setUserPwd(editPwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�."); return;
			} else if (editId.equals(null)){
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�."); return;
			}
		}
		
	}
	
	public void updateName() {
		System.out.print("������ ȸ���� �̸��� �Է��ϼ��� : ");
		String editName = sc.next();
		System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
		String editPwd = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(editName.equals(m[i].getUserName())) {
				m[i].setUserPwd(editPwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�."); return;
			} else if(editName.equals(null)) {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void updateEmail() {
		System.out.print("������ ȸ���� �̸����� �Է��ϼ��� : ");
		String editEmail = sc.next();
		System.out.println("������ ��й�ȣ�� �Է��ϼ��� : ");
		String editPwd = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(editEmail.equals(m[i].getEmail())) {
				m[i].setUserPwd(editPwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�."); return;
			} else if(editEmail.equals(null)){
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void deleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String dropId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(dropId.equals(m[i].getUserId())) {
					if(i == ctn-1) {
						return;
				}
				m[i] = m[i+1];					
				ctn--;
				break;
			} else if(dropId.equals(null)){
				System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
			}
		}
	}
	
	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);
			m[i].setGender('\u0000');
			m[i].setAge(0);
			m[i].setEmail(null);
			
			
		} ctn = 0;
		
		
	}
	
	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println("���̵� : " + m[i].getUserId());
			System.out.println("��й�ȣ : " + m[i].getUserPwd());
			System.out.println("�̸� : " + m[i].getUserName());
			System.out.println("���� : " + m[i].getAge());
			System.out.println("���� : " + m[i].getGender());
			System.out.println("�̸��� : " + m[i].getEmail());
			
		}
		
	}
	
	public void printOne(Member m) {
		System.out.println("ã�� ���̵� : " + m.getUserId());
	}
}
