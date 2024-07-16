import java.util.ArrayList;
import java.util.HashMap;

public class MapInterface {
    public static void main(String[] args) {
        
        HashMap<String,String> data = new HashMap<>();
        HashMap<String,String> data2 = new HashMap<>();

        data.put("us", "United America");
        data.put("nl", "NewZeaLand");
        data.put("sa", "South America");
        data.putIfAbsent("sa", "South Africa");
        data.put("na", "North America");
        data.put("ng", "East America");

        //put() is use for add key and value 
        System.out.println(data);
        data.remove("us");    //remove data with key
        System.out.println(data);
        System.out.println(data.containsKey("na"));   //check key present or not
        System.out.println(data.containsValue("India"));   //check value present or not

   
        //putAll() is use for add two Map.

        data2.put("in","");
        data2.put("pk","Pakistan");
        data2.put("sr","Srilanka");

        data.putAll(data2);
        System.out.println(data);
        System.out.println(data.keySet());  //get the all key 

        ArrayList<String> key = new ArrayList<>(data.keySet());  //type two get the key 
        
        System.out.println(key);
        System.out.println(data.values());  //get the all key 



        System.out.println(data.get("in"));
        System.out.println(data.get("i"));  //normal get key not present then output null


        //if key is available then get the value otherwise get the default value

        System.out.println(data.getOrDefault("sk", "Other Countries"));






    }
}

//Map is similar to Set but in Map give the Key:Value pair.
// Its unordered and duplicate key allow but overwrite the last value.that's Always use unique key but dupicate value allow.
//If you dont want to overwrite the value that time use putIfAbsent() method.
//If value absent that time overwrite otherwise Give th output first value.