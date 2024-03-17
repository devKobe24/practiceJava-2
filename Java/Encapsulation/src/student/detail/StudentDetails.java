package student.detail;

import student.Student;

public class StudentDetails {

  public static void main(String[] args) {
    Student student = new Student();

    // Setting the value of the variables
    student.setName("Kobe");
    student.setStudentID(24);
    student.setAge(32);

    //  Printing the values of the variables

    System.out.println("Student Name : " + student.getName());
    System.out.println("Student ID : " + student.getStudentID());
    System.out.println("Student Age : " + student.getAge());
  }
}
