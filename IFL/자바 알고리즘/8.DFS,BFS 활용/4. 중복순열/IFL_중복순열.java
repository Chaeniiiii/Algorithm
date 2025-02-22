import java.util.*;
import java.io.*;

public class IFL_중복순열 {

    private static StringBuilder sb;
    private static int n,m;

    public static void main(String [] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        dfs(0, new int [2]);
        System.out.println(sb.toString());

    }

    private static void dfs(int dep, int [] pm){

        if(dep == m){
            sb.append(pm[0]).append(" ").append(pm[1]).append("\n");
            return ;
        }
        
        for(int i = 1; i<=n; i++){
            pm[dep] = i;
            dfs(dep+1,pm);
        }


    }
}