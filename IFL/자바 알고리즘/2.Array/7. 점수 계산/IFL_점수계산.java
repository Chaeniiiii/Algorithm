import java.util.*;
import java.io.*;

public class IFL_점수계산 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int[] qus = new int[n];

        for (int i = 0; i<n; i++){
            qus[i] = Integer.parseInt(st.nextToken());
        }

        int [] dp = new int [n];
        dp[0] = qus[0] == 1 ? 1 : 0;

        int cnt = dp[0] == 1 ? 1 : 0;

        for(int i = 1; i<n; i++){
            if(qus[i] == 1) {
                dp[i] += (dp[i-1] + 1);
                cnt += dp[i];
            }
        }

        System.out.println(cnt);

    }

}