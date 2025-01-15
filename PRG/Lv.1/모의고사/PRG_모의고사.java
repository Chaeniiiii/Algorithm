import java.util.*;

class Solution {
    
    public static int[] solution(int[] answers) {
        
        int [] a = {1,2,3,4,5};
        int [] b =  {2,1,2,3,2,4,2,5};
        int [] c =  {3,3,1,1,2,2,4,4,5,5};
        
        int [] exam = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            
            int ans = answers[i];
            
            if(ans == a[i%5]) exam[0] ++;
            if(ans == b[i%8]) exam[1] ++;
            if(ans == c[i%10]) exam[2] ++;
            
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxCount = Math.max(exam[0], Math.max(exam[1], exam[2]));
        
        for(int i = 0 ;i <3; i ++){
            if(maxCount == exam[i]) result.add(i+1);
        }
        
        int [] ans = new int[result.size()];
        for(int i = 0; i<ans.length; i++) ans[i] = result.get(i);
    
        return ans;
        
        //return result.stream().mapToInt(i->i).toArray();
        
    }
    
}