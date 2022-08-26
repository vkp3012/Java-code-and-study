import java.util.HashMap;
//to find highest frequency find
public class Main1{

    public static void main(String args[]) {
        String str = "abcabccc";


        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch) == true){
                int fre = map.get(ch);
                fre += 1;
                map.put(ch,fre);
            }else{
                map.put(ch,1);
            }
        }

        char c = str.charAt(0);
        for(Character key:map.keySet()){
            if(map.get(key)>map.get(c)){
                c = key;
            }
        }
        System.out.println(c);
    }
}