//List,Queue,Set extends to Collection Interface

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterate {
    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("grapes");

        for(int i=0;i<fruits.size();i++){
            System.out.println("fruits is " +fruits.get(i));
        }

        //foreach

        for(String e:fruits){
            System.out.println("fruits = " + e);
            System.out.println("");

        }

        //using iterator method
        //you can use listIterator both are working same

        // Iterator<String> ft = fruits.listIterator();
        Iterator<String> ft = fruits.iterator();
        while(ft.hasNext()){
            System.out.println("Iteratot fruits is : " + ft.next());
        }

        //subList is same as a substring

        List<String> smallList = fruits.subList(1, 3);
        System.out.println(smallList);

    }
}
