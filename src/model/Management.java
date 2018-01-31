package model;

import java.util.*;

public class Management {

	public static void main(String[] args) {
		
		//필드
		Scanner input = new Scanner(System.in);
		
		//로그인 메소드 호출
		System.out.println("로그인해주세요.");
		int log = input.nextInt();
		LogIn login = new LogIn();
		//로그인 한 값 입력 및 비교
		login.inputID(log);
		
		
	}

}
