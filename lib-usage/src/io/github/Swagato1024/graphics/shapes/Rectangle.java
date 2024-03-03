package io.github.Swagato1024.graphics.shapes;

class Rectangle {
  private int length;
  private int width;

  Rectangle(int lenght, int width) {
    this.length = length;
    this.width = width;
  }

  public int getArea() {
    return 2 * (this.length + this.width);
  }

  public String toString() {
    return String.format("length: %d width: %d", this.length, this.width);
  }
}