import java.util.*;
import java.io.*;

public class IFL_결혼식 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<int []> arr = new ArrayList<>();

        for(int i = 0; i<n; i++){

            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr.add(new int[]{start,0});
            arr.add(new int[]{end,1});

        }

        arr.sort((a,b) -> {
            if(a[0] == b[0]) return b[1] - a[1] ;
            return a[0] - b[0];
        });

        int answer = 0;
        int cnt = 0;

        for(int [] a : arr){
            if(a[1] == 1) cnt --;
            else cnt ++;
            answer = Math.max(cnt,answer);
        }

        System.out.println(answer);

    }

}