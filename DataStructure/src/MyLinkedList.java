class MyLinkedList extends DataStruct {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int element) {
        Node next = new Node(element);
        if (tail != null) {
            tail.setNext(next);
        }
        else {
            head = next;
        }
        tail = next;
        size++;
    }

    public int remove() {
        if (tail == null) {
            return -1;
        }
        else if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return 1;
        }
        Node temp = head;
        while (true) {
            if (temp.getNext() == tail) {
                temp.setNext(null);
                tail = temp;
                break;
            }
            else {
                temp = temp.getNext();
            }
        }
        size--;
        return size;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size > 0;
    }

}
