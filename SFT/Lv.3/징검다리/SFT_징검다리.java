import java.io.*;
import java.util.*;

public class SFT_징검다리 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int [] number = new int[n];
        int [] dp = new int[n];
        Arrays.fill(dp,1);

        int max = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            number[i] = num;
            
            for(int j = 0; j<i; j++){
                if(number[j] < number[i]) dp[i] = Math.max(dp[j]+1,dp[i]);
            }
            max = Math.max(max,dp[i]);
        }

        System.out.println(max);
        
    }
    
}
