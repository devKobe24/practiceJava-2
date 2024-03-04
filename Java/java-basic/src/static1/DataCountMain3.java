package static1;

public class DataCountMain3 {

  public static void main(String[] args) {
    Data3 data1 = new Data3("A");
    System.out.println("A coutn=" + Data3.count);

    Data3 data2 = new Data3("B");
    System.out.println("B coutn=" + Data3.count);

    Data3 data3 = new Data3("C");
    System.out.println("C coutn=" + Data3.count);
  }
}
