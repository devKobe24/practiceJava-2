package construct;

public class MemberInit {
  String name;
  int age;
  int grade;

  // 추가
  void initMember(MemberInit member, String name, int age, int grade) {
    member.name = name;
    member.age = age;
    member.grade = grade;
  }
}
