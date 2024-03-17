package student;

public class Student {
  // Private data members
  private String name;
  private int studentID;
  private int age;

  // Getter method for student name to access private variable name
  public String getName() {
    return name;
  }

  // Setter method for student name to set the value in private variable studentName
  public void setName(String name) {
    this.name = name;
  }

  // Getter method for student id to access private variable studentID
  public int getStudentID() {
    return studentID;
  }

  // Setter method for student id to set the value in private variable studentID
  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }

  // Getter method for student age to access private variable age
  public int getAge() {
    return age;
  }

  // Setter method for student age to set the value in private variable age
  public void setAge(int age) {
    this.age = age;
  }
}
