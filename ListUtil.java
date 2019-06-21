class ListClass {
    public ListClass next;

    public ListClass() {}
}

public class ListUtil {
    /**
     * Adds a new node to the end of the list.
     * @param head Head of the list
     * @param newNode Node to be added to the list
     */
    public static void append(ListClass head, ListClass newNode) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = newNode;
    }

    /**
     * Removes from the list the node on the specified index.
     * @param head Head of the list
     * @param index Index of the node to be removed
     */
    public static void remove(ListClass head, int index) {
        int i = 0;
        while (head.next != null && i != index) {
            head = head.next;
            i++;
        }

        if (i == index) {
            head.next = head.next.next;
        }
    }

    /**
     * Removes one node from the top of the stack.
     * @param head Head of the stack
     */
    public static void removeFromStack(ListClass head) {
        while (head.next != null) {
            if (head.next.next == null) {
                head.next = null;
            } else {
                head = head.next;
            }
        }
    }

    /**
     * Removes the first node of the queue.
     * @param head Head of the queue
     */
    public static void removeFromQueue(ListClass head) {
        if (head.next != null) {
            head.next = head.next.next;
        }
    }

    /**
     * Returns the node of the list located at the specified index
     * @param head Head of the list
     * @param index Index of the node
     * @return Node located at the specified index
     */
    public static ListClass get(ListClass head, int index) {
        int i = 0;
        while (head.next != null && i != index) {
            head = head.next;
            i++;
        }

        return head.next;
    }

    /**
     * Returns the size of the list
     * @param head Head of the list
     * @return Size of the list
     */
    public static int size(ListClass head) {
        int i = 0;
        while (head.next != null) {
            head = head.next;
            i++;
        }
        return i;
    }
}