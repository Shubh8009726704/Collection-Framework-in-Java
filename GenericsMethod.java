public class GenericsMethod {
 
    public static void main(String[] args) {
        printData("Shubham");
        printData(25);
        printData(25.425);

        GenericsMethod obj = new GenericsMethod();
        obj.doubleData(25);

        CustomClass obj1 = new CustomClass();
        obj.doubleData(45);


    }

    static <E> void printData(E data){
        System.out.println(data);
    }

    <E extends Number> void doubleData(E data){
        System.out.println(data);
    }  
}

class CustomClass{
      void demo(){
        System.out.println("This is a bounded type Generic Class");
      }
}


//Its not compulsory to create the generics class you can create dirctly generics methods.