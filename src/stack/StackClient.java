package stack;

public class StackClient {

    public static void main(String[] args) {





        Stack stack = new StackImpl();

        System.out.println("is stack empty: "+stack.isEmpty()); // true

        for(int i=0;i<25;i++){
            System.out.println(i);
            stack.push(i%2==0);
        }


        System.out.println("is stack empty: "+stack.isEmpty()); // false
        System.out.println("is stack full: "+stack.isFull()); // true


        for(int i=0;i<25;i++){
            System.out.println(stack.pop());
        }

        System.out.println("is stack empty: "+stack.isEmpty()); // false
        System.out.println("is stack full: "+stack.isFull()); // true

    }

}
