import java.util.*;
import java.io.*;

public class BOJ1138_한줄로서기 {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); //사람의 수 
        int [] seq = new int[n+1]; //순서대로 줄을 선 사람들의 키

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i<=n; i++){

            int order = Integer.parseInt(st.nextToken()); //자기보다 키가 큰 사람이 왼쪽에 몇 명 있는지 
            int cnt = 0; //현재까지 자신보다 큰 사람 

            for(int j = 1; j<=n ; j++){
                if(cnt == order && seq[j] == 0) {
                    seq[j] = i;
                    break;
                }
                if(seq[j] == 0 || seq[j] > i) cnt ++;
            }

        }

        for(int i = 1; i<=n; i++){
            sb.append(seq[i]).append(" ");
        }

        System.out.println(sb.toString());
        
    }
}