import java.util.*;

public class PRG_추억점수 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int [] result = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i<name.length; i++){
            map.put(name[i],yearning[i]);
        }
        
        for(int i = 0; i<photo.length; i++){
            int sum = 0;
            for(String str : photo[i]){
                if(map.get(str) == null) continue;
                sum+=map.get(str);
            }
            result[i] = sum;
        }
        
        return result;
    }

}