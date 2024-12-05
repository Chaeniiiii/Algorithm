import java.util.*;

public class PRG_로또의최고순위와최저순위 {

    public int[] solution(int[] lottos, int[] win_nums) {
        
        int [] rank = new int[]{6,6,5,4,3,2,1};
        boolean [] winNum = new boolean[46];
        
        for(int num : win_nums) winNum[num] = true;
    
        int unKnown = 0;
        int known = 0;
        
        for(int lotto : lottos){
            
            if(lotto == 0) unKnown++;
            else if(winNum[lotto]) known++;
            
        }
        
        return new int []{rank[unKnown+known],rank[known]};
    }

}