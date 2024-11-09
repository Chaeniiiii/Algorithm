import java.util.*;

public class PRG_삼총사 {
    
    private static boolean [] visited;
    private static int total;
    
    public static void dfs(int st, int dep , int cnt , int [] number){
        
        if(dep == 3){
            if(cnt == 0) total ++;
            return;
        }
        
        for(int i = st; i<number.length; i++){
            
            if(!visited[i]){
                visited[i] = true;
                dfs(i,dep+1,cnt+number[i],number);
                visited[i] = false;
            }
        }
        
        return;
    }
    
    public int solution(int[] number) {
               
        visited = new boolean [number.length];
        dfs(0,0,0,number);
        
        return total;
        
    }

    public static void main(String[] args) {
        
        PRG_삼총사 prg = new PRG_삼총사();
        
        System.out.println(prg.solution(new int[] {-2,3,0,2,-5}));

    }
}