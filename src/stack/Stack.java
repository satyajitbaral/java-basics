package stack;

public interface Stack<T> {

    void push(T t);

    T pop() throws RuntimeException;

    boolean isFull();

    boolean isEmpty();

    T peek(int i);

}
