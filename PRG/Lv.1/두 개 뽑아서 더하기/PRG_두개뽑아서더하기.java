import java.util.*;

public class PRG_두개뽑아서더하기 {
    
    static boolean [] visited ;
    static Set<Integer> set;
    
    public static void dfs(int st , int dep, int [] numbers, int cnt){
        
        if(dep == 2){
            set.add(cnt);
            return;
        }
        
        for(int i = st; i<numbers.length; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i,dep+1,numbers,cnt+numbers[i]);
                visited[i] = false;
            }
        }
    }
    
    public int[] solution(int[] numbers) {
        
        visited = new boolean [numbers.length];
        set = new TreeSet<>();
        
        dfs(0,0,numbers,0);
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}