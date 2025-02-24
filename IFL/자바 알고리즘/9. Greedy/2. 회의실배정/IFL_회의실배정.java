import java.util.*;
import java.io.*;

public class IFL_회의실배정 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<int []> arr = new ArrayList<>();

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            arr.add(new int[]{start,end});
        }

        arr.sort((a,b) ->{

            if(a[1] == b[1]) return a[0] - b[0];
            return  a[1] - b[1];

        });

        int endTime = arr.get(0)[1];
        int cnt = 1;

        for(int i = 1; i<arr.size(); i++){
            if(endTime <= arr.get(i)[0]) {
                cnt ++;
                endTime = arr.get(i)[1];
            }
        }

        System.out.println(cnt);

    }

}