
import java.util.PriorityQueue;



public class PriorotyQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); //change prioroty
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        pq.add(20);
        pq.add(35);
        pq.add(5);
        pq.add(15);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());


    }
}


//In priority queue smallest value gievn the high priority