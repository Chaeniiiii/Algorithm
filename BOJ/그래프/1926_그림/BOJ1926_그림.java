import java.util.*;
import java.io.*;

public class BOJ1926_그림 {

    private static int n,m;

    private static int [][] board;
    private static boolean [][] visited;

    private static int [] dx = {-1,1,0,0};
    private static int [] dy = {0,0,-1,1};

    private static int cnt = 0 ;
    private static int maxS = 0;


    static class Pos{
        int x ;
        int y ;
        public Pos(int x , int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0 ;i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(visited[i][j] || board[i][j] == 0) continue;
                visited[i][j] = true;
                bfs(i,j);
                cnt ++;
            }
        }

        System.out.println(cnt);
        System.out.println(maxS);

    }

    private static void bfs(int x, int y){

        Deque<Pos> deque = new ArrayDeque<>();
        deque.add(new Pos(x,y));

        int s = 0;

        while(!deque.isEmpty()){

            Pos mv = deque.poll();
            s ++;
            
            for(int i = 0; i<4; i++){
                
                int mvX = mv.x + dx[i];
                int mvY = mv.y + dy[i];
                
                if(mvX < 0 || mvY < 0 || mvX >= n || mvY >= m || board[mvX][mvY] == 0 || visited[mvX][mvY]) continue;
                
                visited[mvX][mvY] = true;
                deque.add(new Pos(mvX, mvY));

            }

        }

        maxS = Math.max(s, maxS);

    }

}