package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class DataStructure<T> {

	private Map<T, Node<T>> map;
    private DoublyLinkedList<T> list;

    public DataStructure() {
        map = new HashMap<>();
        list = new DoublyLinkedList<>();
    }

    public void add(T value) {
        if (!map.containsKey(value)) {
            Node<T> newNode = list.addToFront(value);
            map.put(value, newNode);
        }
    }

    public void remove(T value) {
        if (map.containsKey(value)) {
            Node<T> nodeToRemove = map.get(value);
            list.remove(nodeToRemove);
            map.remove(value);
        }
    }
}
