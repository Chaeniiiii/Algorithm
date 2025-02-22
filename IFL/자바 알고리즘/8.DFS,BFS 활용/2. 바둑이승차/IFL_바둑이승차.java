import java.util.*;
import java.io.*;

public class IFL_바둑이승차 {

    private static int n,c,max;

    private static int [] number;
    private static boolean [] visited;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        number = new int[n];
        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(br.readLine());

        max = Integer.MIN_VALUE;
        visited = new boolean[n];
        dfs(0,0);

        System.out.println(max);

    }

    private static void dfs(int cnt, int start){

        if(cnt > c) return;
        
        max = Integer.max(cnt,max);

        for(int i = start; i<n; i++){
            if(visited[i]) continue;
            visited[i] = true;
            dfs(cnt+number[i],i+1);
            visited[i] = false;
        }

    }

}