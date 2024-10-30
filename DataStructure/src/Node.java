class Node {

    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getVal() {
        return value;
    }

    public void setVale(int vale) {
        this.value = vale;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}