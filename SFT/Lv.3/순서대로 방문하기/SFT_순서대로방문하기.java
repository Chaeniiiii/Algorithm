import java.io.*;
import java.util.*;

public class SFT_순서대로방문하기 {

    private static int n,m;
    
    private static ArrayList<int []> dest;
    private static int [][] board;
    private static boolean [][] visited;

    private static int [] dx = {-1,1,0,0};
    private static int [] dy = {0,0,-1,1};

    private static int result;
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][n];
        
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dest = new ArrayList<>();
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            dest.add(new int[]{x,y});
        }

        visited = new boolean[n][n];
        visited[dest.get(0)[0]][dest.get(0)[1]] = true;
        result = 0;
        
        dfs(0,1,dest.get(0));
        System.out.println(result);
        
    }

    private static void dfs(int start, int end, int [] pos){

        if(end >= dest.size()) return;
        
        if(pos[0] == dest.get(end)[0] && pos[1] == dest.get(end)[1]){
            
            if(end == dest.size()-1){
                result ++;
                return;
            }
            start ++;
            end ++;
            
        }

        for(int i = 0; i<4; i++){
            
            int mvX = pos[0] + dx[i];
            int mvY = pos[1] + dy[i];
            
            if(mvX < 0 || mvY < 0 || mvX >= n || mvY >= n || visited[mvX][mvY] || board[mvX][mvY] == 1) continue;
            visited[mvX][mvY] = true;
            dfs(start, end, new int[]{mvX,mvY});
            visited[mvX][mvY] = false;
            
        }
    }
}
