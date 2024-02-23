package oop1.ex;

public class Rectangle {
  int width;
  int height;

  int calculateArea() {
    int area = (width * height);
    return area;
  }

  int calculatePerimeter() {
    int perimeter = (2 * (width + height));
    return perimeter;
  }

  boolean isSquare() {
    boolean isSquare = (width == height) ? true : false;
    return isSquare;
  }
}
