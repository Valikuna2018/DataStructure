class MyQueue extends DataStruct {
    private Node head;
    private Node tail;
    private int size = 0;

    @Override
    public void add(int element) {
        Node next = new Node(element);
        if (size == 0) {
            size++;
            head = next;
            tail = next;
        }
        else {
            next.setNext(head);
            head = next;
            size++;
        }

    }

    @Override
    public int remove() {
        int answer = -1;
        if (size == 0) {return -1;}
        else
        if (size == 1) {size--;return head.getVal();}
        else {
            Node ind = head;
            while(true) {
                if (ind.getNext() == tail) {
                    ind.getNext().setNext(null);
                    size--;
                    answer = tail.getVal();
                    tail = ind;
                    break;
                }
                ind = ind.getNext();
            }

        }
        return answer;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }
}