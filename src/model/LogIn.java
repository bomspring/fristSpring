package model;

import java.util.*;

public class LogIn {
	//�α����� �Է°��� ���� �� ��
	public int inputID(int log) {
		if(log == 920914) {
			System.out.println("�����ڷ� �α��� �Ǿ����ϴ�.");
			//���� �޴� �޼ҵ� ȣ��
			Admin admin = new Admin();
			admin.AdminMenu();
			//���� �޴� ����
			Scanner input = new Scanner(System.in);
			int inputAdminMenu = input.nextInt();
			//����ġ������ ��ȣ ����
			switch(inputAdminMenu) {
			case 1: //�л� �߰�
				
				break;
			case 2: //���� �߰�
				
				break;
			case 3: //�л� ����
				
				break;
			case 4: //���� ����
				
				break;
			case 5: //�л� ã��
				
				break;
			case 6: //���� ã��
				
				break;
			case 7: //��� �л� ����
				
				break;
			case 8: //��� ���� ����
				
				break;
				
			}
		}
		return log;
		
	}
}
