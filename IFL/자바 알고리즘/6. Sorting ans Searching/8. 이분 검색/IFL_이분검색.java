import java.util.*;
import java.io.*;

public class IFL_이분검색 {

    public static void main(String [] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [] num = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) num[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(num);

        int left = 0, right = n;

        while(left <= right){

            int mid = (left + right)/2;

            if(num[mid] == m){
                System.out.println(mid+1);
                return;
            }
            else if(num[mid] < m){
                left = mid+1;
            }
            else right = mid-1;

        }

    }

}