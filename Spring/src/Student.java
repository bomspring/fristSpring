
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
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		if (M) {
			System.out.println("성별: " + "남자");
		}
		else {
			System.out.println("성별: " + "여자");
		}
		System.out.println("주소: " + addrese);
		System.out.println("전화: " + phone);
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

