//EnumSet,HashSet,LinkedListSet and TreeSet implements to Set Interface

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets{
    public static void main(String[] args) {
        
        //hashset
        HashSet<Integer> set = new HashSet<>();
        set.add(25);
        set.add(42);
        set.add(55);

        System.out.println("HashSet : "+ set);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(25);
        lhs.add(44);
        lhs.add(24);
        lhs.add(21);
        System.out.println("LinkedHashSet : " + lhs);

        boolean bl = lhs.contains(24);
        System.out.println("24 is present or not = " + bl);

        System.out.println(lhs.isEmpty());

        lhs.addFirst(98);
        System.out.println(lhs);

        //TreeSet

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(55);
        ts.add(5);
        ts.add(28);
        ts.add(45);

        System.out.println("TreeSet : " + ts);








    }
}

//Set is the undordered and does not allow  duplicate value.Only store the unique value.
//hashset implements the Set. It is also undordered and does not allow  duplicate value.Only store the unique value.
//LinkedHashSet also implements the Set. It is ordered and does not allow duplicate value.Only store the unique value.

//TreeSet implements the SortedSet.In the treeSet output come Sorted,unordered and not allow  duplicate value.Only store the unique value.