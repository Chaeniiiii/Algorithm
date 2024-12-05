import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PRG_대충만든자판{

    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(String str : keymap){
            for(int i = 0; i<str.length(); i++){
                char c = str.charAt(i);
                map.put(c,Math.min(i+1, map.getOrDefault(c, Integer.MAX_VALUE)));
            }
        }
        
        for(int i = 0; i<targets.length; i++){
            for(char c : targets[i].toCharArray()){
                if(map.get(c) == null){
                    answer[i] = -1;
                    break;
                }
                else answer[i]+=map.get(c);
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}