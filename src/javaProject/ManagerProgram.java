package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class ManagerProgram {
	public static final int TYPE_STUDENT = 1;
	public static final int TYPE_PRO = 2;
	public static final int TYPE_ADMIN = 3;

	private ArrayList<Student> studentArray;
	
	public ManagerProgram() {
		//file로부터 학생 정보를 가져와서 for문을 돌면서 arraylist에 저장
	}
	public int showLoginMenu() {
		System.out.println("로그인 할 ID를 입력하세요.");
		Scanner id = new Scanner(System.in);
		int log;
		return log = id.nextInt();
	}
	public int login() {
		int
		return
	}

}
