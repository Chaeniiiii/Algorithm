import java.util.*;
import java.io.*;

public class IFL_미로탐색 {

    private static final int SIZE = 7;

    private static int cnt;

    private static int [][] board;
    private static boolean [][] visited;

    private static int [] dx = {-1,1,0,0};
    private static int [] dy = {0,0,-1,1};

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

        cnt = 0;
        visited = new boolean[SIZE+1][SIZE+1];
        visited[1][1] = true;
        
        dfs(new Pos(1,1),new Pos(SIZE,SIZE));

        System.out.println(cnt);

    }

    private static void dfs(Pos start, Pos end){

        if(start.x == end.x && start.y == end.y){
            cnt ++;
            return;
        }

        for(int i = 0; i<4; i++){

            int mvX = start.x + dx[i];
            int mvY = start.y + dy[i];

            if(mvX <= 0 || mvY <= 0 || mvX > SIZE || mvY > SIZE || visited[mvX][mvY] || board[mvX][mvY] == 1) continue;

            visited[mvX][mvY] = true;
            dfs(new Pos(mvX,mvY),end);
            visited[mvX][mvY] = false;

        }

    }

}