import java.util.*;
import java.io.*;

public class IFL_공주구하기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 1; i<=n; i++) deque.add(i);

        int cnt = 0;

        while(deque.size() != 1){

            cnt ++;

            if(cnt == m){
                deque.poll();
                cnt = 0;
                continue;
            } 

            deque.add(deque.poll());

        }

        System.out.println(deque.poll());

    }

}