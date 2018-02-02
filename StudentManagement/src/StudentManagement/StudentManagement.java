package StudentManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
			if (input.equals("0")){
			   	System.out.println("프로그램을 종료합니다.");
			   	break;
			}if (input.equals("1")) {
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
//			}
//			if (input.equals("6")) {
//			   	findPro();
//			}if (input.equals("7")) {
//			   	removePro();
//			}if (input.equals("8")) {
//				modifyPro();
//			}
			if (input.equals("6")) {
				ModifyStuSbject();
			}if (input.equals("7")) {
			    StuAllP();
			}if (input.equals("8")) {
			    outPutStu();
			}
//			if (input.equals("8")) {
//			    ProAllP();
//			}
			if (input.equals("9")){
			   	Credit();
			}
		}
//	}catch(Exception e) {
//		System.out.println("0 - 9 사이의 정수를 입력해 주세요.");
//	}
	}
	
	public void menuPrint() {
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("      메뉴");
		System.out.println("--------------------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 찾기");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 과목 등록");
//		System.out.println("4. 교수 추가");
//		System.out.println("6. 교수 찾기");
//		System.out.println("7. 교수 삭제");
//		System.out.println("8. 교수 정보 수정");
		System.out.println("6. 학생 과목 정보 삭제");
		System.out.println("7. 모든 학생 정보 출력");
		System.out.println("8. 학생 정보 파일 출력");
		System.out.println("9. 개발자");
		System.out.println("0. 프로그램 종료");
		System.out.println("--------------------");
		System.out.println("원하는 숫자를 입력해주세요.");
	}
	//11111 학생 추가
	public void addStu() {
		 File inputStuFile = new File("C:\\Users\\BomSeol\\Desktop\\JAVA_Porject", "학생.txt");//파일을 불러올 주소 , 파일 명
	
		 //파일 읽기
		 BufferedReader br = null;
	        try {
	        		br = new BufferedReader(new FileReader(inputStuFile));
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
	        			Student stu = new Student(tokenArray.get(0), age, tokenArray.get(2), "없음", "없음");
	        			//stuarray에 정보 저장
	        			stuarray.add(stu);
	        			
	        			
//	        			Map<, Student> stMap = new HashMap<String, Student>();
	            	
	        			System.out.println("학생이 등록되었습니다.");
	            	
	        		}
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (NumberFormatException e){
	        	System.out.println("폴더 안 나이를 숫자로 입력해 주세요.");
	        }finally {
	            if(br != null) try {br.close(); } catch (IOException e) {}
	        }
	}
	//22222 학생 찾기
	public void findStu() {
		try {
			System.out.println("찾을 학생 이름을 입력하세요 : ");
			String name = sc.next();
			
				
			for (int i = 0; i <= stuarray.size(); i++) {
				  
				if (stuarray.get(i).getName().equals(name)) {
					System.out.println("찾으시는 학생 자료 : ");
					System.out.println(stuarray.get(i).getName() + " 학생, " + stuarray.get(i).getAge() + " 살, 폰번호_" + stuarray.get(i).getNumber() +" , 수강 과목은: 1." + stuarray.get(i).getSub1() + ", 2." + stuarray.get(i).getSub2() + " 입니다.");
					System.out.println("메뉴로 돌아갑니다.");
					break;
				}
			}
		}catch (Exception e) { //i <=stuarray.size(); 에러
			System.out.println("찾으시는 학생 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
		}
	}
	//33333 학생 삭제
	public void removeStu() {
		try {
			System.out.println("삭제할 학생 이름을 입력하세요 : ");
			String name = sc.next();
			
			
			for (int i = 0; i <= stuarray.size(); i++) {
				 
				if (stuarray.get(i).getName().equals(name)) {
					stuarray.remove(i);
					System.out.println(name + " 학생 자료가 삭제 되었습니다.");
					break;
				}
			}
		}catch (Exception e) {
			System.out.println("삭제할 학생 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
		}
	}
	//44444 학생 정보 수정
	public void modifyStu() {
		try {
			System.out.println("정보를 수정할 학생 이름을 입력하세요 : ");
			String name = sc.next();
			
			
			for (int i = 0; i <= stuarray.size(); i++) {
				
				if (stuarray.get(i).getName().equals(name)) {
					
					System.out.println("수정할 학생의 정보는 : " + stuarray.get(i).getName() + " 학생, " + stuarray.get(i).getAge() + " 살, 폰번호_" + stuarray.get(i).getNumber() + " 입니다.");
					System.out.println(name + "학생의 정보를 수정합니다.");
					
					System.out.println("변경할 이름을 입력하세요.");
					String modifyname = sc.next();
					System.out.println("변경할 나이를 입력하세요.");
					int age = sc.nextInt();
					System.out.println("변경할 번호를 입력하세요.");
					String ph = sc.next();
					//stuarray에 수정한 정보 삽입
					stuarray.get(i).setName(modifyname);
					stuarray.get(i).setAge(age);
					stuarray.get(i).setNumber(ph);
					System.out.println(stuarray.get(i).getName() + " 학생의 나이와 번호가 변경되었습니다.");
					System.out.println("메뉴로 돌아갑니다.");
					break;
				}
			}
		}catch (Exception e) {
			System.out.println("정보를 수정할 학생이 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
		}
	}
	//55555 학생 과목 등록
	public void addSubjToStu() {
		
//		Map<Student, String> stuSBJ = new HashMap();
//		
//		System.out.println("수강 과목을 등록할 학생 이름을 입력하세요.");
//		String name = sc.next();
//		Student findStudent = null;
//		
//		for(int i = 0; i < stuarray.size(); i++) {
//			if(findStudent == null) {
//				System.out.println(name + "학생의 정보가 없습니다.");
//				break;
//			}
//			if(stuarray.get(i).getName().equals(name)) {
//				findStudent = stuarray.get(i);
//				
//				System.out.println(name + "학생의 현재 수강 과목은" + findStudent.getSub1() + ", " + findStudent.getSub2() + " 과목입니다.");
//				System.out.println("첫 번째 수강할 과목 번호를 입력해 주세요. ( 1.C++   2.JAVA   3.Python )");
//				int num1 = sc.nextInt();
//				System.out.println("두 번째 수강할 과목 번호를 입력해 주세요. ( 1.C++   2.JAVA   3.Python )");
//				int num2 = sc.nextInt();
//				
//				if()
//			}
//		}
		
		
		
		
		
		boolean Compare = true;
		
		try {
			System.out.println("수강 과목을 등록할 학생 이름을 입력하세요.");
			String name = sc.next();
			Student findStudent = null;
			for (int i = 0; i < stuarray.size(); i++) {
					  
				if (stuarray.get(i).getName().equals(name)) {
					findStudent = stuarray.get(i);
					
					System.out.println(name + "학생의 현재 수강 과목은 " + findStudent.getSub1() + ", " + findStudent.getSub2() + " 과목입니다.");
					System.out.println("추가 수강할 과목 번호를 입력해 주세요. ( 1.C++   2.JAVA   3.Python )");
					int num = sc.nextInt();
					
						do {
						do {
							
							switch(num) {
							
							case 1:{//C++강의 추가
								if(findStudent.getSub1().equals("없음")) {
									//첫 번 째 과목이 비어있을 때 실행
									String sub1 = "C++";
									
									if(findStudent.getSub2().equals("C++")) {
										System.out.println("이미 등록되어 있는 과목입니다.");
										break;
									}
									
									findStudent.setSub1(sub1);
									System.out.println("첫 번째 수강 과목이 등록되었습니다.");
								}else if(findStudent.getSub2().equals("없음")) {
									//두 번 쨰 과목이 비어있을 때 실행
									String sub2 = "C++";
									
									if(findStudent.getSub1().equals("C++")) {
										System.out.println("이미 등록되어 있는 과목입니다.");
										break;
									}
									
									findStudent.setSub2(sub2);
									System.out.println("두 번째 수강 과목이 등록되었습니다.");
								}else {
									//두 과목이 모두 차있을 때 실행
									System.out.println("동시에 수강할 수 있는 과목은 2개 입니다.");
								}
								Compare = false;
								break;
							}case 2:{//JAVA강의 추가
								if(findStudent.getSub1().equals("없음")) {
									//첫 번 째 과목이 비어있을 때 실행
									String sub1 = "JAVA";
									
									if(findStudent.getSub2().equals("JAVA")) {
										System.out.println("이미 등록되어 있는 과목입니다.");
										break;
									}
									
									findStudent.setSub1(sub1);
									System.out.println("첫 번째 수강 과목이 등록되었습니다.");
								}else if(findStudent.getSub2().equals("없음")) {
									//두 번 쨰 과목이 비어있을 때 실행
									String sub2 = "JAVA";
									
									if(findStudent.getSub1().equals("JAVA")) {
										System.out.println("이미 등록되어 있는 과목입니다.");
										break;
									}
									
									findStudent.setSub2(sub2);
									System.out.println("두 번쨰 수강 과목이 등록되었습니다.");
								}else {
									//두 과목이 모두 차있을 때 실행
									System.out.println("동시에 수강할 수 있는 과목은 2개 입니다.");
								}
								Compare = false;
								break;
							}case 3:{//Python강의 추가
								if(findStudent.getSub1().equals("없음")) {
									//첫 번 째 과목이 비어있을 때 실행
									String sub1 = "Python";
									
									if(findStudent.getSub2().equals("Python")) {
										System.out.println("이미 등록되어 있는 과목입니다.");
										break;
									}
									
									findStudent.setSub1(sub1);
									System.out.println("첫 번째 수강 과목이 등록되었습니다.");
								}else if(findStudent.getSub2().equals("없음")) {
									//두 번 쨰 과목이 비어있을 때 실행
									String sub2 = "Python";
									
									if(findStudent.getSub1().equals("Python")) {
										System.out.println("이미 등록되어 있는 과목입니다.");
										break;
									}
									
									findStudent.setSub2(sub2);
									System.out.println("두 번째수강 과목이 등록되었습니다.");
								}else {
									//두 과목이 모두 차있을 때 실행
									System.out.println("동시에 수강할 수 있는 과목은 2개 입니다.");
								}
								Compare = false;
								break;
							}
							
							}
							
						}while(num>3);
						}while(num<1);
					
				}else if(findStudent == null) {
						System.out.println("학생 정보가 존재하지 않습니다.");
						break;
				}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("1 - 3 사이의 정수를 입력해 주세요.");
			Compare = true;
		}
	}
	//66666 학생 과목 정보 삭제
	public void ModifyStuSbject() {
		
		try {
				
			System.out.println("수강 과목을 삭제할 학생 이름을 입력해주세요.");
			String name = sc.next();
			Student findStudent = null;
			
			
			for(int i = 0; i < stuarray.size(); i++) {//<=의 찾는 정보가 없습니다 출력
				
				if(stuarray.get(i).getName().equals(name)) {
					findStudent = stuarray.get(i);
					
					System.out.println(name + "학생의 현재 수강 과목은  1." + findStudent.getSub1() + ", 2." + findStudent.getSub2() + " 과목입니다.");
					System.out.println("삭제할 과목의 번호를 입력해 주세요.");
					int inputModifySbject = sc.nextInt();
					
					do {
					do {
						
						switch(inputModifySbject) {
						
						case 1:
							findStudent.setSub1("없음");
							System.out.println("첫 번쨰 수강 과목의 정보가 지워졌습니다.");
							break;
						case 2:
							findStudent.setSub2("없음");
							System.out.println("두 번째 수강 과목의 정보가 지워졌습니다.");
							break;
						}
						
					}while(inputModifySbject > 2);
					}while(inputModifySbject < 1);
					
				}else if(findStudent == null) {
					System.out.println("학생 정보가 존재하지 않습니다.");
					break;
				}
				
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("숫자를 올바르게 입력해주세요. (1, 2)");
		}
		
	}
	//77777 모든 학생 정보 출력
	public void StuAllP() {
		System.out.println("모든 학생의 정보를 출력합니다.");
		
		for (int i = 0; i < stuarray.size(); i++) {
			System.out.println("====================");
			System.out.println( stuarray.get(i).getName() + " 학생. " + stuarray.get(i).getAge() + " 살. " + stuarray.get(i).getNumber() + " 번.");
		}
		  
	}
	//88888 학생 정보 파일 출력
	public void outPutStu() {
		System.out.println("정보를 출력할 학생 이름을 입력하세요.");
		String name = sc.next();
		Student findStudent = null;
		
		for(int i = 0; i < stuarray.size(); i++) {
			
			if(stuarray.get(i).getName().equals(name)) {
				findStudent = stuarray.get(i);
				//파일 쓰기
				File outputStuFile = new File("C:\\Users\\BomSeol\\Desktop\\JAVA_Porject", "학생출력.txt");
		        BufferedWriter bw = null;
		        try {
		            bw = new BufferedWriter(new FileWriter(outputStuFile));
		            bw.write(findStudent.getName() + "/" + findStudent.getAge() + "/" + findStudent.getNumber() + "/" + findStudent.getSub1() + "/" + findStudent.getSub2());
		            bw.flush();
		            System.out.println(name + "학생의 정보가 파일로 출력되었습니다.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }finally {
		            if(bw != null) try {bw.close(); } catch (IOException e) {}
		        }
		        
			}else if(findStudent == null) {
				System.out.println("학생 정보가 존재하지 않습니다.");
				break;
			}
			
		}
		
	}
	//99999 개발자
	public void Credit() {
		System.out.println("--------------------");
		System.out.println("     기획  및  개발       =   신 봄");
		System.out.println("개발에 도움을 주신 분 = '긍정노선생'님");
		System.out.println("     Powered by JAVA");
		System.out.println("--------------------");
	}
	
	//메소드
//	public void subjectCompare() {
//		if(stuarray.get(i).getsub1.equals(null)) {
//			//첫 번 째 과목이 비어있을 때 실행
//		}else if(stuarray.get(i).getsub2.equals(null)) {
//			//두 번 쨰 과목이 비어있을 때 실행
//		}else {
//			//두 과목이 모두 차있을 때 실행
//		}
//	}
}
