package linkedList;

public class Node <T> {
  private final T value;
  private Node<T> next;

  public Node(T data) {
    this.value = data;
    this.next = null;
  }

  public T getValue() {
    return this.value;
  }

  public Node getNext() {
    return this.next;
  }

  public void updateNext(Node node) {
    this.next = node;
  }
}
