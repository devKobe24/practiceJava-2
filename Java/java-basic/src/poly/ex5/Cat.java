package poly.ex5;

public class Cat implements InterfaceAnimal {

  @Override
  public void sound() {
    System.out.println("야옹");
  }

  @Override
  public void move() {
    System.out.println("냥냥이 이동");
  }
}
