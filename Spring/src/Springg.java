import java.util.Scanner;

public class Springg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Student stu1 = new Student("신경춘", 27, true, "부산", "010" );
		stu1.print();
		
//		String str1 = "abcd가";
////		String str = "01234"
//		String str = "ABCD가";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(3));
//		System.out.println(str.compareTo("ABCD나"));
//		System.out.println(str.concat("나다라"));
//		System.out.println(str.equals("ABCD나"));
//		System.out.println(str.equalsIgnoreCase("aBcd가"));
//		System.out.println(str1.isEmpty());
//		System.out.println(str.length());
//		System.out.println(str.replace("ABCD가", "ACBD나"));
//		System.out.println(str.toLowerCase());
//		System.out.println(str1.toUpperCase());
//		System.out.println(str.substring(0, 4));
////		System.out.println(str.substring(beginIndex, endIndex));
		
		String date = "2018-01-17";
//		"2018년 01월 17일"
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
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
//		stu1.setAge(27);
//		stu1.setName("신");
//		stu1.print();
	}

}
