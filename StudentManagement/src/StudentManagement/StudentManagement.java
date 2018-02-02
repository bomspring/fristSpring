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
		//�ݺ���
		while(true) {
			//�޴� ��� ȣ��
			menuPrint();
			//���ù�
			String input = sc.next();
			if (input.equals("0")){
			   	System.out.println("���α׷��� �����մϴ�.");
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
//		System.out.println("0 - 9 ������ ������ �Է��� �ּ���.");
//	}
	}
	
	public void menuPrint() {
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.println("      �޴�");
		System.out.println("--------------------");
		System.out.println("1. �л� �߰�");
		System.out.println("2. �л� ã��");
		System.out.println("3. �л� ����");
		System.out.println("4. �л� ���� ����");
		System.out.println("5. �л� ���� ���");
//		System.out.println("4. ���� �߰�");
//		System.out.println("6. ���� ã��");
//		System.out.println("7. ���� ����");
//		System.out.println("8. ���� ���� ����");
		System.out.println("6. �л� ���� ���� ����");
		System.out.println("7. ��� �л� ���� ���");
		System.out.println("8. �л� ���� ���� ���");
		System.out.println("9. ������");
		System.out.println("0. ���α׷� ����");
		System.out.println("--------------------");
		System.out.println("���ϴ� ���ڸ� �Է����ּ���.");
	}
	//11111 �л� �߰�
	public void addStu() {
		 File inputStuFile = new File("C:\\Users\\BomSeol\\Desktop\\JAVA_Porject", "�л�.txt");//������ �ҷ��� �ּ� , ���� ��
	
		 //���� �б�
		 BufferedReader br = null;
	        try {
	        		br = new BufferedReader(new FileReader(inputStuFile));
	        		String line;
	        		while ((line = br.readLine()) != null) {
	        			StringTokenizer st = new StringTokenizer(line);
	        		
//	        			System.out.println(st.countTokens()); //�� String ����
	        			//tokenArray�� ���� ������ �� String �� ����
	        			ArrayList<String> tokenArray = new ArrayList<>();
	        			while(st.hasMoreTokens()) {
	        				tokenArray.add(st.nextToken());
	        			}
	        			//age�� int���̶� Inter�� �� ��ȯ
	        			int age = Integer.parseInt(tokenArray.get(1));
	        			//������� �̸� ���� ��ȣ������ ����
	        			Student stu = new Student(tokenArray.get(0), age, tokenArray.get(2), "����", "����");
	        			//stuarray�� ���� ����
	        			stuarray.add(stu);
	        			
	        			
//	        			Map<, Student> stMap = new HashMap<String, Student>();
	            	
	        			System.out.println("�л��� ��ϵǾ����ϴ�.");
	            	
	        		}
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (NumberFormatException e){
	        	System.out.println("���� �� ���̸� ���ڷ� �Է��� �ּ���.");
	        }finally {
	            if(br != null) try {br.close(); } catch (IOException e) {}
	        }
	}
	//22222 �л� ã��
	public void findStu() {
		try {
			System.out.println("ã�� �л� �̸��� �Է��ϼ��� : ");
			String name = sc.next();
			
				
			for (int i = 0; i <= stuarray.size(); i++) {
				  
				if (stuarray.get(i).getName().equals(name)) {
					System.out.println("ã���ô� �л� �ڷ� : ");
					System.out.println(stuarray.get(i).getName() + " �л�, " + stuarray.get(i).getAge() + " ��, ����ȣ_" + stuarray.get(i).getNumber() +" , ���� ������: 1." + stuarray.get(i).getSub1() + ", 2." + stuarray.get(i).getSub2() + " �Դϴ�.");
					System.out.println("�޴��� ���ư��ϴ�.");
					break;
				}
			}
		}catch (Exception e) { //i <=stuarray.size(); ����
			System.out.println("ã���ô� �л� ������ �������� �ʽ��ϴ�.");
			System.out.println("�޴��� ���ư��ϴ�.");
		}
	}
	//33333 �л� ����
	public void removeStu() {
		try {
			System.out.println("������ �л� �̸��� �Է��ϼ��� : ");
			String name = sc.next();
			
			
			for (int i = 0; i <= stuarray.size(); i++) {
				 
				if (stuarray.get(i).getName().equals(name)) {
					stuarray.remove(i);
					System.out.println(name + " �л� �ڷᰡ ���� �Ǿ����ϴ�.");
					break;
				}
			}
		}catch (Exception e) {
			System.out.println("������ �л� ������ �������� �ʽ��ϴ�.");
			System.out.println("�޴��� ���ư��ϴ�.");
		}
	}
	//44444 �л� ���� ����
	public void modifyStu() {
		try {
			System.out.println("������ ������ �л� �̸��� �Է��ϼ��� : ");
			String name = sc.next();
			
			
			for (int i = 0; i <= stuarray.size(); i++) {
				
				if (stuarray.get(i).getName().equals(name)) {
					
					System.out.println("������ �л��� ������ : " + stuarray.get(i).getName() + " �л�, " + stuarray.get(i).getAge() + " ��, ����ȣ_" + stuarray.get(i).getNumber() + " �Դϴ�.");
					System.out.println(name + "�л��� ������ �����մϴ�.");
					
					System.out.println("������ �̸��� �Է��ϼ���.");
					String modifyname = sc.next();
					System.out.println("������ ���̸� �Է��ϼ���.");
					int age = sc.nextInt();
					System.out.println("������ ��ȣ�� �Է��ϼ���.");
					String ph = sc.next();
					//stuarray�� ������ ���� ����
					stuarray.get(i).setName(modifyname);
					stuarray.get(i).setAge(age);
					stuarray.get(i).setNumber(ph);
					System.out.println(stuarray.get(i).getName() + " �л��� ���̿� ��ȣ�� ����Ǿ����ϴ�.");
					System.out.println("�޴��� ���ư��ϴ�.");
					break;
				}
			}
		}catch (Exception e) {
			System.out.println("������ ������ �л��� �������� �ʽ��ϴ�.");
			System.out.println("�޴��� ���ư��ϴ�.");
		}
	}
	//55555 �л� ���� ���
	public void addSubjToStu() {
		
//		Map<Student, String> stuSBJ = new HashMap();
//		
//		System.out.println("���� ������ ����� �л� �̸��� �Է��ϼ���.");
//		String name = sc.next();
//		Student findStudent = null;
//		
//		for(int i = 0; i < stuarray.size(); i++) {
//			if(findStudent == null) {
//				System.out.println(name + "�л��� ������ �����ϴ�.");
//				break;
//			}
//			if(stuarray.get(i).getName().equals(name)) {
//				findStudent = stuarray.get(i);
//				
//				System.out.println(name + "�л��� ���� ���� ������" + findStudent.getSub1() + ", " + findStudent.getSub2() + " �����Դϴ�.");
//				System.out.println("ù ��° ������ ���� ��ȣ�� �Է��� �ּ���. ( 1.C++   2.JAVA   3.Python )");
//				int num1 = sc.nextInt();
//				System.out.println("�� ��° ������ ���� ��ȣ�� �Է��� �ּ���. ( 1.C++   2.JAVA   3.Python )");
//				int num2 = sc.nextInt();
//				
//				if()
//			}
//		}
		
		
		
		
		
		boolean Compare = true;
		
		try {
			System.out.println("���� ������ ����� �л� �̸��� �Է��ϼ���.");
			String name = sc.next();
			Student findStudent = null;
			for (int i = 0; i < stuarray.size(); i++) {
					  
				if (stuarray.get(i).getName().equals(name)) {
					findStudent = stuarray.get(i);
					
					System.out.println(name + "�л��� ���� ���� ������ " + findStudent.getSub1() + ", " + findStudent.getSub2() + " �����Դϴ�.");
					System.out.println("�߰� ������ ���� ��ȣ�� �Է��� �ּ���. ( 1.C++   2.JAVA   3.Python )");
					int num = sc.nextInt();
					
						do {
						do {
							
							switch(num) {
							
							case 1:{//C++���� �߰�
								if(findStudent.getSub1().equals("����")) {
									//ù �� ° ������ ������� �� ����
									String sub1 = "C++";
									
									if(findStudent.getSub2().equals("C++")) {
										System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�.");
										break;
									}
									
									findStudent.setSub1(sub1);
									System.out.println("ù ��° ���� ������ ��ϵǾ����ϴ�.");
								}else if(findStudent.getSub2().equals("����")) {
									//�� �� �� ������ ������� �� ����
									String sub2 = "C++";
									
									if(findStudent.getSub1().equals("C++")) {
										System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�.");
										break;
									}
									
									findStudent.setSub2(sub2);
									System.out.println("�� ��° ���� ������ ��ϵǾ����ϴ�.");
								}else {
									//�� ������ ��� ������ �� ����
									System.out.println("���ÿ� ������ �� �ִ� ������ 2�� �Դϴ�.");
								}
								Compare = false;
								break;
							}case 2:{//JAVA���� �߰�
								if(findStudent.getSub1().equals("����")) {
									//ù �� ° ������ ������� �� ����
									String sub1 = "JAVA";
									
									if(findStudent.getSub2().equals("JAVA")) {
										System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�.");
										break;
									}
									
									findStudent.setSub1(sub1);
									System.out.println("ù ��° ���� ������ ��ϵǾ����ϴ�.");
								}else if(findStudent.getSub2().equals("����")) {
									//�� �� �� ������ ������� �� ����
									String sub2 = "JAVA";
									
									if(findStudent.getSub1().equals("JAVA")) {
										System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�.");
										break;
									}
									
									findStudent.setSub2(sub2);
									System.out.println("�� ���� ���� ������ ��ϵǾ����ϴ�.");
								}else {
									//�� ������ ��� ������ �� ����
									System.out.println("���ÿ� ������ �� �ִ� ������ 2�� �Դϴ�.");
								}
								Compare = false;
								break;
							}case 3:{//Python���� �߰�
								if(findStudent.getSub1().equals("����")) {
									//ù �� ° ������ ������� �� ����
									String sub1 = "Python";
									
									if(findStudent.getSub2().equals("Python")) {
										System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�.");
										break;
									}
									
									findStudent.setSub1(sub1);
									System.out.println("ù ��° ���� ������ ��ϵǾ����ϴ�.");
								}else if(findStudent.getSub2().equals("����")) {
									//�� �� �� ������ ������� �� ����
									String sub2 = "Python";
									
									if(findStudent.getSub1().equals("Python")) {
										System.out.println("�̹� ��ϵǾ� �ִ� �����Դϴ�.");
										break;
									}
									
									findStudent.setSub2(sub2);
									System.out.println("�� ��°���� ������ ��ϵǾ����ϴ�.");
								}else {
									//�� ������ ��� ������ �� ����
									System.out.println("���ÿ� ������ �� �ִ� ������ 2�� �Դϴ�.");
								}
								Compare = false;
								break;
							}
							
							}
							
						}while(num>3);
						}while(num<1);
					
				}else if(findStudent == null) {
						System.out.println("�л� ������ �������� �ʽ��ϴ�.");
						break;
				}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("1 - 3 ������ ������ �Է��� �ּ���.");
			Compare = true;
		}
	}
	//66666 �л� ���� ���� ����
	public void ModifyStuSbject() {
		
		try {
				
			System.out.println("���� ������ ������ �л� �̸��� �Է����ּ���.");
			String name = sc.next();
			Student findStudent = null;
			
			
			for(int i = 0; i < stuarray.size(); i++) {//<=�� ã�� ������ �����ϴ� ���
				
				if(stuarray.get(i).getName().equals(name)) {
					findStudent = stuarray.get(i);
					
					System.out.println(name + "�л��� ���� ���� ������  1." + findStudent.getSub1() + ", 2." + findStudent.getSub2() + " �����Դϴ�.");
					System.out.println("������ ������ ��ȣ�� �Է��� �ּ���.");
					int inputModifySbject = sc.nextInt();
					
					do {
					do {
						
						switch(inputModifySbject) {
						
						case 1:
							findStudent.setSub1("����");
							System.out.println("ù ���� ���� ������ ������ ���������ϴ�.");
							break;
						case 2:
							findStudent.setSub2("����");
							System.out.println("�� ��° ���� ������ ������ ���������ϴ�.");
							break;
						}
						
					}while(inputModifySbject > 2);
					}while(inputModifySbject < 1);
					
				}else if(findStudent == null) {
					System.out.println("�л� ������ �������� �ʽ��ϴ�.");
					break;
				}
				
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���ڸ� �ùٸ��� �Է����ּ���. (1, 2)");
		}
		
	}
	//77777 ��� �л� ���� ���
	public void StuAllP() {
		System.out.println("��� �л��� ������ ����մϴ�.");
		
		for (int i = 0; i < stuarray.size(); i++) {
			System.out.println("====================");
			System.out.println( stuarray.get(i).getName() + " �л�. " + stuarray.get(i).getAge() + " ��. " + stuarray.get(i).getNumber() + " ��.");
		}
		  
	}
	//88888 �л� ���� ���� ���
	public void outPutStu() {
		System.out.println("������ ����� �л� �̸��� �Է��ϼ���.");
		String name = sc.next();
		Student findStudent = null;
		
		for(int i = 0; i < stuarray.size(); i++) {
			
			if(stuarray.get(i).getName().equals(name)) {
				findStudent = stuarray.get(i);
				//���� ����
				File outputStuFile = new File("C:\\Users\\BomSeol\\Desktop\\JAVA_Porject", "�л����.txt");
		        BufferedWriter bw = null;
		        try {
		            bw = new BufferedWriter(new FileWriter(outputStuFile));
		            bw.write(findStudent.getName() + "/" + findStudent.getAge() + "/" + findStudent.getNumber() + "/" + findStudent.getSub1() + "/" + findStudent.getSub2());
		            bw.flush();
		            System.out.println(name + "�л��� ������ ���Ϸ� ��µǾ����ϴ�.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }finally {
		            if(bw != null) try {bw.close(); } catch (IOException e) {}
		        }
		        
			}else if(findStudent == null) {
				System.out.println("�л� ������ �������� �ʽ��ϴ�.");
				break;
			}
			
		}
		
	}
	//99999 ������
	public void Credit() {
		System.out.println("--------------------");
		System.out.println("     ��ȹ  ��  ����       =   �� ��");
		System.out.println("���߿� ������ �ֽ� �� = '�����뼱��'��");
		System.out.println("     Powered by JAVA");
		System.out.println("--------------------");
	}
	
	//�޼ҵ�
//	public void subjectCompare() {
//		if(stuarray.get(i).getsub1.equals(null)) {
//			//ù �� ° ������ ������� �� ����
//		}else if(stuarray.get(i).getsub2.equals(null)) {
//			//�� �� �� ������ ������� �� ����
//		}else {
//			//�� ������ ��� ������ �� ����
//		}
//	}
}
