package source;

import java.util.*;

public class StudentManagement{
	private ArrayList<Student> studentArray = new ArrayList<Student>();
	private int currentNumber; //현재 몇명의 학생이 등록되어 있는지 변수
	
	
	public void addStudent() {
		System.out.println("학생의 정보를 입력해 주세요.");
		//1. 학생 하나를 먼저 생성
		Student student = new Student();
		//2. 학생 정보를 입력 받아서 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생의 이름:");
		String name = scan.next();
		student.setName(name);
		
		System.out.print("학생의 나이:");
		int age = scan.nextInt();
		student.setAge(age);
		
		System.out.print("학생의 폰번호:");
		String phone = scan.next();
		student.setPhone(phone);
		
		System.out.println("입력이 완료 되었습니다.");
		
		Map<String, Student> stmap = new HashMap<String, Student>();
		stmap.put(student.setPhone(phone), new Student(name, age, phone));

		//배열에 학생객체를 대입
		studentArray.add(student);
		currentNumber++;
		System.out.println("현재 총" + currentNumber +" 명의 학생이 등록되어 있습니다.");
	}
	
}
class Student {
	//필드
	private String name;
	private int age;
	private String phone;
	//생성자
	public Student() {
		
	}
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	//접근자 , 설정자
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
	//메소드
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("전화: " + phone);
	}
	
}
