import java.io.*;

public class BOJ1003_피보나치함수 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        int [][] dp = new int[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        while(t -- > 0){
            int num = Integer.parseInt(br.readLine());
            
            for(int i = 2; i<=num; i++){
                dp[i][0] = dp[i-1][0] + dp[i-2][0];
                dp[i][1] = dp[i-1][1] + dp[i-2][1];
            }
            
            sb.append(dp[num][0]).append(" ").append(dp[num][1]).append("\n");
            
        }

        System.out.println(sb.toString());

    }

}