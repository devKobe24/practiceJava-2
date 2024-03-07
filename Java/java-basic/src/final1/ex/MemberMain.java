package final1.ex;

public class MemberMain {

  public static void main(String[] args) {
    Member member = new Member("dev", "kobe");
    member.print();
    member.changeData("dev.skyachieve", "kang");
    member.print();
  }
}
