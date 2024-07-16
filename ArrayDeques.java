
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(20);
        dq.addLast(30);
        dq.offerFirst(45);

        System.out.println(dq);


        //it is used for delete the element

        System.out.println(dq.poll());  //poll and pollfirst both are del starting element
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        //it is used for get the element
        
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        
        
        System.err.println(dq);


    

    Deque<Integer> q = new ArrayDeque<>();
    q.addFirst(20);
    q.addLast(30);
    q.addFirst(45);

    System.out.println(q);

    // get the value by Deque method

    System.out.println(q.getFirst());
    System.out.println(q.getLast());

     // remove the value by Deque method
    
     System.out.println(q.removeFirst());
     System.out.println(q.removeLast());

}
}


//ArrayDeque implements to Deque and also implements to Queue.
//you can use  ArrayDeque place of  Stack because all method are sme as a Stack.
//in the arrayDeque you can add or delete starting and ending point.