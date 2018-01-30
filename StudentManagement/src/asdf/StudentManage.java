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
  System.out.println("===학생 데이터 관리 프로그램===");
  System.out.println("선택하세요...(종료=q)");
  System.out.println("1.학생 정보 입력 ");
  System.out.println("2.전체 학생 정보 출력");
  System.out.println("3.학생 정보 검색");
  System.out.println("4.학생 정보 삭제");
  System.out.println("5.학생 정보 수정");
  System.out.print(">>");
  
 }
//1111111111111111111111111111111111111111111
 public void makeStudent(){
System.out.print("학생이름을 입력하세요. : ");
String name = sc.next();
System.out.print("학생번호 입력하세요. : ");
int num = sc.nextInt();
System.out.print("학생나이를 입력하세요. :");
int age = sc.nextInt();
Student s = new Student(name, num, age);
list.add(s);
 }//22222222222222222222222222222222222222222222
 public void printAllStudentInfo(){
  
  for (int i = 0; i < list.size(); i++) {
   System.out.println(list.get(i).getNumber() + "번 " + list.get(i).getName() + "학생 "
     + list.get(i).getAge() + "살");
  }
  
 }
 //333333333333333333333333333333333333333333
 public void searchByName(){
  System.out.print("학생 이름을 입력하세요 : ");
  String name = sc.next();
  int i = 0;
  for (i = 0; i < list.size(); i++) {
   if (list.get(i).getName().equals(name)) {
    System.out.print("찾으시는 학생자료 :");
    System.out.println(list.get(i).getNumber() + "번 " + list.get(i).getName() + "학생 "
      + list.get(i).getAge() + "살");

   }
  }
 }
 //444444444444444444444444444444444444444444444444
 public void deleteByName(){
  System.out.print("학생 이름을 입력하세요 : ");
  String name = sc.next();
  int i = 0;
  for (i = 0; i < list.size(); i++) {
   if (list.get(i).getName().equals(name)) {
    System.out.println(list.get(i).getName() + " 학생 자료가 삭제 되었습니다.");
    list.remove(i);
    break;
   }
  }
 }
 //5555555555555555555555555555555555555555555
 public void updateByName(){
  System.out.print("학생 이름을 입력하세요 : ");
  String name = sc.next();
  int i = 0;
  for (i = 0; i < list.size(); i++) {
   if (list.get(i).getName().equals(name)) {
    System.out.println("나이는 몇살로 바꿀까요?");
    int age = sc.nextInt();
    System.out.println("번호는 몇번으로 바꿀까요?");
    int num = sc.nextInt();
    list.get(i).setAge(age);
    list.get(i).setNumber(num);
    System.out.println(list.get(i).getName() + " 학생의 나이와 번호가 변경되었습니다.");
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