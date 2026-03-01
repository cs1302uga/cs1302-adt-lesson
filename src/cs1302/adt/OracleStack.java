package cs1302.adt;

/**
 * A stack that uses linked nodes to store its items.
 */
public class OracleStack implements Stack {

    private Node head;
    private int size;

    /**
     * Constructs an empty stack.
     */
    public OracleStack() {
        this.head = null;
        this.size = 0;
    } // OracleStack

    /** {@inheritDoc} */
    public int size() {
        return this.size;
    } // size

    /** {@inheritDoc} */
    public boolean isEmpty() {
        return this.size == 0;
    } // size

    /** {@inheritDoc} */
    public void push(String item) {
        head = new Node(item, head);
        this.size += 1;
    } // push

    /** {@inheritDoc} */
    public String pop() {
        ensureNotEmpty("pop");
        String item = head.getItem();
        this.head = head.getNext();
        this.size -= 1;
        return item;
    } // push

    /** {@inheritDoc} */
    public String peek() {
        ensureNotEmpty("peek");
        return this.head.getItem();
    } // peek

    /** {@inheritDoc} */
    @Override
    public String toString() {
        String out = "OracleStack(";
        Node node = this.head;
        while (node != null) {
            out += node.getItem();
            if (node.hasNext()) {
                out += ", ";
            } // if
        } // while
        out += ")";
        return out;
    } // toString

    /**
     * Throws and exception when this stack is empty.
     * @param method name of calling method
     * @throws RuntimeException when this stack is empty
     */
    private void ensureNotEmpty(String method) {
        if (this.isEmpty()) {
            throw new RuntimeException(method + ": stack is empty");
        } // if
    } // ensureNotEmpty

} // OracleStack
