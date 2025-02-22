import java.util.*;
import java.io.*;

public class IFL_합이같은부분집합 {

    private static int n, total;

    private static boolean flag;

    private static int [] number;
    private static boolean [] visited;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        number = new int[n];

        total = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
            total += number[i];
        }

        flag = false;
        visited = new boolean[n];

        dfs(0,0,0);

        System.out.println(flag ? "YES" : "NO");

    }

    private static void dfs(int start, int dep, int sum){

        if(flag || sum > total) return;

        if(start == n){

            if(total-sum == sum) flag = true;
            return;
        }

        for(int i = start; i<n; i++){

            if(visited[i]) continue;

            visited[i] = true;
            dfs(i+1,dep+1,sum+number[i]);
            visited[i] = false;
            
        }

    }

}