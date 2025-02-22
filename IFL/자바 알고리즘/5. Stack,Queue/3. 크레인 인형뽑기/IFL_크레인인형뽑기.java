import java.util.*;
import java.io.*;

public class IFL_크레인인형뽑기 {

    private static final int SIZE = 100;
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int [][] board = new int[n+1][n+1];

        int [] dep = new int[n+1];
        Arrays.fill(dep,SIZE);

        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] != 0) dep[j] = Math.min(dep[j],i);
            }
        }

        Deque<Integer> deque = new ArrayDeque<>();

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());
        deque.add(board[dep[first]][first]);
        dep[first]++;
        
        int cnt = 0;

        for(int i = 1; i<m; i++){

            int nowIdx = Integer.parseInt(st.nextToken());
            
            if(dep[nowIdx] > n) continue;
            
            int now = board[dep[nowIdx]][nowIdx];
            dep[nowIdx] ++ ;

            if(!deque.isEmpty() && deque.peekLast() == now){
                cnt ++;
                deque.pollLast();
            }
            else if(!deque.isEmpty() && deque.peekLast() != now) deque.add(now);

        }

        System.out.println(cnt*2);

    }

}