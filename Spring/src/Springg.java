import java.util.Scanner;

public class Springg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Student stu1 = new Student("�Ű���", 27, true, "�λ�", "010" );
		stu1.print();
		
//		String str1 = "abcd��";
////		String str = "01234"
//		String str = "ABCD��";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(3));
//		System.out.println(str.compareTo("ABCD��"));
//		System.out.println(str.concat("���ٶ�"));
//		System.out.println(str.equals("ABCD��"));
//		System.out.println(str.equalsIgnoreCase("aBcd��"));
//		System.out.println(str1.isEmpty());
//		System.out.println(str.length());
//		System.out.println(str.replace("ABCD��", "ACBD��"));
//		System.out.println(str.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str.substring(0, 4));
////		System.out.println(str.substring(beginIndex, endIndex));
		
		String date = "2018-01-17";
//		"2018�� 01�� 17��"
//		String temp = date.substring(5, date.length());
//		System.out.println(temp);
//		temp = temp.replace("-", "");
//		System.out.println(temp);
//		int value = Integer.parseInt(temp);
//		System.out.println(value);
		
		String temp = date.replaceAll("-", "");
		System.out.println(temp);
		String year = temp.substring(0, 4);
		System.out.println(year);
		String month = temp.substring(4,6);
		System.out.println(month);
		String day = temp.substring(6,8);
		System.out.println(day);
		System.out.println(year+"�� "+month+"�� "+day+"��");
		
//		stu1.setAge(27);
//		stu1.setName("��");
//		stu1.print();
	}

}
