package StudentManagement;

import java.util.*;

public class Professor {
	//����
	private String name;
	private String number;
	private int age;
	//���ǰ���� ArrayList
	private ArrayList<String> subject = new ArrayList<>();
	
	//������
	public Professor(String name, int age, String number) {
//		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	//������ ������
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
		
	//�޼ҵ�
	
	
}
