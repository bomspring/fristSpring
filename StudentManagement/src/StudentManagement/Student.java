package StudentManagement;

import java.util.*;

public class Student {
	//����
	private String name;
	private int age;
	private String number;
	private String sub1 = "����";
	private String sub2 = "����";
	//��������� ArrayList
	private ArrayList<String> subject = new ArrayList<>();
	
	//������
//	public Student(String name, int age, String number) {
//		this.name = name;
//		this.number = number;
//		this.age = age;
//	}
//	
//	public Student(String name, int age, String number, String sub1) {
//		this.name = name;
//		this.number = number;
//		this.age = age;
//		this.sub1 = sub1;
//	}
	
	public Student(String name, int age, String number, String sub1, String sub2) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.sub1 = sub1;
		this.sub2 = sub2;
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
	
	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	//�޼ҵ�
	public void sbjectprint() {
		System.out.print(sub1 + ", " + sub2);
	}
	
}
