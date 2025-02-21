import java.util.*;
import java.io.*;

public class IFL_가장짧은문자거리 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<>();

        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c) arr.add(i);
        }

        int idx = 0;
        int startIdx = -1;
        
        while(idx < arr.size()-1){

            int len = (arr.get(idx+1) - arr.get(idx))/2;
            int nowIdx = arr.get(idx);

            for(int i = startIdx +1 ; i <= nowIdx + len; i++){
                sb.append(Math.abs(nowIdx-i)).append(" ");
            }
            
            idx ++;

        }

        System.out.println(sb.toString());
        

    }

}