import java.util.*;
import java.io.*;

public class IFL_특정문자뒤집기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char [] charArr = br.readLine().toCharArray();
        
        int lt = 0;
        int rt = charArr.length-1;

        while(lt < rt){

            char lCh = charArr[lt];
            char rCh = charArr[rt];

            if(Character.isLetter(lCh) && !Character.isLetter(rCh)) rt --;
            else if(!Character.isLetter(lCh) && Character.isLetter(rCh)) lt ++;
            else if(!Character.isLetter(lCh) && !Character.isLetter(rCh)){
                lt ++;
                rt --;
            }
            else{
                char temp = lCh;
                charArr[lt] = rCh;
                charArr[rt] = temp;
                lt ++;
                rt --;
            }

            /**
            if(!Character.isLetter(lCh)) lt ++;
            else if(!Character.isLetter(rCh)) rt --;
            else{
                char temp = lCh;
                charArr[lt] = rCh;
                charArr[rt] = temp;
                lt ++;
                rt --;
            }
            */

        }

        for(char c : charArr) sb.append(c);
        System.out.println(sb.toString());
        
    }

}