// 1차원 배열을 이용한 DP (메모리 최적화)
import java.util.*;
import java.io.*;

public class IFL_조합의경우수4 {

    public static void main(String [] args) throws Exception { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int [] dp = new int[n+1];
        dp[0] = 1; //nC0 = 1

        for(int i = 1; i<=n; i++){

            for(int j = Math.min(i,r); j > 0; j--){
                dp[j] += dp[j-1];
            }
            System.out.println(Arrays.toString(dp));
            
        }

        System.out.println(dp[r]);

    }


}