public class GNode <T>{
    private T val;
    private GNode next;

    public GNode(T val) {
        this.val = val;
        this.next = null;
    }

    public T getVal() {
        return this.val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public GNode getNext() {
        return next;
    }

    public void setNext(GNode next) {
        this.next = next;
    }
}
