package eg.edu.alexu.csd.datastructure.queue.cs16_cs57_cs63;

public class QueueA implements IQueue, IArrayBased {

    private int capacity, size = 0, front = 0;
    private Object[] q;

    QueueA(int capacity) {

        q = new Object[capacity];
        this.capacity = capacity;
    }

    /**
     * Inserts an item at the queue front.
     *
     * @param item the inserted item
     */
    public void enqueue(Object item) {

        if (capacity == size) {

            System.out.println("Queue is full");
            System.out.println("The element is added to the front of the queue");
        }
        q[(front + size) % capacity] = item;
        if (size != capacity) {

            size++;
        }
    }

    /**
     * Removes the object at the queue rear and returns it.
     */
    public Object dequeue() {

        if (isEmpty()) {

            throw new RuntimeException("The queue is empty");
        }
        Object tmp = q[front];
        front = (front + 1) % capacity;
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
