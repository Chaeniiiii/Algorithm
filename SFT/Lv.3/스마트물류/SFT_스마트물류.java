import java.io.*;
import java.util.*;

public class SFT_스마트물류 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        
        Deque<Integer> robot = new ArrayDeque<>();
        Deque<Integer> equim = new ArrayDeque<>();
        
        int cnt = 0;
        
        for(int i = 0; i<n; i++){
            
            if(str.charAt(i) == 'H') equim.add(i);
            else robot.add(i);

        }

        while(!robot.isEmpty()){
            
            int now = robot.poll();

            while(!equim.isEmpty()){

                int e = equim.poll();

                if(e - now > k){
                    equim.addFirst(e);
                    break;
                }
                
                if(Math.abs(e - now) <= k){
                    cnt ++;
                    break;
                }
            }
            
        }
        
        System.out.println(cnt);
        
    }
}
