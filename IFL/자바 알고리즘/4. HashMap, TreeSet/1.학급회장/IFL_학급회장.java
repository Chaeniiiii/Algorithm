import java.util.*;
import java.io.*;

public class IFL_학급회장 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int max = 0;
        char maxStu = ' ';
        
        for(char c : map.keySet()){
            int value = map.get(c);
            if(value > max){
                max = value;
                maxStu = c;
            }
        }

        System.out.println(maxStu);

    }

}