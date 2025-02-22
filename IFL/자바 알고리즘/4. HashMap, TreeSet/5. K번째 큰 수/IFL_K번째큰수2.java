import java.util.*;
import java.io.*;

public class IFL_K번째큰수2 {

    private static final int SIZE = 3;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] number = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(st.nextToken());

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                for(int v = j+1; v<n; v++){
                    treeSet.add(number[i]+number[j]+number[v]);
                }
            }
        }

        int cnt = 0;

        for(int x : treeSet){
            cnt ++;
            if(cnt == k){
                System.out.println(x);
                return;
            }
        }

        System.out.println(-1);
    }


}