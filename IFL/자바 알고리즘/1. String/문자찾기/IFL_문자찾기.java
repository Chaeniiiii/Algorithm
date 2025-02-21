import java.util.*;
import java.io.*;

public class IFL_문자찾기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String origin = br.readLine();
        char find =  Character.toLowerCase(br.readLine().charAt(0));

        Map<Character,Integer> map = new HashMap<>();
        for(char c : origin.toCharArray()){
            char cc = Character.toLowerCase(c);
            map.put(cc,map.getOrDefault(cc,0)+1);
        }

        System.out.println(map.getOrDefault(find,0));

    }

}