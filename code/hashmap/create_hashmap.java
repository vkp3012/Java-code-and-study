import java.util.ArrayList;
import java.util.HashMap;

public class create_hashmap{

    public static void main(String args[]){

        HashMap<String,Integer>map = new HashMap<>();

        //put function
        map.put("India",333);
        map.put("INdia",123);
        map.put("USA",90);
        map.put("uk",110);

        System.out.println(map);


        //containskey
        if(map.containsKey("India")==true){
            System.out.println("Hurray!");
        }else{
            System.out.println("No");
        }

        //remove

        map.remove("INdia");
        System.out.println(map);


        //get
        System.out.println(map.get("India"));

        //getOrDefault
        System.out.println(map.getOrDefault("China", 5));

        //size
        System.out.println(map.size());

        //keyset
        ArrayList<String>al = new ArrayList<>(map.keySet());
        System.out.println(al);
    }
}