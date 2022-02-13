package queue;

import java.util.*;

public class Demo {

    // >=3.5 || < 3.0

    public static void main(String[] args) {



        Deque myQueue = new LinkedList<>();

        myQueue.add("1");
        myQueue.add("2");
        myQueue.add("3");

        for (int i = 0;i<3;i++){
            System.out.println(myQueue.peek());
        }




        System.out.println(myQueue);

    }

}
