import java.util.*;
import java.io.*;

public class IFL_임시반장정하기 {

    private static final int SIZE = 5;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int [][] cls = new int[n+1][SIZE + 1];

        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=SIZE; j++){
                cls[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int [] stu = new int[n+1];

        int max = Integer.MIN_VALUE;
        int maxIdx = Integer.MAX_VALUE;

        for(int i = 1; i<=n; i++){
            for(int j = i+1; j<=n; j++){
                for(int k = 1; k<=SIZE; k++){
                    if(cls[i][k] == cls[j][k]){
                        stu[i] ++;
                        stu[j] ++;
                        break;
                    }
                }
            }
            if(stu[i] > max){
                max = stu[i];
                maxIdx = i;
            }
        }

        System.out.println(maxIdx);

    }

}