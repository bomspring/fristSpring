package StudentManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentManagement {

	
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> stuarray = new ArrayList<Student>();
	
	public void main() {
//		try {
		//반복문
		while(true) {
			//메뉴 목록 호출
			menuPrint();
			//선택문
			String input = sc.next();
			if (input.equals("1")) {
				addStu();
			}if (input.equals("2")) {
			   	findStu();
			}if (input.equals("3")) {
			   	removeStu();
			}if (input.equals("4")) {
				modifyStu();
			}if (input.equals("5")) {
				addSubjToStu();
			}
//			if (input.equals("4")) {
//			   	addPro();
//			}if (input.equals("5")) {
//			   	findPro();
//			}if (input.equals("6")) {
//			   	removePro();
//			}if (input.equals("7")) {
//			    StuAllP();
//			}if (input.equals("8")) {
//			    ProAllP();
//			}
			if (input.equals("9")){
			   	Credit();
			}if (input.equals("0")){
			   	System.out.println("프로그램을 종료합니다.");
			   	break;
			}
//			else {
//			   	System.out.println("0 - 9 사이의 정수를 입력해 주세요.");
//			}
		}
//	}catch(Exception e) {
//		System.out.println("0 - 9 사이의 정수를 입력해 주세요.");
//	}
	}
	
	public void menuPrint() {
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("      메뉴");
		System.out.println("----------------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 찾기");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 과목 등록");
//		System.out.println("4. 교수 추가");		// 교수 클레스는 미리 등록 후 강의 과목까지 지정해놓기
//		System.out.println("5. 교수 찾기");
//		System.out.println("6. 교수 삭제");
//		System.out.println("7. 모든 학생 정보 호출");
//		System.out.println("8. 모든 교수 정보 호출");
		System.out.println("9. 개발자");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------");
		System.out.println("원하는 숫자를 입력해주세요.");
	}
	//11111 학생 추가
	public void addStu() {
		 File StuFile = new File("C:\\Users\\201-01\\Desktop\\Java", "학생.txt");//파일을 불러올 주소 , 파일 명
	
		 //파일 읽기
		 BufferedReader br = null;
	        try {
	        		br = new BufferedReader(new FileReader(StuFile));
	        		String line;
	        		while ((line = br.readLine()) != null) {
	        			StringTokenizer st = new StringTokenizer(line);
	        		
//	        			System.out.println(st.countTokens()); //뜯어낸 String 갯수
	        			//tokenArray에 파일 내용을 뜯어서 String 로 저장
	        			ArrayList<String> tokenArray = new ArrayList<>();
	        			while(st.hasMoreTokens()) {
	        				tokenArray.add(st.nextToken());
	        			}
	        			//age가 int형이라서 Inter로 형 변환
	        			int age = Integer.parseInt(tokenArray.get(1));
	        			//순서대로 이름 나이 번호순으로 저장
	        			Student stu = new Student(tokenArray.get(0), age, tokenArray.get(2));
	        			//stuarray에 정보 저장
	        			stuarray.add(stu);
	            	
	        			System.out.println("학생이 등록되었습니다.");
	            	
	        		}
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(br != null) try {br.close(); } catch (IOException e) {}
	        }
	}
	//22222 학생 찾기
	public void findStu() {
		System.out.print(" 찾을 학생 이름을 입력하세요 : ");
		  String name = sc.next();
		  
		  for (int i = 0; i < stuarray.size(); i++) {
			  
			  if (stuarray.get(i).getName().equals(name)) {
				  System.out.print("찾으시는 학생 자료 : ");
				  System.out.println(stuarray.get(i).getName() + " 학생, " + stuarray.get(i).getAge() + " 살, 폰번호_" + stuarray.get(i).getNumber());
				  }
		  }
		//자료가 없을시 찾지못했습니다 출력 후 메뉴로 돌아가기
	}
	//33333 학생 삭제
	public void removeStu() {
		
	}
	//44444 학생 정보 수정
	public void modifyStu() {
		
	}
	//55555 학생 과목 등록
	public void addSubjToStu() {
		
	}
	//99999 개발자
	public void Credit() {
		
	}
	
}
