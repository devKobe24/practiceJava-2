package access.ex;

public class Item {
  private String name;
  private int price;
  private int quantity;

  public Item(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String sendProductName() {
    this.name = name;
    String productName = name;
    return productName;
  }

  public int calculateTotal() {
     int total = (this.price * this.quantity);
     return total;
  }
}
