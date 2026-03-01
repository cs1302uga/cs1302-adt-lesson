package cs1302.adt;

/**
 * Serves as the abstract parent to our two implementing classes.
 * Helps reduce redundancy in the children.
 */
public abstract class BaseStack implements Stack {
    protected int size;

    /**
     * Initializes the instance variables of this class.
     */
    public BaseStack() {
        throw new UnsupportedOperationException(
            "BaseStack() [default constructor] not implemented"
        );
    } // BaseStack

    /** {@inheritDoc} */
    @Override
    public int size() {
        throw new UnsupportedOperationException(
            "int size() not implemented"
        );
    } // size

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException(
            "boolean isEmpty() not implemented"
        );
    } // size

} // BaseStack
