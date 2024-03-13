package extends1.ex;

public class Album extends Item {
  String artist;

  public Album(String name, int price, String artist) {
    super(name, price);
    this.artist = artist;
  }

  @Override
  public void print() {
    System.out.println("이름:" + super.name + ", 가격:" + super.price);
    System.out.println("- 아티스트:" + this.artist);
  }

  @Override
  public int getPrice() {
    return super.price;
  }
}
