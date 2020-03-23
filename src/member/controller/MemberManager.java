package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0;
	private Scanner sc = new Scanner(System.in);
	
	public void insertMember() {
		
		
			System.out.print("아이디를 입력하세요 : ");
			String userId = sc.next();
			System.out.print("패스워드를 입력하세요 : ");
			String userPwd = sc.next();
			System.out.print("이름을 입력하세요 : ");
			String userName = sc.next();
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			System.out.print("성별을 입력하세요 : ");
			char gender = sc.next().charAt(0);
			System.out.print("이메일을 입력하세요 : ");
			String email = sc.next();
			
			
			m[ctn] = new Member(userId, userPwd, userName, age, gender, email);
			ctn++;
			System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		}
		
		 
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String userId = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(userId.equals(m[i].getUserId())) {
				printOne(m[i]);
				return;
			} else if(userId.equals(null)){
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
			} 
		} 
	
	}
	
	public void searchName() {
		System.out.println("검색할 이름을 입력하세요 : ");
		String userName = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(userName.equals(m[i].getUserName())) {
				System.out.println("찾은 이름 : " + m[i].getUserName()); return;
			} else if(userName.equals(null)){
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
			}
		}
	}
	
	public void serachEmail() {
		System.out.println("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(email.equals(m[i].getEmail())) {
				System.out.println("찾은 이메일 : " + m[i].getEmail()); return;
			} else if(email.equals(null)) {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
			}
		}
	}
	
	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String editId = sc.next();
		System.out.print("변경할 비밀번호를 입력하세요 : ");
		String editPwd = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(editId.equals(m[i].getUserId())) {
				m[i].setUserPwd(editPwd);
				System.out.println("패스워드 수정이 완료되었습니다."); return;
			} else if (editId.equals(null)){
				System.out.println("수정할 회원이 존재하지 않습니다."); return;
			}
		}
		
	}
	
	public void updateName() {
		System.out.print("수정할 회원의 이름을 입력하세요 : ");
		String editName = sc.next();
		System.out.print("변경할 비밀번호를 입력하세요 : ");
		String editPwd = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(editName.equals(m[i].getUserName())) {
				m[i].setUserPwd(editPwd);
				System.out.println("패스워드 수정이 완료되었습니다."); return;
			} else if(editName.equals(null)) {
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}
	}
	
	public void updateEmail() {
		System.out.print("수정할 회원의 이메일을 입력하세요 : ");
		String editEmail = sc.next();
		System.out.println("변경할 비밀번호를 입력하세요 : ");
		String editPwd = sc.next();
		for(int i = 0; i < ctn; i++) {
			if(editEmail.equals(m[i].getEmail())) {
				m[i].setUserPwd(editPwd);
				System.out.println("패스워드 수정이 완료되었습니다."); return;
			} else if(editEmail.equals(null)){
				System.out.println("수정할 회원이 존재하지 않습니다.");
			}
		}
	}
	
	public void deleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
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
				System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
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
			System.out.println("아이디 : " + m[i].getUserId());
			System.out.println("비밀번호 : " + m[i].getUserPwd());
			System.out.println("이름 : " + m[i].getUserName());
			System.out.println("나이 : " + m[i].getAge());
			System.out.println("성별 : " + m[i].getGender());
			System.out.println("이메일 : " + m[i].getEmail());
			
		}
		
	}
	
	public void printOne(Member m) {
		System.out.println("찾은 아이디 : " + m.getUserId());
	}
}
