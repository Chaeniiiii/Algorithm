import java.io.*;

public class BOJ2579_계단오르기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int [] stair = new int[n+1];
        int [] dp  = new int[n+1];

        for(int i = 1; i<=n; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = stair[1];

        //2번 계단은 항상 1번 계단과 2번 계단을 연속으로 밟았을 때 가장 큰 값을 갖게 됨.
        if(n >= 2) dp[2] = stair[1] + stair[2];

        for(int i = 3; i<=n; i++){
            dp[i] = Math.max(dp[i-2],dp[i-3]+stair[i-1])+stair[i];
        }

        System.out.println(dp[n]);

    }

}