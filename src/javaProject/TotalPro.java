package javaProject;

import java.util.*;

public class TotalPro {

	public static void main(String[] args) {
		
		ManagerProgram pro = new ManagerProgram();
		//로그인할 아이디 입력
		int id = pro.showLoginMenu();
		//그 아이디가 어떤 타입인지
		int type = pro.login(id);
		
		switch(type) {
		case ManagerProgram.TYPE_STUDENT:
			//학생의 메뉴 보여줘야 됨
			pro.showMenu(type);
			
			int input;
			Scanner
			if(input == 1) {
				pro.addClass()
			}else if(input == 2) {
				pro.modifyStudent();
			}
			break;
		case ManagerProgram.TYPE_PRO:
			
			break;
		case ManagerProgram.TYPE_ADMIN:
			
			break;
		default
			
			break;
		}
		
	}

}
