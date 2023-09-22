package dataStructure;

public class DoublyLinkedList<T> {

	    private Node<T> head;
	    private Node<T> tail;

	    public Node<T> addToFront(T value) {
	        Node<T> newNode = new Node<>(value);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	        return newNode;
	    }

	    public void remove(Node<T> node) {
	        if (node == null)
	            return;

	        if (node.prev != null)
	            node.prev.next = node.next;
	        else
	            head = node.next;

	        if (node.next != null)
	            node.next.prev = node.prev;
	        else
	            tail = node.prev;
	    }
}
