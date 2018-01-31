package source;

import java.util.*;

public class StudentManagement{
	private ArrayList<Student> studentArray = new ArrayList<Student>();
	private int currentNumber; //���� ����� �л��� ��ϵǾ� �ִ��� ����
	
	
	public void addStudent() {
		System.out.println("�л��� ������ �Է��� �ּ���.");
		//1. �л� �ϳ��� ���� ����
		Student student = new Student();
		//2. �л� ������ �Է� �޾Ƽ� 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л��� �̸�:");
		String name = scan.next();
		student.setName(name);
		
		System.out.print("�л��� ����:");
		int age = scan.nextInt();
		student.setAge(age);
		
		System.out.print("�л��� ����ȣ:");
		String phone = scan.next();
		student.setPhone(phone);
		
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
		
		Map<String, Student> stmap = new HashMap<String, Student>();
		stmap.put(student.setPhone(phone), new Student(name, age, phone));

		//�迭�� �л���ü�� ����
		studentArray.add(student);
		currentNumber++;
		System.out.println("���� ��" + currentNumber +" ���� �л��� ��ϵǾ� �ֽ��ϴ�.");
	}
	
}
class Student {
	//�ʵ�
	private String name;
	private int age;
	private String phone;
	//������
	public Student() {
		
	}
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	//������ , ������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public String setPhone(String phone) {
		this.phone = phone;
	}
	//�޼ҵ�
	public void print() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("��ȭ: " + phone);
	}
	
}
