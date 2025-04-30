import java.io.*;
import java.util.*;

public class SFT_함께하는효도 {

    private static ArrayList<Pos> frd;
    
    private static int [][] board;

    private static int [] dx = {-1,1,0,0};
    private static int [] dy = {0,0,-1,1};

    private static int n,m;
    private static int total;
    
    private static class Pos {
        
        int x;
        int y;
        
        private Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
        
    }
    
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); //격자 크기 n*n
        m = Integer.parseInt(st.nextToken()); //인원 수

        board = new int[n][n];

        //열매 수확량 채우기
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // visited = new boolean[n][n]; //수확 여부 체크 배열 
        frd = new ArrayList<>();

        total = 0;
        //남우와 친구들 위치 입력받은 후 열매 수확
        for(int i = 0; i<m ; i++){

            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            total += board[x-1][y-1];
            board[x-1][y-1] = 0;
            
            frd.add(new Pos(x-1,y-1));
            
        }

        Pos start = frd.get(0);
        dfs(start,0,0,total);

        System.out.println(total);
        
    }

    private static void dfs(Pos pos, int idx, int dep, int cnt){

        if(dep > 3) return;
        
        total = Math.max(total,cnt);  
        if(idx + 1 < m){
            Pos nextStart = frd.get(idx+1);
            dfs(nextStart,idx+1,0,cnt);      
        }
        
        for(int i = 0; i<4; i++){
            
            int mvX = pos.x + dx[i];
            int mvY = pos.y + dy[i];
            
            if(mvX < 0 || mvY < 0 || mvX >= n || mvY >= n) continue;
            int value = board[mvX][mvY];
            board[mvX][mvY] = 0;
            dfs(new Pos(mvX,mvY), idx, dep+1,cnt+value);
            board[mvX][mvY] = value;
            
        }

    }

}
