import java.util.*;
import java.io.*;

public class IFL_보이는학생 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [] stu = new int[n];

        st = new StringTokenizer(br.readLine());
        stu[0] = Integer.parseInt(st.nextToken());

        int maxT = stu[0];
        int cnt = 1;

        for(int i = 1; i<n; i++){
            stu[i] = Integer.parseInt(st.nextToken());
            if(stu[i] > maxT){
                cnt ++;
                maxT = stu[i];
            }
        }

        System.out.println(cnt);

    }

}