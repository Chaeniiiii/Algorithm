import java.util.*;
import java.io.*;

public class BOJ7576_토마토 {

    private static int n,m;
    private static int [][] box;

    private static int unripe;

    private static class Pos{
       
        int x;
        int y;
        int day;

        private Pos(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }

    }

    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];
        Deque<Pos> deque = new ArrayDeque<>();
        boolean [][] visited = new boolean[n][m];

        unripe = 0; //익지 않은 토마토의 개수;

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 0) unripe++;
                else if(box[i][j] == 1) {
                    deque.add(new Pos(i,j,0));
                    visited[i][j] = true;
                }
            }
        }

        if(unripe == 0){
            System.out.println(0);
            return;
        }

        int cnt = bfs(deque,visited);
        System.out.println(unripe > 0 ? -1 : cnt);
        
    }

    private static int bfs(Deque<Pos> deque, boolean [][] visited){

        int [] dx = {-1,1,0,0};
        int [] dy = {0,0,-1,1};

        int day = 0;

        while(!deque.isEmpty()){

            Pos mv = deque.poll();
            day = mv.day;

            for(int i = 0; i<4; i++){
                
                int mvX = mv.x+dx[i];
                int mvY = mv.y+dy[i];
                
                if(mvX < 0 || mvY < 0 || mvX >= n || mvY >= m || box[mvX][mvY] == -1 || visited[mvX][mvY]) continue;
                
                unripe --;
                visited[mvX][mvY] = true;
                deque.add(new Pos(mvX,mvY,mv.day+1));

            }

        }

        return day;
    }

}