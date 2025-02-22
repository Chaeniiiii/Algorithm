import java.util.*;
import java.io.*;

public class IFL_모든아나그램찾기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String check = br.readLine();

        int k = check.length();

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c : check.toCharArray()) map2.put(c,map2.getOrDefault(c,0)+1);

        int lt = 0, cnt = 0;

        for(int rt = 0; rt<str.length(); rt++){

            char c = str.charAt(rt);
            map.put(c,map.getOrDefault(c,0)+1);

            if(rt == lt + k - 1){
                if(map.equals(map2)) cnt++;

                if(map.get(str.charAt(lt)) == 1) map.remove(str.charAt(lt));
                else map.put(str.charAt(lt),map.get(str.charAt(lt))-1);

                lt ++;
            }

        }

        System.out.println(cnt);


    }

}