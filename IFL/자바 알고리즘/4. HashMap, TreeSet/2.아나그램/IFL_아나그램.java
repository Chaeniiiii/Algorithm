import java.util.*;
import java.io.*;

public class IFL_아나그램 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        HashMap<Character,Integer> map1 = putMap(str1);
        HashMap<Character,Integer> map2 = putMap(str2);

        for(char c : map1.keySet()){

            int value = map1.get(c);

            if(map2.getOrDefault(c,0) != value){
                System.out.println("NO");
                return;
            }

        }

        System.out.println("YES");

    }

    private static HashMap<Character,Integer> putMap(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        return map;

    } 

}