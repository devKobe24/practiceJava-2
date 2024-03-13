package extends1.ex;

public class ShopMain {

  public static void main(String[] args) {
    Book book = new Book("JAVA", 10000, "han", "12345");
    Album album = new Album("Come to me baby", 15000, "kang");
    Movie movie = new Movie("어바웃 타임", 18000, "리터드 커티스", "레이첼 맥아담스");

    book.print();
    album.print();
    movie.print();

    int sum = book.getPrice() + album.getPrice() + movie.getPrice();
    System.out.println("상품 가격의 합: " + sum);
  }
}
