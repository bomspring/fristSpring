
public class Student {

	private String name;
	private int age;
	private boolean M;
	private String addrese;
	private String phone;
	
	public Student() {
		
	}
	public Student(String name, int age, boolean M, String addrese, String phone) {
		this.name = name;
		this.age = age;
		this.M = M;
		this.addrese = addrese;
		this.phone = phone;
	}
	

	
	
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
	public boolean isMan() {
		return M;
	}
	public void setMan(boolean M) {
		this.M = M;
	}
	public String getAddrese() {
		return addrese;
	}
	public void setAddrese(String addrese) {
		this.addrese = addrese;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void print() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		if (M) {
			System.out.println("����: " + "����");
		}
		else {
			System.out.println("����: " + "����");
		}
		System.out.println("�ּ�: " + addrese);
		System.out.println("��ȭ: " + phone);
	}
}

//public String getname() {
//return name;
//}
//public void setname(String setname) {
//return ;
//}
//public int getage() {
//return age;
//}
//public void setage(int setage) {
//return ;
//}
//public boolean getisMan() {
//return isMan;
//}
//public void setisMan(boolean isMan) {
//return ;
//}
//public String getaddrese() {
//return addrese;
//}
//public void setaddrese(String addrese) {
//return ;
//}
//public String getphone() {
//return phone;
//}
//public void setphone(String phone) {
//return ;
//}







//public String getname() {
//return name;
//}
//public void setname(String setname) {
//return ;
//}
//

