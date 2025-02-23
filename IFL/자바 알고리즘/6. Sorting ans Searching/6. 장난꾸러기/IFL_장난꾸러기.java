import java.util.*;
import java.io.*;

public class IFL_장난꾸러기 {



    public static void main(String [] args) throws Exception {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
    
        int [] num = new int[n];
        int [] sortNum = new int[n];

        for(int i = 0; i<n; i++){
            num [i] = Integer.parseInt(st.nextToken());            
        }

        sortNum = num.clone();
        Arrays.sort(sortNum);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(num[i] != sortNum[i]) arr.add(i+1);
        }

        for(int i : arr) sb.append(i).append(" ");
        System.out.println(sb.toString());
        
    }

}