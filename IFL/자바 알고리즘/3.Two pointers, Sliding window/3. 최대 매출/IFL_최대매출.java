import java.util.*;
import java.io.*;

public class IFL_최대매출 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] mny = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<n; i++){
            mny[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = left + k;

        int cnt = 0;
        for(int i = left; i<right; i++) cnt+= mny[i];

        int max = cnt;

        while(right < n){
            
            cnt = cnt + mny[right]-mny[left];
            max = Math.max(max,cnt);
            
            right ++;
            left ++;

        }

        System.out.println(max);

    }

}