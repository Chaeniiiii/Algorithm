import java.util.*;
import java.io.*;

public class IFL_씨름선수 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int n = Integer.parseInt(br.readLine());

        ArrayList<int []> arr = new ArrayList<>();

        for(int i = 0; i<n; i++){

            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arr.add(new int[]{t,w});

        }

        arr.sort((a,b) -> b[0] - a[0]);

        int maxTall = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i = 0; i<n; i++){
            if(maxTall < arr.get(i)[1]){
                cnt ++;
                maxTall = arr.get(i)[1];
            }
        }

        System.out.println(cnt);
        
    }

}