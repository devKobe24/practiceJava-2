package construct;

public class MethodInitMain3 {

  public static void main(String[] args) {
    Member member1 = new Member();
    member1.initMember("user1", 15, 90);

    Member member2 = new Member();
    member2.initMember("user2", 16, 80);

    Member[] members = { member1, member2 };

    for (Member member : members) {
      System.out.println("아름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
    }
  }
}
