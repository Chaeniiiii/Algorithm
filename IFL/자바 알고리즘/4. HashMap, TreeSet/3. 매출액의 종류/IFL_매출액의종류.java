import java.util.*;
import java.io.*;

public class IFL_매출액의종류 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] number = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(st.nextToken());

        int lt = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int rt = 0; rt<n; rt++){
            
            map.put(number[rt],map.getOrDefault(number[rt],0)+1);
            
            if(rt == lt + k -1){
                sb.append(map.size()).append(" ");

                if(map.get(number[lt]) == 1) map.remove(number[lt]);
                else map.put(number[lt],map.get(number[lt])-1);
                
                lt ++;
            }

        }

        System.out.println(sb.toString());

    }

}