package stack;

public class StackImpl implements Stack<Object>{


    private Object[] arr;
    int currentPosition;


    public StackImpl() {
        this.arr = new Object[25];
        currentPosition=0;
    }

    @Override
    public void push(Object element) {

        if(isFull()){
          throw new RuntimeException("not enough space");
        }

        arr[currentPosition++] = element;


    }

    @Override
    public Object pop() throws RuntimeException {
        if(isEmpty()){
            throw new RuntimeException("stack is empty,no element to pop");
        }
        return arr[--currentPosition];
    }

    @Override
    public boolean isFull() {
        return currentPosition>=arr.length;
    }

    @Override
    public boolean isEmpty() {
        return currentPosition==0;
    }

    @Override
    public Object peek(int i) {
        if(i < arr.length)
            return arr[i];
        throw new RuntimeException("out of bound ....");


    }
}
