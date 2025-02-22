import java.util.*;
import java.io.*;

public class IFL_최대길이연속부분수열2 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] number = new int [n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(st.nextToken());

        int lt = 0 ,max = 0, cnt = 0;

        for(int rt = 0; rt<n; rt++){

            if(number[rt] == 0) cnt ++;
            while(cnt > k){
                if(number[lt] == 0) cnt --;
                lt ++;
            }

            max = Math.max(max,rt-lt+1);
        }
        
        System.out.println(max);

    }

}