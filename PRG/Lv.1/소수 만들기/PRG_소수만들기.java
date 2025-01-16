import java.util.*;

public class PRG_소수만들기 {
    
    private static int cnt;
    
    public int solution(int[] nums) {
        
        if(nums.length <= 2) return 0;
            
        cnt = 0;
        dfs(nums,0,0,0);
        
        return cnt;
        
    }
    
    private static void dfs(int [] nums, int st, int dep , int n){
        
        if(dep == 3){
            if(check(n)) cnt++;
            return;
        }
        
        for(int i = st; i<nums.length; i++){
            dfs(nums, i+1, dep+1, n+nums[i]);
        }
        
    }
    
    private static boolean check(int num){
        
        if(num <= 1) return false;
        
        for(int i = 2; i<= (int) Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        
        return true;
        
    } 
    
}