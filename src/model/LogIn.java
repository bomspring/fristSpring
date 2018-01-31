package model;

import java.util.*;

public class LogIn {
	//로그인한 입력값을 받은 뒤 비교
	public int inputID(int log) {
		if(log == 920914) {
			System.out.println("관리자로 로그인 되었습니다.");
			//어드민 메뉴 메소드 호출
			Admin admin = new Admin();
			admin.AdminMenu();
			//어드민 메뉴 선택
			Scanner input = new Scanner(System.in);
			int inputAdminMenu = input.nextInt();
			//스위치문으로 번호 선택
			switch(inputAdminMenu) {
			case 1: //학생 추가
				
				break;
			case 2: //교수 추가
				
				break;
			case 3: //학생 삭제
				
				break;
			case 4: //교수 삭제
				
				break;
			case 5: //학생 찾기
				
				break;
			case 6: //교수 찾기
				
				break;
			case 7: //모든 학생 정보
				
				break;
			case 8: //모든 교수 정보
				
				break;
				
			}
		}
		return log;
		
	}
}
