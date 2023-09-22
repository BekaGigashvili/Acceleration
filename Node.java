package dataStructure;

class Node<T> {
    T value;
    Node<T> prev;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}
