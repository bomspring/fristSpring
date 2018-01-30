package asdf;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  OperateStudentManage operateStudentManage = new OperateStudentManage();
  operateStudentManage.main();
 }

}

class OperateStudentManage {
 Scanner sc = new Scanner(System.in);
 ArrayList<Student> list = new ArrayList<Student>();
 

 public void main() {
   do {

    menuprint();
    String input = sc.next();
    if (input.equals("q")) {
     break;
    }
    if (input.equals("1")) {
     makeStudent();
    }
    if (input.equals("2")) {
     printAllStudentInfo();
    }
    if (input.equals("3")) {
     searchByName();
    }
    if (input.equals("4")) {
     deleteByName();
    }
    if (input.equals("5")) {
     updateByName();

    }
   } while (true);
 }
 
 public void menuprint(){
  System.out.println("===�л� ������ ���� ���α׷�===");
  System.out.println("�����ϼ���...(����=q)");
  System.out.println("1.�л� ���� �Է� ");
  System.out.println("2.��ü �л� ���� ���");
  System.out.println("3.�л� ���� �˻�");
  System.out.println("4.�л� ���� ����");
  System.out.println("5.�л� ���� ����");
  System.out.print(">>");
  
 }
//1111111111111111111111111111111111111111111
 public void makeStudent(){
System.out.print("�л��̸��� �Է��ϼ���. : ");
String name = sc.next();
System.out.print("�л���ȣ �Է��ϼ���. : ");
int num = sc.nextInt();
System.out.print("�л����̸� �Է��ϼ���. :");
int age = sc.nextInt();
Student s = new Student(name, num, age);
list.add(s);
 }//22222222222222222222222222222222222222222222
 public void printAllStudentInfo(){
  
  for (int i = 0; i < list.size(); i++) {
   System.out.println(list.get(i).getNumber() + "�� " + list.get(i).getName() + "�л� "
     + list.get(i).getAge() + "��");
  }
  
 }
 //333333333333333333333333333333333333333333
 public void searchByName(){
  System.out.print("�л� �̸��� �Է��ϼ��� : ");
  String name = sc.next();
  int i = 0;
  for (i = 0; i < list.size(); i++) {
   if (list.get(i).getName().equals(name)) {
    System.out.print("ã���ô� �л��ڷ� :");
    System.out.println(list.get(i).getNumber() + "�� " + list.get(i).getName() + "�л� "
      + list.get(i).getAge() + "��");

   }
  }
 }
 //444444444444444444444444444444444444444444444444
 public void deleteByName(){
  System.out.print("�л� �̸��� �Է��ϼ��� : ");
  String name = sc.next();
  int i = 0;
  for (i = 0; i < list.size(); i++) {
   if (list.get(i).getName().equals(name)) {
    System.out.println(list.get(i).getName() + " �л� �ڷᰡ ���� �Ǿ����ϴ�.");
    list.remove(i);
    break;
   }
  }
 }
 //5555555555555555555555555555555555555555555
 public void updateByName(){
  System.out.print("�л� �̸��� �Է��ϼ��� : ");
  String name = sc.next();
  int i = 0;
  for (i = 0; i < list.size(); i++) {
   if (list.get(i).getName().equals(name)) {
    System.out.println("���̴� ���� �ٲܱ��?");
    int age = sc.nextInt();
    System.out.println("��ȣ�� ������� �ٲܱ��?");
    int num = sc.nextInt();
    list.get(i).setAge(age);
    list.get(i).setNumber(num);
    System.out.println(list.get(i).getName() + " �л��� ���̿� ��ȣ�� ����Ǿ����ϴ�.");
   }

  }
 }
 
}





class Student {
 private String name;
 private int number;
 private int age;

 public Student(String name, int number, int age) {
  super();
  this.name = name;
  this.number = number;
  this.age = age;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getNumber() {
  return number;
 }

 public void setNumber(int number) {
  this.number = number;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 @Override
 public String toString() {
  return "Student [name=" + name + ", number=" + number + ", age=" + age + "]";
 }

}