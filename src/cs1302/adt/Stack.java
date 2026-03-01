package cs1302.adt;

/**
 * A stack represents a last-in-first-out (LIFO) collection of strings.
 * LIFO just means that items are always added (pushed) and removed
 * (popped) from the same end (the top). Implementing classes are expected
 * to have a default constructor that results in an empty stack.
 */
public interface Stack {

    /**
     * Returns the number of items currently in the stack.
     * @return the number of items currently in the stack
     */
    int size();

    /**
     * Returns {@code true} if the stack is empty and {@code false}
     * otherwise.
     * @return {@code true} if the stack is empty and {@code false}
     * otherwise.
     */
    boolean isEmpty();

    /**
     * Pushes {@code item} onto the top of this stack, and
     * increases the size of this stack by one.
     * @param item the item to be pushed onto this stack
     */
    void push(String item);

    /**
     * Pops the object off the top of this stack, and decreases the
     * size of this stack by one. This should always be the same as
     * the item last pushed.
     * @return the item at the top of this stack
     * @throws RuntimeException when this stack is empty.
     */
    String pop();

    /**
     * Returns the item at the top of this stack without removing it
     * from the stack. This should always be the same as the item last
     * pushed.
     * @return the item at the top of this stack
     * @throws RuntimeException when this stack is empty.
     */
    String peek();

} // Stack
