package  io.github.Swagato1024.painter;

import com.thoughtworks.step.bittu.shapes.Rectangle;
import io.github.Swagato1024.canvas.Canvas;

class Painter {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(2, 4);
    Canvas canvas = new Canvas();

    System.out.println(rectangle.getArea());
    canvas.draw();
  }
}