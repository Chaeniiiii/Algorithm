import java.util.*;
import java.io.*;

public class BOJ2178_미로탐색 {

    private static int n,m ;
    private static int [][] board;
    
    private static class Pos{
        
        int x;
        int y;
        int t;

        private Pos(int x, int y, int t){
            this.x = x;
            this.y = y;
            this.t = t;
        }

    }

    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];

        for(int i = 0; i<n; i++){
            String str = br.readLine();
            for(int j = 0; j<m; j++){
                board[i][j] = (int)(str.charAt(j) - '0');
            }
        }

        System.out.println(bfs(0,0));
    }

    static int bfs(int x, int y){

        Deque<Pos> deque = new ArrayDeque<>();
        boolean [][] visited = new boolean[n][m] ;

        int [] dx = {-1,1,0,0};
        int [] dy = {0,0,-1,1};

        deque.add(new Pos(x, y,1));

        int score = 0;
        
        while(!deque.isEmpty()){
            
            Pos mv = deque.poll();
            
            if(mv.x == n-1 && mv.y == m-1) score = mv.t;

            for(int i = 0; i<4; i++){

                int mvX = mv.x + dx[i];
                int mvY = mv.y + dy[i];

                if(mvX < 0 || mvY  < 0 || mvX >= n || mvY >= m || board[mvX][mvY] == 0 || visited[mvX][mvY]) continue;
                
                visited[mvX][mvY] = true;
                deque.add(new Pos(mvX,mvY,mv.t + 1));

            }

        }

        return score;

    }

}