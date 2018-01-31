package StudentManagement;

import java.util.*;

public class Professor {
	//변수
	private String name;
	private String number;
	private int age;
	//강의과목울 ArrayList
	private ArrayList<String> subject = new ArrayList<>();
	
	//생성자
	public Professor(String name, int age, String number) {
//		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	//접근자 설정자
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
	//메소드
	
	
}
