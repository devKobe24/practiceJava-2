package ref;

import javax.swing.text.html.parser.TagElement;

public class Method1 {

  public static void main(String[] args) {
    Student student1 = new Student();
    initStudent(student1, "학생1", 15, 90);
    System.out.println("student1 참조값 : " + student1);
    Student student2 = new Student();
    initStudent(student2, "학생2", 16, 80);
    System.out.println("student2 참조값 : " + student2);
    printStudent(student1);
    printStudent(student2);

  }

  static void initStudent(Student student, String name, int age, int grade) {
    System.out.println("student 참조값 : " + student);
    student.name = name;
    student.age = age;
    student.grade = grade;
  }

  static void printStudent(Student student) {
    System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
  }
}
