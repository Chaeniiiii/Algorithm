import java.util.*;
import java.io.*;

public class IFL_동전교환 {

    private static int n,m,min;

    private static Integer [] money;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        n = Integer.parseInt(br.readLine());
        
        money = new Integer[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<n; i++) money[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(money,(a,b) -> b-a);

        m = Integer.parseInt(br.readLine());
        min = Integer.MAX_VALUE;
        dfs(0,0);

        System.out.println(min);

    }

    private static void dfs(int dep, int cnt){

        if(cnt > m || dep > min) return;

        if(cnt == m){
            min = Math.min(min,dep);
            return;
        }

        for(int i = 0; i<n; i++){
            dfs(dep+1,cnt+money[i]);
        }

    }

}