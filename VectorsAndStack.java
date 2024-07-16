
import java.util.Stack;
import java.util.Vector;

public class VectorsAndStack {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(20);
        vec.add(20);
        vec.add(30);
        vec.add(2, 15);
        System.out.println("Vectors "+ vec);


        Stack<Integer> stk = new Stack<>(); 
        stk.push(20);
        stk.push(20);
        stk.push(30);
        System.out.println("Stack " + stk);
        // stk.pop();
        System.out.println("Delete the last value from peek " + stk.pop());
        System.out.println("Get the last value from peek " + stk.peek());



    }
}


// ArrayList is faster than Vector.Because ArrayList is a Assynchronies and Vector is a Synchronies 
// Vector do the single work at the same time.

//Stack is based on last in fast out (LIFO).(jo last me jayega wahi first me bahar aayega)
//Vector are sychronios and thread safe that's why  Stack extends to the Vector.
//Three operation in Stack => Push(add), Pop(delete) ,Peek(get the last value).

// Stack and vector store the duplicate value becuase list list are oredered and store the duplicate value 
//in the list not have Peek,Pop,Push. it is a feature of stack.