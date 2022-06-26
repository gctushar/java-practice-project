package linklistimplementation;

public class Linklist<T> {

    private Node head = null;
    private int size = 0;

    public void add(T data) {

        if (head == null) {
            Node node = new Node(data);
            head = node;
            size++;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        Node node = new Node(data);
        currentNode.next = node;
        size++;
        return;
    }

    public void deleteFirstData(T data) {
        Node currentNode = head;
        if (head != null && head.data == data) {
            head = head.next;
            size--;
            return;
        }
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                size--;
                return;
            }
            currentNode = currentNode.next;
        }
        return;
    }

    public void printAll() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public void reverse() {

        Node current = head;
        Node next = null;
        Node previous = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }

}
