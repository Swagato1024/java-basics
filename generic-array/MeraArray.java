class MeraArray<E> {
  private Object objArray[] = new Object[10];
  private static int length;

  MeraArray() {
    this.length = 0;
  }

  void insert(E element) {
    objArray[length] = element;
    length++;
  };

  E at(int index) {
    return (E) objArray[index];
  };
}
