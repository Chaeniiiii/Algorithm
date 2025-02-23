import java.util.*;
import java.io.*;

public class IFL_삽입정렬 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int [] num = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) num[i] = Integer.parseInt(st.nextToken());

        for(int i = 1; i<n; i++){
            int target = num[i], j;
            for(j = i-1; j>=0; j--){
                if(target < num[j]) num[j+1] = num[j];
                else break;
            }
            num[j+1] = target;
        }

        for(int i : num) sb.append(i).append(" ");
        System.out.println(sb.toString());

    }

}
