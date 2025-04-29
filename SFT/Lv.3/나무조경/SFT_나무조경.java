import java.io.*;
import java.util.*;

public class SFT_나무조경 {

    private static int result;

    private static boolean [][] visited;
    
    private static int [] dx = {-1,1,0,0};
    private static int [] dy = {0,0,-1,1};
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [][] trees = new int[n][n];
        
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                trees[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        result = 0;
        visited = new boolean[n][n];
        dfs(n,trees,0,0);

        System.out.println(result);
        
    }

    private static void dfs(int n, int [][] trees, int dep, int cnt){

        if(dep > 4) return;
        if(dep <= 4) result = Math.max(result,cnt);
        

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(visited[i][j]) continue;

                visited[i][j] = true;
                for(int k = 0; k<4; k++){
                    int mvX = i + dx[k];
                    int mvY = j + dy[k];
                    if(mvX < 0 || mvY < 0 || mvX >= n || mvY >= n || visited[mvX][mvY]) continue;
                    visited[mvX][mvY] = true;
                    dfs(n,trees,dep+1,cnt+trees[mvX][mvY]+trees[i][j]);
                    visited[mvX][mvY] = false;
                }
                visited[i][j] = false;
            }
        }
        
    }
}
