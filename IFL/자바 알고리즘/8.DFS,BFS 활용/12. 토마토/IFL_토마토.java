import java.util.*;
import java.io.*;

public class IFL_토마토 {

    private static int n,m,ripe;

    private static int [][] tomatos;

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
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        tomatos = new int[m][n];
        Deque<Pos> deque = new ArrayDeque<>();

        for(int i = 0 ; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                tomatos[i][j] = Integer.parseInt(st.nextToken());
                if(tomatos[i][j] == 1) deque.add(new Pos(i,j));
                else if (tomatos[i][j] == 0) ripe ++;
            }
        }

        System.out.println(ripe == 0 ? 0 : bfs(deque));

    }

    private static int bfs(Deque<Pos> deque){
        
        int [] dx = {-1,1,0,0};
        int [] dy = {0,0,-1,1};

        int day = 0;

        while(!deque.isEmpty()){

            int size = deque.size();
            day ++;

            for(int i = 1; i<=size; i++){

                Pos mv = deque.poll();  
                if(ripe == 0) return day;

                for(int k = 0; k<4; k++){
                    
                    int mvX = mv.x + dx[k];
                    int mvY = mv.y + dy[k];

                    if(mvX < 0 || mvY < 0 || mvX >= m || mvY >= n || tomatos[mvX][mvY] != 0) continue;
                    
                    tomatos[mvX][mvY] = 1;
                    deque.add(new Pos(mvX,mvY));
                    ripe --;
                    
                }

            }

        }

        return ripe > 0 ? -1 : day ;
    }

}
