import java.util.*;
import java.io.*;

public class IFL_최대길이연속부분수열 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] number = new int [n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(st.nextToken());

        int lt = 0 ,max = 0;

        Deque<Integer> deque = new ArrayDeque<>();

        for(int rt = 0; rt<n; rt++){

            if(number[rt] == 0){
                if(k > 0){
                    k -- ;
                    deque.add(rt);
                }
                else{
                    int idx = deque.poll();
                    while(lt-1 != idx){
                        lt ++;
                    }
                    deque.add(rt);
                }
            }
            max = Math.max(max,rt-lt+1);
        }
        
        System.out.println(max);

    }

}