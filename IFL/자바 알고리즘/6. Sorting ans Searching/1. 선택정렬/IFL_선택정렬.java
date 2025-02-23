import java.util.*;
import java.io.*;

public class IFL_선택정렬 {

    private static int n;
    private static ArrayList<Integer> arr;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arr = new ArrayList<>();

        for(int i = 0; i<n; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        selectSort();
        for(int i : arr) sb.append(i).append(" ");

        System.out.println(sb.toString());

    }

    private static void selectSort(){

        for(int i = 0; i<n; i++){

            int min = Integer.MAX_VALUE, minIdx = -1;

            for(int j = i; j<n; j++){
                if(min > arr.get(j)){
                    min = arr.get(j);
                    minIdx = j;
                }
            }

            if(i != minIdx){
                int temp = arr.get(i);
                arr.set(i,min);
                arr.set(minIdx,temp);
            }

        }
        
    }

}
