
import java.util.LinkedList;
import java.util.Queue;


public class Queqes {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q);

        //iterate the element

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println(q.poll());  //if Queue is empty in the case of poll. then output come null
        System.out.println(q.remove());  //if Queue is empty in the case of remove then output come Exception

        System.out.println(q.peek());  //if Queue is empty in the case of peek. then output come null
        System.out.println(q.element());  //if Queue is empty in the case of empty then output come Exception



    }
}


//Queue works on (FIFO) first in first out.
// Queue ia a Interface extends to Collection Interface.ArrayDeque,LinkList and Prioroty List implements the Queue.
//It is also allow duplicate and oredered value.

//add() or offer() method both are working same. In add() come exception but in offer() come true or false

//remove() or poll() method both are working same .In remove() come exception but poll null.
//its works on FIFO.delete first element

//element() or peek() method both are working same .In element() come exception but peek come null.
//peek means which one on the top works on FIFO.
