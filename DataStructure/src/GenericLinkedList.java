public class GenericLinkedList<T>{
    private int size;
    public GNode head;

    public GNode tail;

    public GenericLinkedList(GNode head) {
        this.size = 1;
        this.head = head;
        this.tail = head;

    }
    public GenericLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public T getT(int index) {
        int i = 0;
        GNode curr = this.head;
        T ans = null;
        while (i < this.size) {
            if (i == index) {ans = (T) curr.getVal(); break;}
            i++;
            curr = curr.getNext();
        }
        return ans ;
    }
    public <T> void add(T element) {
        GNode<T> newNode = new GNode<>(element);

        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public void remove(int index) {
        int i = 0;

        if (i == index) {this.head = this.head.getNext();this.size--;   return;}

        i = 1;
        GNode curr = head.getNext();
        GNode prev = head;
        while (i < this.size) {
            if (i == index) {
                prev.setNext(curr.getNext());
                this.size--;
                return;
            }
            prev = curr;
            curr = curr.getNext();
            i++;
        }


    }


    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) return true;
        return false;
    }

}
