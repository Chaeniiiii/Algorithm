import java.util.*;
import java.io.*;

public class IFL_뮤직비디오 {

    private static int n,m,min;
    private static int [] num;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        num = new int[n];
        st = new StringTokenizer(br.readLine());

        int lt = 0, rt = 0;
        for(int i = 0; i<n; i++) {

            num[i] = Integer.parseInt(st.nextToken());
            lt = Math.max(lt,num[i]);
            rt += num[i];

        }; 

        min = Integer.MAX_VALUE;
        while(lt <= rt){

            int mid = (lt + rt)/2;

            if(check(mid)){
                rt = mid-1;
               
            }
            else lt = mid+1;

        }

        System.out.println(min);

    }

    private static boolean check(int cnt){

        int total = 1;
        int score = 0;

        for(int i = 0; i<n; i++){
            if(score + num[i] > cnt){
                total ++;
                score = 0;
            }
            score += num[i];
        }

        if(total <= m){
            min = Math.min(min,cnt);
            return true;
        }

        return false;

    }

}