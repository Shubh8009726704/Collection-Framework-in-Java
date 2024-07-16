import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedList{
    //here fetching time you got the problem with string when you add two number then 
    //string not add ,string concanete
    public static void main(String[] args) {
        //list 

        List list = new ArrayList();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2,25);
        list.add("Shubham");

        System.out.println(list);

        //using wrapper class and generics
        //arrayList

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // add is use for add the element which position you want to add 
        list1.add(20);
        list1.add(40);
        list1.add(2,25);
        list1.add(30);

        list2.add(25);
        list2.add(20);
        list2.add(17);
        list2.add(30);


        //list1.add("shubham");  //not use string value in the integer
        // System.out.println(list1);

        //add two list 

        list1.addAll(list2);
        // System.out.println(list1);

        // remove list1 element which element match list2 and also remove all elment form list2
 
        // list1.removeAll(list2);
        // System.out.println(list1);

        // remove list1 element which element doesn't match list2 and also remove all elment form list2
 
        // list1.retainAll(list2);
        // System.out.println(list1);

        //claear all list value

        // list1.clear();
        // System.out.println(list1);

        //remove particular elements 

        // list1.remove(2);
        // System.out.println(list1);

        // get the index of the value if element is not present then give -1
        //indexOf is give  the output of the starting element(if have duplicate value)

        System.out.println(list1.indexOf(40));
        System.out.println(list1.indexOf(88));

        // get the lastindex of the value if element is not present then give -1
        //lastIndexOf is give  the output of the last element(if have duplicate value)

        System.out.println(list1.lastIndexOf(17));



        //convert list to Array

        Object a[] = list1.toArray();
        for(Object e : a){
          Integer temp = (Integer) e ;
          // System.out.println(temp);
        }

        //get the value by index using get() method

        System.out.println(list1.get(0));

        // set the value by index and replace the value of index

        list1.set(2,149);
        System.out.println(list1);

        //LinkedList same as a arrayList

        LinkedList<Integer> data = new LinkedList<>();
        data.add(25);
        data.add(15);
        data.add(1,75);
        data.remove(1);
        // System.out.println(data);


      }
}


// List are ordered and store the duplicte.
//Peek,pop,push not have to List. 

//Note => In the array size are fixed. you can't add,remove,or update the value 
//that's why using the Collection framework.No need to define the size.