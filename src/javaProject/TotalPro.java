package javaProject;

import java.util.*;

public class TotalPro {

	public static void main(String[] args) {
		
		ManagerProgram pro = new ManagerProgram();
		//�α����� ���̵� �Է�
		int id = pro.showLoginMenu();
		//�� ���̵� � Ÿ������
		int type = pro.login(id);
		
		switch(type) {
		case ManagerProgram.TYPE_STUDENT:
			//�л��� �޴� ������� ��
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
