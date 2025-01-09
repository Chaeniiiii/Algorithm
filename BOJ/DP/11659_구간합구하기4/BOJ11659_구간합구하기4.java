import java.util.*;
import java.io.*;

public class BOJ11659_구간합구하기4 {

    public static void main(String [] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] dp = new int[n+1];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n; i++){
            dp[i] = dp[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(dp[end] - dp[start-1]).append("\n");
        }

        System.out.println(sb.toString());
    }

}