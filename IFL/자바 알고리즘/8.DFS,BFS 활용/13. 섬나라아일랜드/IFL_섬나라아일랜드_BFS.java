import java.util.*;
import java.io.*;

public class IFL_섬나라아일랜드_BFS {

    private static int n;

    private static int [][] board;
    private static boolean [][] visited;

    private static int [] dx = {-1,1,0,0,-1,-1,1,1};
    private static int [] dy = {0,0,-1,1,-1,1,-1,1};

    private static class Pos {
        int x;
        int y;
        private Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        visited = new boolean[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                if(visited[i][j] || board[i][j] == 0) continue;

                visited[i][j] = true;
                bfs(new Pos(i,j));
                cnt ++;

            }
        }

        System.out.println(cnt);

    }

    private static void bfs(Pos pos){

        Deque<Pos> deque = new ArrayDeque<>();
        deque.add(pos);

        while(!deque.isEmpty()){

            Pos mv = deque.poll();

            for(int i = 0; i<8; i++){
            
                int mvX = mv.x + dx[i];
                int mvY = mv.y + dy[i];
    
                if(mvX < 0 || mvX >= n || mvY < 0 || mvY >= n || visited[mvX][mvY] || board[mvX][mvY] == 0 ) continue;
    
                visited[mvX][mvY] = true;
                deque.add(new Pos(mvX,mvY));
            }


        }
        

    }

}
