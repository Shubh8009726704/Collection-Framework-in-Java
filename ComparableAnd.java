// import java.util.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



     class Animal implements Comparable<Animal>{
        String name;
        int age;
        int weight;

        public Animal(String name,int age,int weight){
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        @Override
        public String toString(){
            return "Animal{"+
             ",name =" +name + 
             ",age ="+age +
             "weight =" +weight +
            '}'+ "\n";

      

        }

        @Override
        public int compareTo(Animal o) {
            return 0;
        }

      

    }
    public class ComparableAnd {
    public static void main(String[] args) {
        Animal a1 = new Animal("Elephant",25,130);
        Animal a2 = new Animal("Lion",5,230);
        Animal a3 = new Animal("Peacock",2,10);
        Animal a4 = new Animal("Tiger",21,300);


        List<Animal> an = new ArrayList<>();
        an.add(a1);
        an.add(a2);
        an.add(a3);
        an.add(a4);

        System.out.println(an);

        Collection.sort(an);


        
    }
}
