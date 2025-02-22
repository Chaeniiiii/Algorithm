import java.util.*;
import java.io.*;

public class IFL_아나그램2 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c : str2.toCharArray()){

            if(map.getOrDefault(c,0) == 0){
                System.out.println("NO");
                return;
            }

            map.put(c,map.get(c)-1);

        }

        System.out.println("YES");

    }


}