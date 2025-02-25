import java.util.*;
import java.io.*;

public class IFL_최대수입스케쥴 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<int []> arr = new ArrayList<>();

        for(int i = 0 ; i<n; i++){
            st = new StringTokenizer(br.readLine());
            
            int money = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());

            arr.add(new int[]{money,day});
        }

        arr.sort((a,b) -> b[1] - a[1]);

        int maxTime = arr.get(0)[1];
        int cnt = 0;

        for(int [] a : arr){
            pq.add(a[0]);
            if(a[1] != maxTime) {
                maxTime = a[1];
                cnt += pq.poll();
            }
        }

        System.out.println(cnt+pq.poll());

    }
    
}