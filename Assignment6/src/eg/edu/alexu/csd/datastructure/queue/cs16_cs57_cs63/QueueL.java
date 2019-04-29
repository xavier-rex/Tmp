package eg.edu.alexu.csd.datastructure.queue.cs16_cs57_cs63;

public class QueueL implements IQueue, ILinkedBased {

    private class Node {

        Object value;
        Node next;

        Node(Object value, Node next) {

            this.next = next;
            this.value = value;
        }
    }

    private Node head, tail;
    private int size = 0;

    /**
     * Inserts an item at the queue front.
     *
     * @param item the inserted item
     */
    public void enqueue(Object item) {

        Node node = new Node(item, null);
        if (head == null) {

            head = node;
            tail = node;
        }
        else {

            tail.next = node;
            tail = node;
        }
        size++;
    }

    /**
     * Removes the object at the queue rear and returns it.
     */
    public Object dequeue() {

        if (isEmpty()) {

            throw new RuntimeException("The queue is empty");
        }
        Object tmp = head.value;
        head = head.next;
        size--;
        return tmp;
    }

    /**
     * Tests if this queue is empty.
     */
    public boolean isEmpty() {

        return size == 0;
    }

    /**
     * Returns the number of elements in the queue
     */
    public int size() {

        return size;
    }
}
