package cs1302.adt;

/**
 * A stack that uses an array to store its items.
 */
public class ArrayStack extends BaseStack {

    private String[] array;

    /**
     * Constructs an empty stack.
     */
    public ArrayStack() {
        throw new UnsupportedOperationException(
            "ArrayStack() [default constructor] not implemented"
        );
    } // ArrayStack

    /** {@inheritDoc} */
    @Override
    public void push(String item) {
        throw new UnsupportedOperationException(
            "void push(String item) not implemented"
        );
    } // push

    /** {@inheritDoc} */
    @Override
    public String pop() {
        throw new UnsupportedOperationException(
            "String pop() not implemented"
        );
    } // push

    /** {@inheritDoc} */
    @Override
    public String peek() {
        throw new UnsupportedOperationException(
            "String peek() not implemented"
        );
    } // peek

    /** {@inheritDoc} */
    @Override
    public String toString() {
        throw new UnsupportedOperationException(
            "String toString() not implemented"
        );
    } // toString

    /**
     * Throws and exception when this stack is empty.
     * @param name name of calling method
     * @throws RuntimeException when this stack is empty
     */
    private void ensureNotEmpty(String name) {
        if (size() == 0) {
            throw new RuntimeException(name + ": stack is empty");
        } // if
    } // ensureNotEmpty

} // ArrayStack
