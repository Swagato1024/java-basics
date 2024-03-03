package linkedList;

public class LinkedList <T> {
  private Node head;
  private Node tail;

  LinkedList() {
    this.head = null;
    this.tail = null;
  }

  public void addToEnd(T value) {
    Node<T> node = new Node<>(value);

    if (head == null) {
      this.head = node;
      this.tail = node;
      return;
    }

    tail.updateNext(node);
    tail = node;
  }

  private Node<T> findSecondLast() {
    Node<T> current = this.head;
    Node<T> prev = null;

    while(current.getNext() != null) {
      prev = current;
      current = current.getNext();
    }

    return prev;
  }

  private boolean isLastNode() {
    return this.head.getNext() == null;
  }
  public void deleteLast() throws LinkedListUnderflow {
    if(this.head == null) {
      throw new LinkedListUnderflow();
    }

    if(isLastNode()) {
      this.head = null;
      this.tail = null;
      return;
    }

    Node secondLast = this.findSecondLast();
    this.tail = secondLast;
    secondLast.updateNext(null);
  }

  public void String toString() {
    Node currentNode = this.head;

    String listAsString = "";

    while(currentNode != null) {
      System.out.print(currentNode.getValue() + "  ");
      listAsString += currentNode.getValue() + "\n ";
      currentNode = currentNode.getNext();
    }

    return listAsString;
  }
}
