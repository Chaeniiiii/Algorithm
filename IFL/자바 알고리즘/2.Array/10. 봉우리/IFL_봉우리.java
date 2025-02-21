import java.util.*;
import java.io.*;

public class IFL_봉우리 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [][] board = new int[n][n];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }

        int [] dx = {-1,1,0,0};
        int [] dy = {0,0,-1,1};

        int cnt = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                int now = board[i][j];
                boolean check = false;

                for(int k = 0; k<4; k++){
                    int mvX = i + dx[k];
                    int mvY = j + dy[k];

                    if(mvX < 0 || mvY < 0 || mvX >=n || mvY >= n) continue;
                    if(board[mvX][mvY] >= now){
                        check = true;
                        break;
                    }
                }

                if(!check) cnt ++;

            }
        }

        System.out.println(cnt);

    }

}