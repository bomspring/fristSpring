package model;

import java.util.*;

public class Management {

	public static void main(String[] args) {
		
		//�ʵ�
		Scanner input = new Scanner(System.in);
		
		//�α��� �޼ҵ� ȣ��
		System.out.println("�α������ּ���.");
		int log = input.nextInt();
		LogIn login = new LogIn();
		//�α��� �� �� �Է� �� ��
		login.inputID(log);
		
		
	}

}
