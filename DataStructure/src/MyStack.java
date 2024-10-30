
class MyStack extends DataStruct {
    private Node head;

    private Node tail;

    private int size = 0;

    @Override
    public void add(int element) {
        Node next = new Node(element);
        if (size == 0) {head = next;tail = next;size++;return;}
        tail.setNext(next);
        tail = next;
        size++;
    }

    @Override
    public int remove() {
        int answer = -1;
        if (size == 0) return -1;
        if (size == 1) {answer = head.getVal(); head = null; tail = null;size = 0; return answer;}
        Node ind = head;
        while(true) {
            if (ind.getNext() == tail) {
                answer = tail.getVal();
                tail = ind;
                break;
            }
            ind = ind.getNext();
        }
        size--;
        return answer;
    }

    @Override
    public int getSize() {
        return  size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }
}