import java.util.*;
import java.io.*;

public class BOJ13549_숨바꼭질3 {

    private static class Pos {
        
        int idx ;
        int t ;

        private Pos(int idx , int t){
            this.idx = idx;
            this.t = t;
        }

    }

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean [] visited = new boolean[100001];
        Deque<Pos> deque = new ArrayDeque<>();
        
        deque.add(new Pos(n, 0));
        
        while(!deque.isEmpty()){

            Pos pos = deque.poll();
            visited[pos.idx] = true;

            if(pos.idx == k){
                System.out.println(pos.t);
                return;
            }
            
            if(pos.idx * 2 <= 100000 && !visited[pos.idx*2]) deque.addFirst(new Pos(pos.idx * 2, pos.t));
            if(pos.idx +1 <= 100000 && !visited[pos.idx+1]) deque.add(new Pos(pos.idx + 1, pos.t+1));
            if(pos.idx -1 >= 0 && !visited[pos.idx-1]) deque.add(new Pos(pos.idx - 1, pos.t+1));

        }

    }
}