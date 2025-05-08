import java.io.*;
import java.util.*;

public class SFT_성적평가 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine()); 
        
        int [] total = new int[n];
        int [][] result = new int[4][n];

        Map<Integer,ArrayList<Integer>> map = new TreeMap<>(Comparator.reverseOrder());
        
        for(int i = 0; i<3; i++){
            
            st = new StringTokenizer(br.readLine());
            map.clear();
            
            for(int j = 0; j<n; j++){
                int num = Integer.parseInt(st.nextToken());
                map.computeIfAbsent(num, v -> new ArrayList<>()).add(j);
                total[j] += num;
            }

            result[i] = setGrade(n,map);
            
        }

        map.clear();
        for(int i = 0; i<n; i++){
            map.computeIfAbsent(total[i], v -> new ArrayList<>()).add(i);
        }

        result[3] = setGrade(n,map);

        for(int i = 0; i<4; i ++){
            for(int j = 0; j<n; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        
    }

    private static int [] setGrade(int n , Map<Integer,ArrayList<Integer>> map){
        
        int grade = 1;
        int [] answer = new int[n];
        
        for(int key : map.keySet()){
            for(int val : map.get(key)) answer[val] = grade;
            grade+= map.get(key).size();
        }

        return answer;
        
    }
}
