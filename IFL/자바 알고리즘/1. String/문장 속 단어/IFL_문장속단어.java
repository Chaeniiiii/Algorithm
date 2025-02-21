import java.util.*;
import java.io.*;

public class IFL_문장속단어 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] strArr = br.readLine().split(" ");

        int maxLen = 0;
        int maxIdx = -1;

        for(int i = 0 ; i<strArr.length; i++){

            int len = strArr[i].length();

            if(len > maxLen){
                maxLen = len;
                maxIdx = i;
            }
            else if(len == maxLen) maxIdx = Math.min(maxIdx,i);
        }

        System.out.println(strArr[maxIdx]);

    }

}