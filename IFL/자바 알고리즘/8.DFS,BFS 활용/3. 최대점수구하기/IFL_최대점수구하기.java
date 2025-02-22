import java.util.*;
import java.io.*;

public class IFL_최대점수구하기 {

    private static int n,m,max;

    private static Problem [] arr;
    private static boolean [] visited;

    private static class Problem{

        int score;
        int time;

        private Problem(int score, int time){
            this.score = score;
            this.time = time;
        }
        
    }

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new Problem[n];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            arr[i] = new Problem(s,t);
        }

        max = Integer.MIN_VALUE;
        visited = new boolean[n];

        dfs(0,0,0);

        System.out.println(max);

    }

    private static void dfs(int start,int cnt, int maxTime){

        if(maxTime > m) return;

        max = Math.max(max,cnt);

        for(int i = start; i<n; i ++){

            if(visited[i]) continue;
            visited[i] = true;
            dfs(i+1,cnt + arr[i].score, maxTime+arr[i].time);
            visited[i] = false;

        }

    }

}