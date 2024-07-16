

public class GenericClass {
    public static void main(String[] args) {
        Demo<String,String> dm = new Demo<>("Deepak","Shubham");
        Demo<String,Integer> dm1 = new Demo<>("Manish",24);
        Demo<Integer,String> dm2 = new Demo<>(24,"Deepak");


        System.out.println(dm.id + " "+ dm.name);
        System.out.println(dm1.id + " " + dm1.name);
        System.out.println(dm2.id + " " + dm2.name);

        System.out.println(dm.getName());



    }
}

class Demo<V,W>{
    V id;
    W name;

    public Demo(V id,W name){
        this.id = id;
        this.name = name;
    }

    W getName(){
        return name;
    }
}


//you can create the variable with Character place of Datatype .Suppose you want to give any
//type of data you can use generics formula.
//you can create the class,method,interface from generics as a above example.