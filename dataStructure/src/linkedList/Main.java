package linkedList;

public class Main {
  public static void main(String[] args) throws LinkedListUnderflow {
    LinkedList<Integer> linkedList = new LinkedList<>();

    linkedList.addToEnd(3);
    linkedList.addToEnd(5);
    linkedList.addToEnd(10);

    linkedList.deleteLast();
    linkedList.addToEnd(100);
    linkedList.display();
  }
}
