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
		//�ݺ���
		while(true) {
			//�޴� ��� ȣ��
			menuPrint();
			//���ù�
			String input = sc.next();
			if (input.equals("1")) {
				addStu();
			}if (input.equals("2")) {
			   	findStu();
			}if (input.equals("3")) {
			   	removeStu();
			}if (input.equals("4")) {
				modifyStu();
			}
//			if (input.equals("5")) {
//				addSubjToStu();
//			}
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
//			if (input.equals("7")) {
//			    StuAllP();
//			}if (input.equals("8")) {
//			    ProAllP();
//			}
			if (input.equals("9")){
			   	Credit();
			}if (input.equals("0")){
			   	System.out.println("���α׷��� �����մϴ�.");
			   	break;
			}
//			else {
//			   	System.out.println("0 - 9 ������ ������ �Է��� �ּ���.");
//			}
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
//		System.out.println("5. �л� ���� ���");
//		System.out.println("4. ���� �߰�");		// ���� Ŭ������ �̸� ��� �� ���� ������� �����س���
//		System.out.println("6. ���� ã��");
//		System.out.println("7. ���� ����");
//		System.out.println("8. ���� ���� ����");
//		System.out.println("7. ��� �л� ���� ȣ��");
//		System.out.println("8. ��� ���� ���� ȣ��");
		System.out.println("9. ������");
		System.out.println("0. ���α׷� ����");
		System.out.println("--------------------");
		System.out.println("���ϴ� ���ڸ� �Է����ּ���.");
	}
	//11111 �л� �߰�
	public void addStu() {
		 File StuFile = new File("C:\\Users\\201-01\\Desktop\\Java", "�л�.txt");//������ �ҷ��� �ּ� , ���� ��
	
		 //���� �б�
		 BufferedReader br = null;
	        try {
	        		br = new BufferedReader(new FileReader(StuFile));
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
	        			Student stu = new Student(tokenArray.get(0), age, tokenArray.get(2));
	        			//stuarray�� ���� ����
	        			stuarray.add(stu);
	        			
	        			
	        			Map<String, Student> stMap = new HashMap<String, Student>();
	        			stMap.put(tokenArray.get(0), new Student(tokenArray.get(0), age, tokenArray.get(2)));
	            	
	        			System.out.println("�л��� ��ϵǾ����ϴ�.");
	            	
	        		}
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(br != null) try {br.close(); } catch (IOException e) {}
	        }
	}
	//22222 �л� ã��
	public void findStu() {
		System.out.print(" ã�� �л� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		  
		for (int i = 0; i < stuarray.size(); i++) {
			  
			if (stuarray.get(i).getName().equals(name)) {
				System.out.print("ã���ô� �л� �ڷ� : ");
				System.out.println(stuarray.get(i).getName() + " �л�, " + stuarray.get(i).getAge() + " ��, ����ȣ_" + stuarray.get(i).getNumber());
				}
		}
		//�ڷᰡ ������ ã�����߽��ϴ� ��� �� �޴��� ���ư���
		//i<=stuarray.size(); �� �� ��, ������ "ã�� �л��� �����ϴ�." ��� �� �޴��� ����.
	}
	//33333 �л� ����
	public void removeStu() {
		System.out.print("�л� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		for (int i = 0; i < stuarray.size(); i++) {
			 
			if (stuarray.get(i).getName().equals(name)) {
				System.out.println(stuarray.get(i).getName() + " �л� �ڷᰡ ���� �Ǿ����ϴ�.");
				stuarray.remove(i);
				break;
			}
		}
	}
	//44444 �л� ���� ����
	public void modifyStu() {
		System.out.print("�л� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		for (int i = 0; i < stuarray.size(); i++) {
			if (stuarray.get(i).getName().equals(name)) {
				System.out.println(name + "�л��� ������ �����մϴ�.");
				//�л��� �̸��� ������ ���� ���� -- setter �̿�.
//				System.out.println("�̸��� �����մϴ�.");
//				 = sc.next();
				System.out.println("���̴� �����մϴ�.");
				int age = sc.nextInt();
				System.out.println("��ȣ�� �����մϴ�.");
				String num = sc.next();
				stuarray.get(i).setAge(age);
				stuarray.get(i).setNumber(num);
				System.out.println(stuarray.get(i).getName() + " �л��� ���̿� ��ȣ�� ����Ǿ����ϴ�.");
			}
		}
	}
	//55555 �л� ���� ���
	public void addSubjToStu() {
		
	}
	//99999 ������
	public void Credit() {
		System.out.println("--------------------");
		System.out.println("   ��ȹ, ����       =   �� ��");
		System.out.println("���߿� ������ �ֽ� �� = '�����뼱��'��");
		System.out.println("     Powered by JAVA");
		System.out.println("--------------------");
	}
	
}
