import java.util.*;
import java.io.*;

public class IFL_연속부분수열 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int [] number = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(st.nextToken());

        int lt=0 , answer = 0, cnt = 0;

        for(int rt = 0; rt<n; rt ++){

            cnt += number[rt];
            if(cnt == m) answer ++;
            
            while(cnt >= m){
                cnt -= number[lt++];
                if(cnt == m) answer ++;
            }

        }

        System.out.println(answer);


    }

}