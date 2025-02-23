import java.util.*;
import java.io.*;

public class IFL_좌표정렬 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<int []> pos = new ArrayList<>();

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            pos.add(new int[]{a,b});

        }

        pos.sort((a,b) ->{
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        for(int [] p : pos){
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }

        System.out.println(sb.toString());

    }

}