public class WrapperClasses{
    public static void main(String[] args) {
        // Integer obj = new Integer(12);
        Integer obj1 = Integer.valueOf(12);
        Integer obj2 = 15;                 //autoboxing

        int age = obj1;    //unboxing   

        //valueOf convert the string value in Integer,Boolean and all number datatype

        Integer obj3 = Integer.valueOf("15");
        Boolean obj4 = Boolean.valueOf("false");
        Float obj5 = Float.valueOf("25.25");
        System.out.println(obj3*4);
        System.out.println(obj4);
        System.out.println(obj5*5);




        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(age);

    }
}



//Wrapper class mainly use in Collection framework.Because primitive data not support in Collection framework.
//in Wrapper class store the primitive(int) value directly.It is known as Autoboxing.
// in primitive datatype store the wraper class.It is known as unboxing.
//valueOf is used for convert the String value in Integer and Boolean.