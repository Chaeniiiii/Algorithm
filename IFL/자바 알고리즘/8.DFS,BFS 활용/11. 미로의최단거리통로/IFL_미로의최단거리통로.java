import java.util.*;
import java.io.*;

public class IFL_미로의최단거리통로 {

    private static final int SIZE = 7;
    private static int [][] board;

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

        board = new int[SIZE+1][SIZE+1];

        for(int i = 1; i<=SIZE; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=SIZE; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs(new Pos(1,1),new Pos(SIZE,SIZE)));

    }

    private static int bfs(Pos start, Pos end){

        int [] dx = {-1,1,0,0};
        int [] dy = {0,0,-1,1};

        Deque<Pos> deque = new ArrayDeque<>();
        boolean [][] visited = new boolean[SIZE+1][SIZE+1];

        deque.add(start);
        visited[start.x][start.y] = true;

        int t = 0;
        
        while(!deque.isEmpty()){

            int len = deque.size();
            
            for(int i = 0; i<len; i++){
                
                Pos mv = deque.poll();

                for(int k = 0; k<4; k++){

                    int mvX = mv.x + dx[k];
                    int mvY = mv.y + dy[k];

                    if(mvX <= 0 || mvX > SIZE || mvY <= 0 || mvY > SIZE || visited[mvX][mvY] || board[mvX][mvY] == 1) continue;

                    if(mvX == end.x && mvY == end.y) return t+1;

                    visited[mvX][mvY] = true;
                    deque.add(new Pos(mvX,mvY));
                    
                }
            }
            
            t++;

        }

        return -1;

    }

}
