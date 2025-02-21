import java.util.*;
import java.io.*;

public class IFL_등수구하기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [] stu = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=n; i++){
            stu[i] = Integer.parseInt(st.nextToken());
        }

        int [] grd = new int[n+1];
        Arrays.fill(grd,1);

        for(int i = 1; i<=n; i++){
            int now = stu[i];
            for(int j = 1; j<=n; j++){
                if(i == j) continue;
                if(now < stu[j]) grd[i] ++ ;
            }
        }

        for(int i = 1; i<=n; i++) System.out.printf("%d ",grd[i]);

    }

}